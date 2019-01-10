package newchapter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculatorDemo {
	

	
	
	
public static double motionCalc1(double s , double u , double a , double t) {
		
		s = 0.0;
		
		s += (u*t) + (0.5 *a * t*t);
		return s;
		
	}

public static double motionCalc2(double v, double u , double a , double t) {
	v = 0.0;
	
	v += u + (a*t);
	return v;
}

public static double motionCalc3(double v, double u, double a , double t) {
	a = 0.0;
	
	a += (v - u) / t;
	return a;
	
}

public static double motionCalc4(double v, double u, double a , double t) {
	t = 0.0;
	
	t += (v - u) / a;
	return t;
}

public static double forceCalc(double f , double m , double a) {
	f = 0.0;
	
	f += m *a;
	return f;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This is a console calculator. It contains most of the equations to perform Physics calculations
        int input , input2 , input3;
		Scanner in = new Scanner(System.in);
		// Picking a certain calculator
		System.out.println("Pick an ineteger assigned to the following: ");
		System.out.println("1- Motion Calculator");
		System.out.println("2- Force Calculator");
		input = in.nextInt();
		
		
		
		switch(input) {
		
		
		case 1: System.out.println("There are 4 parameters for Newtonian mechanics");
		// Picking one of the parameters to find
		System.out.println("1- For distance travelled");
		System.out.println("2- For final velocity ");
		System.out.println("3- For the acceleration due to gravity");
		System.out.println("4- For the time ");
		Scanner pet = new Scanner(System.in);
		input2 = pet.nextInt();
		
		switch(input2) {
		
		case 1: 
			double u,a,t;
			double s = 0.0;
			
			
			Scanner vet = new Scanner(System.in);
			System.out.println("Enter a value for u: ");
			u = vet.nextInt();
			System.out.println("You entered " + u);
			System.out.println("Enter a value for a: ");
			a = vet.nextInt();
			System.out.println("You entered " + a);
			System.out.println("Enter a value for t: ");
			t = vet.nextInt();
			System.out.println("You entered " + t);
			System.out.print("The total distance travelled is:   ");
			System.out.println(motionCalc1(s,u,a,t) + " m");
			
			
		case 2:
			double v = 0.0;
			
			
			Scanner bet = new Scanner(System.in);
			System.out.println("Enter a value for u: ");
			u = bet.nextInt();
			System.out.println("You entered " + u);
			System.out.println("Enter a value for a: ");
			a = bet.nextInt();
			System.out.println("You entered " + a);
			System.out.println("Enter a value for t: ");
			t = bet.nextInt();
			System.out.println("You entered " + t);
			System.out.print("The final velocity is: ");
			System.out.println(motionCalc2(v,u,a,t) + " m/s");
			break;
			
			
		case 3: 
			 a = 0.0;
			 
			 Scanner get = new Scanner(System.in);
			 System.out.println("Enter a value for v: ");
			 v = get.nextInt();
			 System.out.println("You entered " + v);
			 System.out.println("Enter a value for u: ");
			 u = get.nextInt();
			 System.out.println("You entered " + u);
			 System.out.println("Enter a value for t: ");
			 t = get.nextInt();
			 System.out.println("You entered " + t);
			 System.out.print("The acceleration is: ");
			 System.out.println(motionCalc3(v,u,a,t) + " m/s^2");
			 break;
			 
			 
		case 4:
			t = 0.0;
			
			Scanner let = new Scanner(System.in);
			System.out.println("Enter a value for v: ");
			v = let.nextInt();
			System.out.println("You entered " + v);
			System.out.println("Enter  value for u: ");
			u = let.nextInt();
			System.out.println("You entered " + u);
			System.out.println("Enter a value for a: ");
			a = let.nextInt();
			System.out.println("You entered " + a);
			System.out.print("The total time used: ");
			System.out.println(motionCalc4(v,u,a,t) + " seconds");
			break;
			 
			 
			
		
		}
		
		
		case 2:
			double m,a;
			
			double f = 0.0;
			Scanner met = new Scanner(System.in);
			System.out.println("Enter mass: ");
			m = met.nextInt();
			System.out.println("You entered " + m);
			System.out.println("Enter acceleration: ");
			a = met.nextInt();
			System.out.println("You entered " + a);
			System.out.print("The force used is: ");
			System.out.println(forceCalc(f,m,a) + " N");
			
		
		break;
		 default:
	            JOptionPane.showMessageDialog(null, "\n\nPlease enter something, I, a Computer,"
	                    + " can actually understand - Restart the program. -.");  
		}
		
		}
		
	}


