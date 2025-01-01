use std::io::Result;
fn main() -> Result<()> {
    prost_build::compile_protos(&[
			"Nada.proto"
    ], &["protos/"])?;
		tonic_build::compile_protos("protos/DoNothing.proto")?;
    Ok(())
}
