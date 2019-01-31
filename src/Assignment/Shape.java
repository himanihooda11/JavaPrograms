import java.util.*;
class Shape
{
	public void displayMsg()
	{
		System.out.print("This is a shape");
	}
	
}
class Circle extends Shape
{
	int radius;
	Circle(int radius)
	{
		this.radius=radius;
	}
	double area()
	{
		return 3.14*radius*radius;
	}
}
{


     Void displayArea; {
	System.out.print("Are of the circle=" + area());
}
}
class Rectangle extends Shape{
	int length,breadth;
	Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	double area(){
		return length*breadth;
	}
	void displayArea(){
		System.out.print("/n Area of Rectangle=" +area());
	}
}
class ShapeInheritanceDemo{
  public static void main(String[] args) {
  	Circle c= new Circle(4);
  	System.out.print("Circle calling its function and inherited function");
  	c.displayArea();
  	c.displayMsg();
Rectangle r=new Rectangle(2,3);
System.out.print("\nRectangle calling its function and inherited function");
r.displayArea();
r.displayMsg();
	}	
}	
