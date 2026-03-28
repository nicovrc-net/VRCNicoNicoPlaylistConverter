#!/bin/bash

if [ -d ./tools ]; then
   echo "Starting..."
   ./tools/jdk-21.0.2/bin/java --module-path "./tools/javafx-sdk-21.0.10/lib" --add-modules javafx.controls,javafx.fxml -jar ./VRCVideoLogViewer-1.0-SNAPSHOT-all.jar
else
  mkdir ./tools
  
  curl https://download.java.net/java/GA/jdk21.0.2/f2283984656d49d69e91c558476027ac/13/GPL/openjdk-21.0.2_linux-x64_bin.tar.gz --output ./tools/openjdk-21.0.2_linux-x64_bin.tar.gz
  tar -zxvf ./tools/openjdk-21.0.2_linux-x64_bin.tar.gz
  mv ./jdk-21.0.2 ./tools
  chmod +x ./tools/jdk-21.0.2/bin/java
  chmod +x ./tools/jdk-21.0.2/bin/javaw

  curl https://download2.gluonhq.com/openjfx/21.0.10/openjfx-21.0.10_linux-x64_bin-sdk.zip --output ./tools/openjfx-21.0.10_linux-x64_bin-sdk.zip
  tar -xf ./tools/openjfx-21.0.10_linux-x64_bin-sdk.zip
  mv ./javafx-sdk-21.0.10 ./tools

  ./tools/jdk-21.0.2/bin/javaw --module-path "./tools/javafx-sdk-21.0.10/lib" --add-modules javafx.controls,javafx.fxml -jar ./VRCNicoNicoPlaylistConverter-1.0-SNAPSHOT-all.jar
  
fi