class Box
{
	double width;
	double height;
	double depth;
	
	Box(){
		width = 5;
		height =5;
		depth =5;

	}
	Box(double width, double height, double depth){
		this.width width;
		this.height height;
		this.depth depth;
	}
	double volume(){
		return(width*height*depth);
	}
}
class BoxDemo{
	public static void public static void main(String[] args) {
		
Box b= new Box();
Box b1 = new Box(6,6,6);
System.out.print("volume of the box");
System.out.print("\n volume of box with parameters");
	}
}


	