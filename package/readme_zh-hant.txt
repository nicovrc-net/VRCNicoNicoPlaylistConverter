# VRCNicoNicoPlaylistConverter
內容與 booth 的說明幾乎相同，但為閱讀此檔案的人做了少量補充。

## 這是什麼
一個將 Nico Nico 影片的播放清單轉換為 VRC 影片播放器播放清單格式的工具。

## 使用方法
### 啟動
在 Windows 上雙擊 start(.bat) 檔案。
在 Linux 上為 start_forLinux.sh 加上執行權限後啟動。

### 登入
輸入 NicoNico 的電子郵件與密碼登入。
* 支援兩步驟驗證，但不要在這種來源不明的工具上使用你的主帳號。

### 輸出
依照畫面說明進行輸入與選擇。


## 動作確認 影片播放器
- iwaSync (v3.7.1及以上)
- Kinel式(りら式) (v2.5.5及以上)
- YamaPlayer (v1.5.16及以上)
- VizVid (v1.4.11及以上)
- あやぷれいやー2 (β1.0.0及以上)

以下作為附加功能支援：
- Sliden
- UnaSlides

## 僅限閱讀此檔案的人
在 input.txt 中填入 URL 或檔名，
在 output_site.txt 中填入下列之一，
在 output_mode.txt 中填入 nicovrc.net 或 tool.suzumebachi.xyz，儲存並啟動後將啟動自動生成模式。

### output_site.txt 清單
iwaSync (json 格式)
iwaSync (prefab 格式)
KineL式(りら式) (prefab 格式)
YamaPlayer (json 格式)
YamaPlayer (v1,prefab 格式)
YamaPlayer (v2,prefab 格式)
VizVid (json 格式)
あやぷれいやー2 (json 格式)
Sliden
UnaSlides