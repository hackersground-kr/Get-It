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
- Azure Free Account
- Visual Studio Code
- GitHub CLI
- Azure CLI
- Azure Developer CLI
- Azure Resource Group

## 시작하기
1. 이 레포지트리를 포크합니다
2. 다음과 같이 에저를 프로비저닝 합니다. (윈도우 기준)
```ps1
$RANDOM_KEY = $(New-Guid).Guid
$AZURE_ENV_NAME = "hg$(Get-Random -Max 9999)"
$AZURE_LOCATION = "koreacentral"
$AZURE_RESOURCE_GROUP="rg-hg-httpsgithubcomhackersground-krGet-It"

azd auth login
azd init -e $AZURE_ENV_NAME
azd env set AZURE_ENV_NAME $AZURE_ENV_NAME
azd env set AZURE_LOCATION $AZURE_LOCATION
azd env set AZURE_RESOURCE_GROUP $AZURE_RESOURCE_GROUP
azd up
```
3. 다음과 같이 github workflow 시크릿을 설정합니다. (윈도우 기준)
```ps1
$GITHUB_USERNAME = "{{자신의 GitHub ID}}"

gh secret set AZURE_APP_NAME --repo $GITHUB_USERNAME/Get-It --body "$(AZURE_ENV_NAME)"
gh secret set AZURE_WEBAPP_PUBLISH_PROFILE --repo $GITHUB_USERNAME/Get-It --body "$(az webapp deployment list-publishing-profiles --name $AZURE_ENV_NAME --resource-group $AZURE_RESOURCE_GROUP --xml)"
```
4. 다음과 같이 github workflow를 실행합니다. (윈도우 기준)
```ps1
gh workflow run "Azure Deployment" --repo $GITHUB_USERNAME/Get-It
```
