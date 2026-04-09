#!/bin/bash

if [ -d ./tools ]; then
   echo "Starting..."
   ./tools/jdk-21.0.2/bin/java --module-path "./tools/javafx-sdk-21.0.10/lib" --add-modules javafx.controls,javafx.fxml -jar ./VRCNicoNicoPlaylistConverter-1.0-SNAPSHOT-all.jar
else
  mkdir ./tools

  curl https://github.com/ip7z/7zip/releases/download/26.00/7z2600-linux-x64.tar.xz -L --output ./tools/7z2600-linux-x64.tar.xz
  tar -Jxvf ./tools/7z2600-linux-x64.tar.xz
  mkdir ./tools/7z2600
  mv ./7zz ./tools/7z2600
  mv ./7zzs ./tools/7z2600
  mv ./History.txt ./tools/7z2600
  mv ./License.txt ./tools/7z2600
  mv ./MANUAL ./tools/7z2600
  mv ./readme.txt ./tools/7z2600
  chmod +x ./tools/7z2600/7zz
  
  curl https://download.java.net/java/GA/jdk21.0.2/f2283984656d49d69e91c558476027ac/13/GPL/openjdk-21.0.2_linux-x64_bin.tar.gz --output ./tools/openjdk-21.0.2_linux-x64_bin.tar.gz
  tar -zxvf ./tools/openjdk-21.0.2_linux-x64_bin.tar.gz
  mv ./jdk-21.0.2 ./tools
  chmod +x ./tools/jdk-21.0.2/bin/java

  curl https://download2.gluonhq.com/openjfx/21.0.10/openjfx-21.0.10_linux-x64_bin-sdk.zip --output ./tools/openjfx-21.0.10_linux-x64_bin-sdk.zip
  ./tools/7z/7zz x ./tools/openjfx-21.0.10_linux-x64_bin-sdk.zip
  mv ./javafx-sdk-21.0.10 ./tools

  rm -fr /tools/7z2600

  ./tools/jdk-21.0.2/bin/java --module-path "./tools/javafx-sdk-21.0.10/lib" --add-modules javafx.controls,javafx.fxml -jar ./VRCNicoNicoPlaylistConverter-1.0-SNAPSHOT-all.jar
  
fi