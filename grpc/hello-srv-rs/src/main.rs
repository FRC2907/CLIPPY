// https://docs.rs/prost-build/latest/prost_build/
// https://github.com/hyperium/tonic/blob/master/examples/helloworld-tutorial.md

mod clippy {
    pub mod null {
        include!(concat!(env!("OUT_DIR"), "/clippy.null.rs"));
    }
    tonic::include_proto!("clippy.null");
}

use clippy::null::{Null, do_nothing_server::{DoNothing, DoNothingServer}};
use tonic::{transport::Server, Request, Response, Status};

#[derive(Debug, Default)]
pub struct MyDoNothing {}

#[tonic::async_trait]
impl DoNothing for MyDoNothing {
    async fn nop(
        &self,
        _input: Request<Null>
    ) -> Result<Response<()>, Status> {
        println!("MROW");
        Ok(Response::new(()))
    }
}

#[tokio::main]
async fn main() -> Result<(), Box<dyn std::error::Error>> {
    println!("Hello, world!");
    //let mut _x =Null::default();

    let addr = "127.0.0.1:50051".parse()?;
    let doer = MyDoNothing::default();
    Server::builder()
        .add_service(DoNothingServer::new(doer))
        .serve(addr)
        .await?;

    Ok(())
}