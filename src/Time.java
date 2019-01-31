import java.util.*;
class Time{
	Scanner input = new Scanner(System.in);
	 int hour;
	 int minute;
	 int second;

	Time(){}

	TimeString tostring(){
		String S;
		S = hour + ":"+ minute+":"+ second;
		return S;
	}

	int nextSecond(){
		second = second + 1;
		if(second == 60)
		    {   second =00;
		    	
}
    return second;
}
	int nextMinute(){
		minute = minute +1;
		if(minute ==60)
				minute = 00;
			
		return minute;
	}

	int nextHour(){
		hour = hour + 1;
		if(hour == 24)
			hour = 00;
		return hour;
	}

	
}

class TestMyTime{
	public static void main(String[] args) {
		MyTime M = new MyTime();
		int h,m,s,nh,nm,ns,flag = 0,flag2 = 0,flag3 = 0;
		try{
			while(flag == 0)
		{
		h = M.getHour();
		if(h > 23)
			throw new Exception("Hour value must be between 0 and 23\n Enter again");
			
		else flag = 1;
	}
}

		catch(Exception e){
			System.out.println(e.getMessage());
		}
		try{
			while(flag2 == 0)
			{
		m = M.getMinute();
		if(m > 60)
			throw new Exception("minute value must be between 0 and 60");

       
       else flag2 = 1;
   }
   }
   
		catch(Exception e){
			System.out.println(e.getMessage());
		}

		try{
			while (flag3 == 0) {
					
		s = M.getSecond();
		if(s > 60)
			throw new Exception("second value must be between 0 and 60");
		
	
	else flag3 = 1;
		}
	
	}

		catch(Exception e){
			System.out.println(e.getMessage());
		}
		String a;
		a = M.tostring();
		System.out.println(a);
		ns = M.nextSecond();
		System.out.println("next second is " + ns);
		nm = M.nextMinute();
		System.out.println("next minute is " + nm);
		nh = M.nextHour();
		System.out.println("next hour is " + nh);
	
	
		
}
}
(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	void setTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
    int getHour(){
		hour = input.nextInt();
		
		return hour;
	}
	int getMinute(){
		minute = input.nextInt();
		
		return minute;
	}
	int getSecond(){
		second = input.nextInt();
		
		return second;
	}