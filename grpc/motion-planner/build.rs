use std::io::Result;
fn main() -> Result<()> {
    prost_build::compile_protos(&[
			"Null.proto"
    ], &["protos/"])?;
		tonic_build::compile_protos("protos/DoNothing.proto")?;
    Ok(())
}
