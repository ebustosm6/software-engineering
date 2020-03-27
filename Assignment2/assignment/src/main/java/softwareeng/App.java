package softwareeng;
import softwareeng.EquationSolver;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program to solve 2th grade equation" );
        EquationSolver solver = new EquationSolver();
        double[] res = solver.calculate(1, 6, 2);
        System.out.println("Solucion 1: x = " + res[0]);
        System.out.println("Solucion 2: x = " + res[1]);
        
    }
}
