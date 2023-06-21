param name string
param location string = 'Korea Central'

module db './db.bicep' = {
  name: 'db'
  scope: resourceGroup()
  params: {
    environmentName: name
    location: location
  }
}

module appservice './appservice.bicep' = {
  name: 'appservice'
  scope: resourceGroup()
  params: {
    appName: name
    location: location
  }
}
