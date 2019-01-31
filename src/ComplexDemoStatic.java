class complex{
	private int real;
	int imaginary;
	// None-parametrized constructor
	complex(){ }
	//parameterized constructor
complex(int real, int imaginary){

	this.real=real;
	this.imaginary=imaginary;
}
    /*complex add(complex c){
    	complex cadd=new complex();
    	cadd.real=real +c.real;
    	cadd.imaginary=imaginary +c.imaginary;
    	return cadd;
    }*/
    int getReal(){
    	return real;
    }
    void setReal
}
class complexDemoStatic{
	public static void main(String[] args){
	complex c1=new complex(1,2);
	complex c2=new complex(3,4);
	complex c3=new complex();
	//c3=add(c1,c2);
		System.out.print("c1 = "+c1.getReal + " " + c1.imaginary);
	System.out.print("c2 = "+c2.getReal + " " + c2.imaginary);
	System.out.print("c3 = "+c3.getReal +" " + c3.imaginary);
}
public static complex add(complex c1, complex c2){
	complex c3 =new complex();
	c3.setReal=c1.getReal + c2.getReal;
	c3.imaginary=c1.imaginary+
	c2.imaginary;
	return c3;
}
}//static function is associated with class