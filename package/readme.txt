# VRCNicoNicoPlaylistConverter
boothの説明とほぼ同じ内容ですが このファイルを読んでくれた人向けに多少追記しています

## なんすかこれ
ニコニコ動画のプレイリストからVRCの動画プレーヤーのプレイリストの形式に変換するツール

## 使い方
### 起動
Windowsの場合は「start(.bat)」ファイルをダブルクリック
Linuxの場合は「start_forLinux.sh」を実行権限つけて起動する

### ログイン
ニコ動のメアド、パスワードを入れてログイン
※二段階認証にも対応しているけどこんなよくわからんツールにメイン垢なんて使っちゃダメですよ

### 出力
画面の説明に従って入力と選択してください


## 動作確認 動画プレーヤー
- iwaSync (v3.7.1～)
- Kinel式(りら式) (v2.5.5～)
- YamaPlayer (v1.5.16～)
- VizVid (v1.4.11～)
- あやぷれいやー2 (β1.0.0～)

以下はおまけ機能としての対応
- Sliden
- UnaSlides

## このファイルを読んでくれた人限定
input.txtにURLまたはファイル名  
output_site.txtに「」(下記記載)など  
output_mode.txtに「nicovrc.net」または「tool.suzumebachi.xyz」  
を記入し保存して起動すると自動生成モードが起動します。

### output_site.txtのリスト
iwaSync (json形式)
iwaSync (prefab形式)
KineL式(りら式) (prefab形式)
YamaPlayer (json形式)
YamaPlayer (v1,prefab形式)
YamaPlayer (v2,prefab形式)
VizVid (json形式)
あやぷれいやー2 (json形式)
Sliden
UnaSlides