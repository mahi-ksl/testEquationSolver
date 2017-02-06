package testEquationSolver;

import edu.rit.numeric.Cubic;

public class MyCubic{
	 public void calc(double a, double b,double c, double d)
    {
        Cubic cu= new Cubic();
        
        cu.solve(a,b,c,d);
        
        if(cu.nRoots==1)
        {
            System.out.println("Result: "+cu.x1);
        }
        else if(cu.nRoots==3)
        {
            System.out.println("Result: "+cu.x1+", "+cu.x2+", "+cu.x3);
        }
    }
}