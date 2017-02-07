package testEquationSolver;

public class Quadratic{
	public void calc(double a, double b,double c)
    {
        double det = b*b - 4*a*c;
        
        if(det<0)
        {
        	double real = ((-1)*b) / (2*a);
        	
        	double im = Math.sqrt(det*(-1));
        	
        	im = im / (2*a);
        	
        	System.out.println("result: "+real+" + "+im+"i, "+real+" - 1"+im+"i");
        }
        else
        {
        	double x1 = ((-1)*b) + Math.sqrt(det);
        	double x2 = ((-1)*b) - Math.sqrt(det);
        	x1 = x1 / (2*a);
        	x2 = x2 / (2*a);
        	
        	System.out.println("result: "+x1+", "+x2);
        	
        }
    }
}