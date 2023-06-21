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
      appCommandLine: 'java -jar /home/site/wwwroot/app.jar'
      appSettings: [
        {
          name: 'JAVA_OPTS'
          value: '-XX:+UseContainerSupport -XX:MaxRAMPercentage=75'
        }
        {
          name: 'DATABASE_URL'
          value: 'jdbc:mysql://${appName}-db.mysql.database.azure.com/deps'
        }
        {
          name: 'DATABASE_USERNAME'
          value: 'adminuser@${appName}-db'
        }
        {
          name: 'DATABASE_PASSWORD'
          value: 'password123!!'
        }
      ]
      linuxFxVersion: 'JAVA|17-java17'
    }
  }
}
