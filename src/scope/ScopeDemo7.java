package scope;
class C{
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(v);
		System.out.println(this.v);
	}
}
public class ScopeDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		c1.m();
		
	}

}
