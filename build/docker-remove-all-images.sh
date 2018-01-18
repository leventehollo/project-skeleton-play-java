#!/usr/bin/env bash
docker rmi $(docker images -qf "dangling=true")