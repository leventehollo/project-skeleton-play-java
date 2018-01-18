#!/usr/bin/env bash

TEMP_DIR="dist_temp"
TARGET_DIR="dist"
IMAGE_NAME="hello-play"

#Build artifact
sbt dist

#Unzip artifact
unzip -d $TEMP_DIR target/universal/*-1.0-SNAPSHOT.zip

#Flatten directory structure
rsync -av $TEMP_DIR/*/* $TARGET_DIR
rm -rf $TEMP_DIR
rm $TARGET_DIR/bin/*.bat
mv $TARGET_DIR/bin/* $TARGET_DIR/bin/start

#Build Docker image
docker build -t $IMAGE_NAME .