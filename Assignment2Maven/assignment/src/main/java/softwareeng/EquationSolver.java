package softwareeng;


public class EquationSolver {
	
	
    public double[] calculate(double a, double b, double c){
    	double[] result = new double[2];
        System.out.println("Calculating equation with params a: " + a +  " b: " + b + " c: " + c);
        if (a == 0){
            throw new ArithmeticException();
        }
        double raiz = aux(a, b, c);
        double resultPositivo = (-b + raiz) / 2*a;
        double resultNegativo = (-b - raiz) / 2*a;
        
        result[0] = resultPositivo;
        result[1] = resultNegativo;
        
        System.out.println("Obtained results x = (" + resultPositivo +  ", " + resultNegativo + ")");
        
        return result;
        
    }
    
    public double aux(double a, double b, double c) {
    	double b2 = Math.pow(b, 2);
        double ac4 = a*c*4;
        double raiz = b2 - ac4;
        if (raiz < 0){
            throw new ArithmeticException();
        }
        return Math.sqrt(raiz);
    }    
  
}