package namit_assignment;

class SingleTon{
	static SingleTon obj = null;
	
	private SingleTon() {
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	
	public static SingleTon getObj() {
		if(obj == null) {
			obj = new SingleTon();
		}
		return obj;
	}
}
public class Q5 {
	public static void main(String[] args) {
		SingleTon obj1 = SingleTon.getObj();
		
		SingleTon obj2 = SingleTon.getObj();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
















