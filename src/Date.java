class Date{
	int month;
	int day;
	int year;

	Date(){
		month=5;
		day=5;
		year=15;
	}
	Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
}
class displayDate{
	public static void main(String[] args){
		
		Date d=new Date(5,5,15);
		System.out.println(d.day+"/"+d.month+"/"+d.year);
	}
}