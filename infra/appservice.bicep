param appName string
param location string

resource appServicePlan 'Microsoft.Web/serverfarms@2021-02-01' = {
  name: '${appName}-appserviceplan'
  location: location
  sku: {
    name: 'B1'
    tier: 'Basic'
  }
  properties: {
    reserved: true
    hyperV: false
    numberOfWorkers: 1
    perSiteScaling: false
    maximumElasticWorkerCount: 1
    isSpot: false
    isXenon: false
  }
}

resource webApp 'Microsoft.Web/sites@2021-02-01' = {
  name: '${appName}-app'
  location: location
  properties: {
    serverFarmId: appServicePlan.id
    siteConfig: {
      appCommandLine: 'java -jar /home/site/wwwroot/app.jar --spring.datasource.url=jdbc:mysql://${appName}-db.mysql.database.azure.com/deps --spring.datasource.username=adminuser@${appName}-db --spring.datasource.password=password123!! --spring.jpa.properties.hibernate.ddl-auto=create --spring.sql.init.mode=always --spring.sql.init.data-locations=classpath:data.sql --spring.sql.init.encoding=UTF-8'
      linuxFxVersion: 'JAVA|17-java17'
    }
  }
}
