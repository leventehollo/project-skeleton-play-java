#!/usr/bin/env bash
TEMP_DIR="dist_temp"
TARGET_DIR="dist"
sbt dist
unzip -d $TEMP_DIR target/universal/*-1.0-SNAPSHOT.zip
rsync -av $TEMP_DIR/*/* $TARGET_DIR
rm -rf $TEMP_DIR
rm $TARGET_DIR/bin/*.bat
mv $TARGET_DIR/bin/* $TARGET_DIR/bin/start