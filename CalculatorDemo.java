package newchapter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculatorDemo {
	

	
	
	
public static double motionCalc1(double s , double u , double a , double t) {
		
		s = 0.0;
		
		s += (u*t) + (0.5 *a * t*t);
		return s;
		
	}

public static double motionCalc2(double v0, double u , double a , double t) {
	v0 = 0.0;
	
	v0 += u + (a*t);
	return v0;
}

public static double motionCalc3(double v, double u, double a0 , double t) {
	a0 = 0.0;
	
	a0 += (v - u) / t;
	return a0;
	
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
        int input , input2;
        String input7 , input3;
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
		input7 = in.next();
		input2 = Integer.parseInt(input7);
		
		
		switch(input2) {
		
		case 1: 
			String u,a,t;
			double s = 0.0;
			
			
			
			System.out.println("Enter a value for u: ");
			u = in.next();
			int u1 = Integer.parseInt(u);
			System.out.println("You entered " + u1);
			System.out.println("Enter a value for a: ");
			a = in.next();
			int a1 = Integer.parseInt(a);
			System.out.println("You entered " + a1);
			System.out.println("Enter a value for t: ");
			t = in.next();
			int t1 = Integer.parseInt(t);
			System.out.println("You entered " + t1);
			System.out.print("The total distance travelled is:   ");
			System.out.println(motionCalc1(s,u1,a1,t1) + " m");
			
			
		case 2:
			double v0 = 0.0;
			
			
			
			System.out.println("Enter a value for u: ");
			u = in.next();
			int u2 = Integer.parseInt(u);
			System.out.println("You entered " + u2);
			System.out.println("Enter a value for a: ");
			a =in.next();
			int a2 = Integer.parseInt(a);
			System.out.println("You entered " + a2);
			System.out.println("Enter a value for t: ");
			t = in.next();
			int t2 = Integer.parseInt(t);
			System.out.println("You entered " + t2);
			System.out.print("The final velocity is: ");
			System.out.println(motionCalc2(v0,u2,a2,t2) + " m/s");
			break;
			
			
		case 3: 
			double a0 = 0.0;
			String v;
			 
			 
			 System.out.println("Enter a value for v: ");
			 v = in.next();
			 int v1 = Integer.parseInt(v);
			 System.out.println("You entered " + v1);
			 System.out.println("Enter a value for u: ");
			 u = in.next();
			 int u3 = Integer.parseInt(u);
			 System.out.println("You entered " + u3);
			 System.out.println("Enter a value for t: ");
			 t = in.next();
			 int t3 = Integer.parseInt(t);
			 System.out.println("You entered " + t);
			 System.out.print("The acceleration is: ");
			 System.out.println(motionCalc3(v1,u3,a0,t3) + " m/s^2");
			 break;
			 
			 
		case 4:
			double t0 = 0.0;
			
			
			System.out.println("Enter a value for v: ");
			v = in.next();
			int v2 = Integer.parseInt(v);
			System.out.println("You entered " + v2);
			System.out.println("Enter  value for u: ");
			u = in.next();
			int u4 = Integer.parseInt(u);
			System.out.println("You entered " + u4);
			System.out.println("Enter a value for a: ");
			a = in.next();
			int a3 = Integer.parseInt(a);
			System.out.println("You entered " + a3);
			System.out.print("The total time used: ");
			System.out.println(motionCalc4(v2,u4,a3,t0) + " seconds");
			break;
			 
			 
			
		
		}
		break;
		
		
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


