import java.util.*;

class Quadratic
{
	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
 System.out.print("input a =");
        int a = input.nextInt();
         System.out.print("input b=");
        int b = input.nextInt();
                System.out.print("input c=");

        int c = input.nextInt();		

        double result=b*b -4*a*c;
        if (result>0)
        {
        	double root1 = (- b + Math.pow(result,0.5))/ (2 * a);
        double root2 = (- b - Math.pow(result,0.5))/ (2 * a);
   System.out.println("the roots are"+root1+" " +root2);
        }
        else if (result==0)
        {
        	double root3=-b/(2*a);
        	   System.out.println("the roots are"+root3);
        }
        else
        {
        	System.out.println("this eq. has no real root");
        }
	}
}