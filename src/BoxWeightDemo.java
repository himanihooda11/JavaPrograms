import java.util.*;
class BoxWeightDemo 
{
	public static void main(String args[])
	{
		float w, d , h, we;
		
		Scanner x = new Scanner(System.in);
		
		Boxweight B=new Boxweight();
		Boxweight B1=new Boxweight(3,4,5,6);

		B1.display();
		
		System.out.println("Enter the width of the box: ");
		w=x.nextFloat();
		
		System.out.println("Enter the depth of the box: ");
		d=x.nextFloat();
		
		System.out.println("Enter the length of the box: ");
		h=x.nextFloat();
		
		System.out.println("Enter the weight of the box: ");
		we=x.nextFloat();
		
		B.setdimensions(w, d, h, we);
		B.display();
		
		Box A = new Box();
		A.setdimensions(w,d,h);
		A.display();
	}
}