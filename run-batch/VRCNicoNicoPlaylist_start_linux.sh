#!/bin/bash

if [ -d ./tools ]; then
   echo "Starting..."
   ./tools/jdk-21.0.13-9/bin/java --module-path "./tools/javafx-sdk-21.0.13/lib" --add-modules javafx.controls,javafx.fxml,javafx.web -jar ./VRCNicoNicoPlaylistConverter-1.0-SNAPSHOT-all.jar
else
  mkdir ./tools

  curl https://github.com/ip7z/7zip/releases/download/26.05/7z2605-linux-x64.tar.xz -L --output ./tools/7z2605-linux-x64.tar.xz
  tar -Jxvf ./tools/7z2605-linux-x64.tar.xz
  mkdir ./tools/7z2605
  mv ./7zz ./tools/7z2605
  mv ./7zzs ./tools/7z2605
  mv ./History.txt ./tools/7z2605
  mv ./License.txt ./tools/7z2605
  mv ./MANUAL ./tools/7z2605
  mv ./readme.txt ./tools/7z2605
  chmod +x ./tools/7z2605/7zz
  
  curl -L "https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.13%2B9/OpenJDK21U-jdk_x64_linux_hotspot_21.0.13_9.tar.gz" --output ./tools/OpenJDK21U-jdk_x64_linux_hotspot_21.0.13_9.tar.gz
	tar -zxvf ./tools/OpenJDK21U-jdk_x64_linux_hotspot_21.0.13_9.tar.gz
	mv ./jdk-21.0.13+9 ./tools
	mv ./tools/jdk-21.0.13+9 ./tools/jdk-21.0.13-9
	chmod +x ./tools/jdk-21/bin/java

  curl https://download2.gluonhq.com/openjfx/21.0.13/openjfx-21.0.13_linux-x64_bin-sdk.zip --output ./tools/openjfx-21.0.13_linux-x64_bin-sdk.zip
  ./tools/7z2605/7zz x ./tools/openjfx-21.0.13_linux-x64_bin-sdk.zip
  mv ./javafx-sdk-21.0.13 ./tools

  rm ./tools/7z2605-linux-x64.tar.xz
  rm ./tools/7z2600-linux-x64.tar.xz
  rm ./tools/OpenJDK21U-jdk_x64_linux_hotspot_21.0.13_9.tar.gz
  rm ./tools/openjfx-21.0.13_linux-x64_bin-sdk.zip
  rm ./tools/openjfx-21.0.11_linux-x64_bin-sdk.zip
  rm ./tools/openjfx-21.0.10_linux-x64_bin-sdk.zip
  rm -fr ./tools/javafx-sdk-21.0.11
  rm -fr ./tools/javafx-sdk-21.0.10
  rm -fr /tools/7z2600
  rm -fr /tools/7z2605
  rm -fr /tools/jdk-21.0.2

  ./tools/jdk-21.0.13-9/bin/java --module-path "./tools/javafx-sdk-21.0.13/lib" --add-modules javafx.controls,javafx.swing -jar ./VRCNicoNicoPlaylistConverter-1.0-SNAPSHOT-all.jar
  
fi