FROM alpine:3.20 AS protoc
RUN apk update
# just add new deps on new lines, don't bother rebuilding everything
RUN apk add protoc protobuf-dev
RUN apk add protoc-gen-js --repository=http://dl-cdn.alpinelinux.org/alpine/edge/testing/
RUN apk add python3 py3-pip py3-grpcio grpc-cpp ruby-grpc grpc-dev

RUN pip install --break-system-packages grpcio grpcio-tools

# actual procedure
RUN mkdir /out /protos
RUN for dir in py java cpp csharp js objc php ruby protobuf; do mkdir /out/$dir; done
COPY ./* /protos

# build pb messages for most things
RUN protoc                      \
      --python_out=/out/py      \
        --java_out=/out/java    \
         --cpp_out=/out/cpp     \
      --csharp_out=/out/csharp  \
          --js_out=/out/js      \
        --objc_out=/out/objc    \
         --php_out=/out/php     \
        --ruby_out=/out/ruby    \
      -I/protos/                \
      $(find /protos -type f -iname "*.proto")

# copy raw protobufs for e.g. rust
RUN cp -r /protos/. /out/protobuf
RUN rm $(find /out/protobuf -type f ! -iname "*.proto")

# generate grpc files
# https://grpc.io/docs/languages/python/quickstart/#generate-grpc-code
# https://medium.com/engineering-semantics3/a-simplified-guide-to-grpc-in-python-6c4e25f0c506
RUN python -m grpc_tools.protoc \
     	     --python_out=/out/py \
              --pyi_out=/out/py \
      --grpc_python_out=/out/py \
      -I/protos/                \
      $(find /protos -type f -iname "*.proto")

CMD sleep infinity
VOLUME /out
