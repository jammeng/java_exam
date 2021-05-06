package polymorphism;

interface I{}
class C implements I{}

public class PolymophismDemo2 {

	public static void main(String[] args) {
		I obj = new C();
	}

}
