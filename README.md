# Get It - DEPS (Daegu Electric-car Platform Service)

해커그라운드 해커톤에 참여하는 Get It 팀의 DEPS (Daegu Electric-car Platform Service) 입니다.

## 제품/서비스 소개

<!-- 아래 링크는 지우지 마세요 -->
[제품/서비스 소개 보기](TOPIC.md)
<!-- 위 링크는 지우지 마세요 -->

## 오픈 소스 라이센스

<!-- 아래 링크는 지우지 마세요 -->
[오픈소스 라이센스 보기](./LICENSE)
<!-- 위 링크는 지우지 마세요 -->

## 설치 방법
### 사전 준비 사항

- GitHub Account
- Visual Studio Code
- GitHub CLI
- Azure CLI
- Azure Developer CLI
- Azure Account
- Azure Resource Group
- Node.js v18 or latest
- Npm v7 or latest

## 시작하기
1. 이 레포지트리를 포크합니다
2. 다음과 같이 에저를 프로비저닝 합니다. (윈도우 기준)
```ps1
$RANDOM_KEY = $(New-Guid).Guid
$AZURE_ENV_NAME = "hg$(Get-Random -Max 9999)"
$AZURE_LOCATION = "koreacentral"
$AZURE_RESOURCE_GROUP="{{자신의 리소스 그룹}}"

azd auth login
azd init -e $AZURE_ENV_NAME
azd env set AZURE_ENV_NAME $AZURE_ENV_NAME
azd env set AZURE_LOCATION $AZURE_LOCATION
azd env set AZURE_RESOURCE_GROUP $AZURE_RESOURCE_GROUP
azd config set alpha.resourceGroupDeployments on
azd up
```
3. 다음과 같이 github workflow 시크릿을 설정합니다. (윈도우 기준)
```ps1
$GITHUB_USERNAME = "{{자신의 GitHub ID}}"
az webapp deployment list-publishing-profiles --name "$AZURE_ENV_NAME-app" --resource-group $AZURE_RESOURCE_GROUP --xml > publish_profile.xml

gh auth login
gh secret set AZURE_APP_NAME --repo $GITHUB_USERNAME/Get-It --body "$AZURE_ENV_NAME"
cat publish_profile.xml | gh secret set AZURE_WEBAPP_PUBLISH_PROFILE --repo $GITHUB_USERNAME/Get-It
```
4. 다음과 같이 github actions workflow를 실행합니다. (윈도우 기준)
```ps1
gh workflow run "Azure Deployment" --repo $GITHUB_USERNAME/Get-It
```
5. 배포가 완료될때까지 기다립니다. (10분 가량 소요됩니다.)
6. 다음과 같이 백엔드 배포를 확인합니다.
```ps1
iwr https://$AZURE_ENV_NAME-app.azurewebsites.net/api/charger
```
