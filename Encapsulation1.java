package W3School;

public class Encapsulation1 {
	
	public static void main(String[] args) {
		
		TestEncapsulation t=new TestEncapsulation();
		t.setid(100);
		t.setsname("Roy");
		
		int num=t.getsid();
		String name=t.getsname();
		
		System.out.println(num);
		System.out.println(name);
		
	}

}