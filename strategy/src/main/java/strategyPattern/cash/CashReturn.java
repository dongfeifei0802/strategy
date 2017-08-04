package strategyPattern.cash;
/**
 * 满多少返多少类例如满100返100
 * @author Personal
 *
 */
public class CashReturn extends CashSuper{
	private double moneyCondition=0.0d;
	private double moneyReturn=0.0d;
	public CashReturn(String moneyCondition,String moneyReturn){
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}
	@Override
	public double acceptCash(Double money) {
		double result =money;
		if(money>=moneyCondition){
			result = money  - (money/moneyCondition)*moneyReturn;
		}
		return result;
	}

}
