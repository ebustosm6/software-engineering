package softwareeng;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

import softwareeng.EquationSolver;

public class EquationSolverTest 
{
	private EquationSolver solver = new EquationSolver();
	
	@Test
    public void caluclateOk()
    {
    	double[] res = this.solver.calculate(1, 2, 1);
    	double resultPos = res[0];
    	double resultNeg = res[1];
        
    	assertTrue(resultPos == -1.0);
    	assertTrue(resultNeg == -1.0);
    }
    
    @Test(expected = ArithmeticException.class)
    public void caluclateWhenAEquals0RaiseException()
    {
    	this.solver.calculate(0, 2, 1);
    }
    
    @Test
    public void caluclateWithMockWhenAuxReturn0()
    {    	
    	
    	EquationSolver mockSolver = Mockito.spy(solver);
    	Mockito.doReturn(0.0).when(mockSolver).aux(anyDouble(), anyDouble(), anyDouble());

    	double a = 1.0;
    	double b = 2.0;
    	double c = 1.0;
    	double expectedResultPos = -1.0;
    	double expectedResultNeg = -1.0;
    	
    	double[] res = mockSolver.calculate(a, b, c);
    	double resultPos = res[0];
    	double resultNeg = res[1];
    	
    	assertTrue(resultPos == expectedResultPos);
    	assertTrue(resultNeg == expectedResultNeg);
    }
    
    @Test
    public void auxOk()
    {
    	double res = this.solver.aux(1, 2, 1);
        assertTrue(0.0 == res);
    }
    
    @Test
    public void auxWhenSqrtIsNegativeRaiseException()
    {
    	try {
    		this.solver.aux(2, 1, 1);
    	} catch (ArithmeticException exception) {
    		assertEquals(exception.getClass(), ArithmeticException.class);
    	}

    }
    
}
