pub mod clippy {
    pub mod nada {
        include!(concat!(env!("OUT_DIR"), "/clippy.nada.rs"));
    }
    tonic::include_proto!("clippy.nada");
}

use clippy::nada::{Nada, do_nothing_client::DoNothingClient};

#[tokio::main]
async fn main() -> Result<(), Box<dyn std::error::Error>> {
    println!("Hello, world!");
    let x = Nada::default();
    let mut client = DoNothingClient::connect("http://127.0.0.1:50051").await?;
    client.nop(x).await?;
    println!("done");

    Ok(())
}
