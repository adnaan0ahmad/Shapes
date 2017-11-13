
public class Rectangle extends Shape {
	
	private int l;
	private int b;
	
	
	public Rectangle(int x, int y, int l, int b) {
		super(x, y);
		this.l = l;
		this.b = b;
	}


	public int getL() {
		return l;
	}


	public void setL(int l) {
		this.l = l;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}

	public void draw ()
	{
	//super.draw();
	System.out.println("Origin is at "+getX()+","+getY()+" & Length is "+getL()+" & Breadth is "+getB());	
		
	}

	
}
