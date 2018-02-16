#!/usr/bin/env bash
docker rm $(docker stop $(docker ps -aq))
