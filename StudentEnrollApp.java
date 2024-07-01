package exception;

		import java.util.Scanner;

		public class StudentEnrollApp {
		    //we enroll the student if income is less than 500000 and they must complete degree.
			void enroll(int income,String status) {
				if(income>500000)
					throw new ArithmeticException();
				else if(status.equalsIgnoreCase("no"))
					throw new NullPointerException();
				
				System.out.println("Student Enrolled into the Batch");
				
			}
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				StudentEnrollApp student=new  StudentEnrollApp();
		        System.out.println("Enter Annual income:");
		         
		        int income=sc.nextInt();
		        
		        System.out.println("Is your degree completed?:yes/no:");
		        String status=sc.next();
		        try {
		        
		        student.enroll(income, status);
		        } catch(Exception e) {
		        	System.out.println("You are not eligible for the enrollment");
			}

		}

	}


