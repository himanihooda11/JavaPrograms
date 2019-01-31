class Exception2{
	public static void main (String[] args){
		try{
			throw new Exception("Exception callled");
		}
		catch(Exception e){
			System.out.print(e.toString());
		}
		finally{
			System.out.print("we arer now in finally");
		}
	}
}