package softwareeng;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito.*;

import softwareeng.EquationSolver;

/**
 * Unit test for simple App.
 */
public class EquationSolverTest 
{
	private EquationSolver solver = new EquationSolver();
	
	@Mock
	EquationSolver mockSolver;
	
    @Test
    public void caluclateOk()
    {
    	float[] res = this.solver.calculate(1, 2, 1);
        float resultPos = res[0];
        float resultNeg = res[1];
        
    	assertTrue(resultPos == -1.0);
    	assertTrue(resultPos == -1.0);
    }
    
    @Test(expected = ArithmeticException.class)
    public void caluclateWhenAEquals0RaiseException()
    {
    	float[] res = this.solver.calculate(0, 2, 1);

    }
    
    @Test
    public void caluclateWithMockWhenAuxReturn0()
    {
    	EquationSolver mockSolver = mock(EquationSolver.class);

        // define return value for method getUniqueId()
        when(mockSolver.aux(any(float.class), any(float.class), any(float.class))).thenReturn((float) 0);

        // use mock in test....
        //assertEquals(test.getUniqueId(), 43);
    }
    
    @Test
    public void auxOk()
    {
    	float res = this.solver.aux(1, 2, 1);
        assertTrue(0.0 == res);
    }
    
    @Test
    public void auxWhenSqrtIsNegativeRaiseException()
    {
    	try {
    		float res = this.solver.aux(2, 1, 1);
    	} catch (ArithmeticException exception) {
    		assertEquals(exception.getClass(), ArithmeticException.class);
    	}

    }
}
