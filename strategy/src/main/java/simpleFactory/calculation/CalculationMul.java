package simpleFactory.calculation;

public class CalculationMul extends Operation{

	@Override
	public double getResult() {
		double result =0 ;
		result =get_numberA()*get_numberB();
		return result;
	}
	
	

}
