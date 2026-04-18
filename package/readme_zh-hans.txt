# VRCNicoNicoPlaylistConverter
内容与 booth 的说明几乎相同，但为阅读此文件的人做了少量补充。

## 这是什么
一个将 Nico Nico 视频的播放列表转换为 VRC 视频播放器播放列表格式的工具。

## 使用方法
### 启动
Windows 下双击 start(.bat) 文件。
Linux 下为 start_forLinux.sh 添加可执行权限后运行。

### 登录
输入 NicoNico 的邮箱和密码登录。
* 支持两步验证，但不要在这种不太清楚来源的工具上使用你的主账号。

### 输出
按照屏幕说明进行输入和选择。


## 运行确认 视频播放器
- iwaSync (v3.7.1及以上)
- Kinel式(りら式) (v2.5.5及以上)
- YamaPlayer (v1.5.16及以上)
- VizVid (v1.4.11及以上)
- あやぷれいやー2 (β1.0.0及以上)

以下作为附加功能支持：
- Sliden
- UnaSlides

## 仅限阅读此文件的人
在 input.txt 中写入 URL 或文件名，
在 output_site.txt 中写入下列之一，
在 output_mode.txt 中写入 nicovrc.net 或 tool.suzumebachi.xyz，保存并启动后将进入自动生成模式。

### output_site.txt 列表
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