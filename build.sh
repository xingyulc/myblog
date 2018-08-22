#!/usr/bin/env bash

dos2unix docker/java/start.sh

cp target/myblog.jar  docker/java/app.jar
