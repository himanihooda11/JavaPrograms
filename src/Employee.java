class Employee{
	String first, lastname;
	double salary;
	Employee()
	{
		salary= 12345;
		first="himani";
		lastname="hooda";
			
}
Employee(String first , String lastname, double salary)
{
	this.first=first;
	this.lastname=lastname;
	this.salary=salary;

}
}
class EmployeeTest{
	public static void main(String[] args){
		Employee ab= new Employee();
		System.out.print(ab.first + " " +ab.lastname +" " +ab.salary);
	}
}