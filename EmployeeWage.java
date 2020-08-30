 public class EmployeeWage {

            private static final int ISFULLTIME=1;
	    private static final int ISPARTTIME=2;
	    private static final int EMP_RATE_PER_HOUR=20;
	    
	    
	    
	    public static void empWage()
	    {
	    	int empWage;
	    	int empHour=0;
	    	double empCheck = (int) ((Math.random()*10)%3);
	    	if(empCheck==ISFULLTIME)
	    	{
	    		System.out.println("Employee is Present for Full time");
	    		empHour=8;
	    	}
	    	else if(empCheck==ISPARTTIME)
	    	{
	    		System.out.println("Employee is Present for Part Time");
	    		empHour=4;
	    	}
	    	else
	    	{
	    		System.out.println("Employee is Absent");
	    	}
	    	empWage=empHour*EMP_RATE_PER_HOUR;
	    	System.out.println("Employee Wage: " + empWage);
	    	
	    }
	    public static void main(String[] args) {
	    	System.out.println("Welcome to Employee Wage Computation");
	    	EmployeeWage.empWage();
			
		}
}
	

