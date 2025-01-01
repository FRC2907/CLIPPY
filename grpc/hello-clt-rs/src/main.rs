pub mod clippy {
    pub mod null {
        include!(concat!(env!("OUT_DIR"), "/clippy.null.rs"));
    }
    tonic::include_proto!("clippy.null");
}

use clippy::null::{Null, do_nothing_client::DoNothingClient};

#[tokio::main]
async fn main() -> Result<(), Box<dyn std::error::Error>> {
    println!("Hello, world!");
    let x = Null::default();
    let mut client = DoNothingClient::connect("http://127.0.0.1:50051").await?;
    client.nop(x).await?;
    println!("done");

    Ok(())
}
