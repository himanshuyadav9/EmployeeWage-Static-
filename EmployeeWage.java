 public class EmployeeWage {

         //constants
        private static final int ISPRESENT=1;
	private static final int EMP_RATE_PER_HOUR=20;
	     
	    public static void empWage()
	    {
	    	int empWage;
	    	int empHour=0;
	    	double empCheck = (int) ((Math.random()*10)%2);
	    	if(empCheck==ISPRESENT)
	    	{
	    		System.out.println("Employee is Present");
	    		empHour=8;
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

