 public class EmployeeWage {
               //constant
		private static final int ISPRESENT=1;
		
	          //to generate random values	
		public static void randomCheck() {
			double empCheck = (int) ((Math.random() * 10) % 2);
			if (empCheck == ISPRESENT) {
				System.out.println("Employee is Present");
			} else {
				System.out.println("employee is Absent");
			}
		}

		public static void main(String[] args) {
			
			//printing welcome message
			System.out.println("Welcome to Employee Wage Computation");
			EmployeeWage.randomCheck();
		}
}	

