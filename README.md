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
- Node js
- npm
- expo
- Android Virtual Device or IOS Simulator or Physical Device

### 백엔드 시작하기
> **Info**. Github Actions와 Bicep을 사용하였습니다!

1. 이 리포지토리를 포크하고 다음 명령어로 클론합니다.
```ps1
$GITHUB_USERNAME = "{{자신의 GitHub ID}}"
git clone https://github.com/$GITHUB_USERNAME/Get-It.git
cd Get-It
```
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
az webapp deployment list-publishing-profiles --name "$AZURE_ENV_NAME-app" --resource-group $AZURE_RESOURCE_GROUP --xml > publish_profile.xml

gh auth login
gh secret set AZURE_APP_NAME --repo $GITHUB_USERNAME/Get-It --body "$AZURE_ENV_NAME"
cat publish_profile.xml | gh secret set AZURE_WEBAPP_PUBLISH_PROFILE --repo $GITHUB_USERNAME/Get-It
```
4. 포크한 리포지토리의 Github Actions를 활성화 해줍니다.
```
https://github.com/{{자신의 Github ID}}/Get-It/actions
에 접속해 초록색 Enable 버튼 클릭
```
5. 다음과 같이 github actions workflow를 실행합니다. (윈도우 기준)
```ps1
gh workflow run "Azure Deployment" --repo $GITHUB_USERNAME/Get-It
```
6. 배포가 완료될때까지 기다립니다. (10분 가량 소요됩니다.)
7. 다음과 같이 백엔드 배포를 확인합니다.
```ps1
iwr https://$AZURE_ENV_NAME-app.azurewebsites.net/api/charger
```
### 프론트엔드 시작하기
1. 이 리포지토리에 있는 Frontend Branch를 clone 합니다
```ps1
git clone --branch Frontend https://github.com/hackersground-kr/Get-It.git
```
2. 다음과 링크에 접속해서 Node js LTS 버전을 설치해줍니다 (Node js 18.x 이여야합니다)
```ps1
https://nodejs.org/en
```
3. 자동적으로 환경변수 세팅이 되지만 터미널에 node -v 를 입력하여 설치가 제대로 되었는지 확인합니다
```ps1
node -v
```
4. 터미널에서 clone한 repository로 이동하여 node package manager를 사용해 라이브러리를 설치해줍니다
```ps1
cd Get-It
npm i
```
5. 패키지 설치가 완료될때까지 기다립니다. (10분 가량 소요됩니다.)
6. 설치가 완료되면 expo를 실행시켜 배포를 활성화 합니다
```ps1
npx expo start
```
7. 배포가 완료된 상황에서 android 가상머신을 실행후에 'a'를 입력하면 배포 및 실행이 진행됩니다
8. 'i'를 입력하면 ios 가상머신으로 실행됩니다.
9. Physical Device로 실행 하기 위해서는 같은 네트워크에 연결된 환경에서 스마트폰에 expo 앱을 설치하고 생성된 QR을 찍으면 앱이 배포됩니다.
10.  중간에 앱이 멈췄다면 터미널에서 'r'키를 눌러서 reload를 해주면 됩니다

