class Exception{
	public static void main(String[] args){
		/*int a=5;
		int b=0;
		int[] ar ={2};
		//next line will result in arithemtic exception
		System.out.print("a/b=" +a/b);*/
		String s=null;
		//next line will result in the null pointer
    	System.out.print(s.toString());
    	/*s="JAVA PROGRAMMING"
    	\\next line will result in number format exception
    	f(s);
    	\\next line will result in ArrayIndexOutOfBoundsException
    	System.out.print(ar[2]);*/
	}
	static void f(int b){
		System.out.print(b);
	}
}