
public class Circle extends Shape {
	
	private int r;

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void draw ()
	{
	//super.draw();	//super on overridden methods
	System.out.println("Origin is at "+getX()+","+getY()+" & Radius is "+getR());	
		
	}
	

}
