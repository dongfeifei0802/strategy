package simpleFactory.calculation;

public class OperationFactory {
	public static Operation  createOperate(String operate){
		Operation op = null;
		switch(operate){
		case "+":
			op= new CalculationAdd();
			break;
		case "-":
			op = new CalculationSub();
			break;
		case "*": 
			op = new CalculationMul();
			break;
		case "/":
			op = new CalculationDiv();
			break;
		}
		return op;
		
	}
public static void main(String[] args) {
	Operation op ;
	op = OperationFactory.createOperate("/");
	op.set_numberA(11);
	op.set_numberB(2);

	System.out.println(op.getResult());	
}
}
