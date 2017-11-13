
public class Triangle extends Shape {
	
	private int base, h;

	public Triangle(int x, int y, int base, int h) {
		super(x, y);
		this.base = base;
		this.h = h;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	public void draw ()
	{
	//super.draw();
	System.out.println("Origin is at "+getX()+","+getY()+" & Base is "+getBase()+" & Height is "+getH());	
		
	}
	
}

	