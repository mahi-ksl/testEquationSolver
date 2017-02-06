package testEquationSolver;

import java.util.Scanner;

public class Original{
		public static void main(String[] args) {
        
    	Scanner sn = new Scanner(System.in);
        //EqnSolver ES= new EqnSolver();
        System.out.print("Please Enter Degree: ");
        int i;
       // i = sn.nextInt();
        
        while(sn.hasNext())
        {
        	//System.out.print(i);
        	
            i = sn.nextInt();
            
			if(i==1)
			{
				System.out.print("a: ");
                double a = sn.nextDouble();
                System.out.print("b: ");
                double b = sn.nextDouble();
				Linear l = new Linear();
				l.calc(a,b);
			}
        	else if(i==2)
            {
                System.out.println("Please Enter Coefficients: ");
                System.out.print("a: ");
                double a = sn.nextDouble();
                System.out.print("b: ");
                double b = sn.nextDouble();
                System.out.print("c: ");
                double c = sn.nextDouble();
				Quadratic quad = new Quadratic();
                quad.calc(a,b,c);                
            }
            else if(i==3)
            {
                System.out.println("Please Enter Coefficients: ");
                System.out.print("a: ");
                double a = sn.nextDouble();
                System.out.print("b: ");
                double b = sn.nextDouble();
                System.out.print("c: ");
                double c = sn.nextDouble();
                System.out.print("d: ");
                double d = sn.nextDouble();
				MyCubic mc = new MyCubic();
                mc.calc(a,b,c,d);
            }
            else
            {
            	System.out.println("Sorry Wrong Degree");
            	//continue;
				sn.close();
            	System.exit(1);
            } 
        	System.out.print("Please Enter Degree: ");        
                	
        } 
                                              
    }
}

