param environmentName string
param location string

resource mySqlServer 'Microsoft.DBforMySQL/servers@2017-12-01' = {
  name: '${environmentName}-db'
  location: location
  sku: {
    name: 'B_Gen5_1'
    tier: 'Basic'
    capacity: 1
    family: 'Gen5'
  }
  properties: {
    version: '8.0'
    sslEnforcement: 'Disabled'
    storageProfile: {
      storageMB: 5120
    }
    createMode: 'Default'
    administratorLogin: 'adminuser'
    administratorLoginPassword: 'password123!!'
    publicNetworkAccess: 'Enabled'
  }

  resource firewall_all 'firewallRules' = {
    name: 'allow-all-IPs'
    properties: {
      startIpAddress: '0.0.0.0'
      endIpAddress: '255.255.255.255'
    }
  }
}

resource mySqlDatabase 'Microsoft.DBforMySQL/servers/databases@2017-12-01' = {
  parent: mySqlServer
  name: 'deps'
  properties: {
    charset: 'utf8mb4'
    collation: 'utf8mb4_unicode_ci'
  }
}

output mySqlServerName string = mySqlServer.name
output mySqlDatabaseName string = mySqlDatabase.name
