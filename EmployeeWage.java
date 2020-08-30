 public class EmployeeWage {
                //constants
		private static final int ISFULLTIME=1;
		private static final int ISPARTTIME=2;
		private static final int EMPRATE=20;
		
	    
	    
		public static void empWage() {
			int empHour = empCheck();
			int empWage = empHour * EMPRATE;
			System.out.println("Employee Wage: " + empWage);
		}

		public static int empCheck() {
			int empHour = 0;
			int empCheck = (int) ((Math.random() * 10) % 3);
			switch (empCheck) {
			case ISFULLTIME:
				System.out.println("Employee is Present for Full Time");
				empHour = 8;
				break;

			case ISPARTTIME:
				System.out.println("Employee is Present for Part Time");
				empHour = 4;
				break;

			default:
				System.out.println("Employee is Absent");
				empHour = 0;
			}
			return empHour;

		}

		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation");
			EmployeeWage.empWage();
        }
}
	

