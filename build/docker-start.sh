#!/usr/bin/env bash
IMAGE_NAME="hello-play"
docker run -it -p 9000:9000 -p 9443:9443 --rm $IMAGE_NAME