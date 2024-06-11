# NOTE build context is root of CLIPPY! not dir that Dockerfile resides in
FROM alpine:3.20 as protoc
RUN apk update
RUN apk add protoc protobuf-dev
RUN mkdir /out /protos
COPY ./protos/* /protos
RUN protoc                     \
      --python_out=/out        \
      -I/protos/               \
      $(find /protos -type f -iname "*.proto")

FROM python:3
WORKDIR /app
COPY ./log/requirements.txt .
RUN pip install -r requirements.txt
COPY --from=protoc /out ./protos
COPY ./log/*.py .

CMD python -u main.py

VOLUME /d
