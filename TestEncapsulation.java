package W3School;

public class TestEncapsulation{
	private int sid;
	private String sname;
	
	public void  setid(int sid)
    {
		this.sid=sid;
	}
	
	public int getsid()
	{
		return sid;
	}
	
	public void  setsname(String sname)
    {
		this.sname=sname;
	}
	
	public String getsname()
	{
		return sname;
	}
	
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


