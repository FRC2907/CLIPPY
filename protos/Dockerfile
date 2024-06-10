FROM alpine:3.20 as protoc
RUN apk update
RUN apk add protoc protobuf-dev
RUN apk add protoc-gen-js --repository=http://dl-cdn.alpinelinux.org/alpine/edge/testing/
RUN mkdir /out /protos
RUN for dir in py java cpp csharp js objc php ruby; do mkdir /out/$dir; done
COPY ./* /protos
RUN protoc                     \
      --python_out=/out/py     \
        --java_out=/out/java   \
         --cpp_out=/out/cpp    \
      --csharp_out=/out/csharp \
          --js_out=/out/js     \
        --objc_out=/out/objc   \
         --php_out=/out/php    \
        --ruby_out=/out/ruby   \
      -I/protos/               \
      $(find /protos -type f -iname "*.proto")

CMD true
VOLUME /out
