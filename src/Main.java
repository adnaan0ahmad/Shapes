
public class Main {
	

	public static void main(String[] args) {
		
		Object o = new Circle (10,20,30);
		
		//Shape s;
		
		Circle c = new Circle (10,20,30);
		
		Rectangle r = new Rectangle (10,20,30,40);
		
		Triangle t = new Triangle (10,20,30,40);
		
		PrintToScreen pt= new PrintToScreen();
				
		pt.print(t);
		pt.print(r);
		pt.print(c);
		
		
		//c = (Circle) s;
		
		//Shape s = new Circle (10,20,30);
		
		//s=c;
		
		//s.draw();
		
		//c.draw();
		
		//System.out.println(c.getX()+" "+c.getY()+" "+c.getR());
		
		//System.out.println(c.x+" "+c.y+" "+c.r);			//x y r are private variables & hence cannot be accessed outside their respected class

	}

}
