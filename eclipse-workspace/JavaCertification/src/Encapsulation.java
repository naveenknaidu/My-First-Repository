
public class Encapsulation {
	private int a;
	private int b;
	private String c;
// git sample comments
	
	public int getA() {
		
		return a;
	}
	public void setA(int a) {
		System.out.println(a);
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		System.out.println(b);
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		System.out.println(c);
		this.c = c;
	}
	
	public static void main(String args[]) {
		
		Encapsulation en = new Encapsulation();
		
		en.setA(10);
		en.setB(20);
		en.setC("Naveen");
	}
	
	

}
