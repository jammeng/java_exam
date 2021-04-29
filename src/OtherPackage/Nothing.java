package OtherPackage;

public class Nothing {
	void _default() {
		System.out.println("default");
	}
	
	private void _private() {
		System.out.println("private");
	}
	
	public void _public() {
		System.out.println("public");
	}
	
	protected void _protected() {
		System.out.println("protected");
	}

}
class OtherPackageChecker extends Other{
	
	public OtherPackageChecker() {
		Nothing nothing = new Nothing();
		nothing._public();
		nothing._protected();
		nothing._default();
		//nothing.private();
		
		
	}
}