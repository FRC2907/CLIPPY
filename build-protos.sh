#!/bin/sh

docker-compose build protos
docker create --name tc clippy_protos
rm -rf built-protos
mkdir -p built-protos
docker cp tc:/out ./built-protos
docker rm tc
mv ./built-protos/out/* ./built-protos
rmdir ./built-protos/out
