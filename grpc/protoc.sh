#!/bin/sh

docker-compose build protos
docker-compose create protos
rm -rf built-protos
mkdir -p built-protos
docker-compose cp protos:/out ./built-protos
yes y | docker-compose rm protos
mv ./built-protos/out/* ./built-protos
rmdir ./built-protos/out
