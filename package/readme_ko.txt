# VRCNicoNicoPlaylistConverter
booth 설명과 거의 동일한 내용이지만 이 파일을 읽어주신 분들을 위해 약간 덧붙였습니다.

## 이게 뭐죠
니코니코 동영상의 플레이리스트를 VRC 비디오 플레이어의 플레이리스트 형식으로 변환하는 도구입니다.

## 사용법
### 실행
Windows에서는 start(.bat) 파일을 더블클릭하세요.
Linux에서는 start_forLinux.sh에 실행 권한을 부여한 후 실행하세요.

### 로그인
니코동 이메일과 비밀번호를 입력해 로그인하세요.
이중 인증도 지원하지만, 이런 잘 모르는 도구에 메인 계정을 사용하면 안 됩니다.

### 출력
화면의 안내에 따라 입력 및 선택을 진행하세요.


## 동작 확인된 비디오 플레이어
iwaSync (v3.7.1 이상)
- Kinel式(りら式) (v2.5.5 이상)
- YamaPlayer (v1.5.16 이상)
- VizVid (v1.4.11 이상)
- あやぷれいやー2 (β1.0.0 이상)

다음은 보너스 기능으로 지원됩니다:
- Sliden
- UnaSlides

## 이 파일을 읽어주신 분 한정
input.txt에 URL 또는 파일명을 입력하고
output_site.txt에 아래 항목 중 하나를 입력하고
output_mode.txt에 nicovrc.net 또는 tool.suzumebachi.xyz를 입력한 뒤 저장하고 실행하면 자동 생성 모드가 시작됩니다.

### output_site.txt목록
iwaSync (json 형식)
iwaSync (prefab 형식)
KineL式(りら式) (prefab 형식)
YamaPlayer (json 형식)
YamaPlayer (v1,prefab 형식)
YamaPlayer (v2,prefab 형식)
VizVid (json 형식)
あやぷれいやー2 (json 형식)
Sliden
UnaSlides