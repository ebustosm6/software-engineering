package softwareeng;


public class EquationSolver {
	
    public float[] calculate(float a, float b, float c){
        float[] result = new float[2];
        System.out.println("a: " + a +  " b: " + b + " c: " + c);
        if (a == 0){
            throw new ArithmeticException();
        }
        float raiz = aux (a, b, c);
        float resultPositivo = (-b + raiz) / 2*a;
        float resultNegativo = (-b - raiz) / 2*a;
        
        result[0] = resultPositivo;
        result[1] = resultNegativo;
        
        return result;
        
    }
    
    float aux(float a, float b, float c){
        float b2 = (float) Math.pow(b, 2);
        float ac4 = a*c*4;
        float raiz = b2 - ac4;
        if (raiz < 0){
            throw new ArithmeticException();
        }
        float res = (float) Math.sqrt (raiz);
        return res;
    }
}