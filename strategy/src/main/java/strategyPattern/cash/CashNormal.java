package strategyPattern.cash;
/**
 * ������
 * @author Personal
 *
 */
public class CashNormal extends CashSuper{

	@Override
	public double acceptCash(Double money) {
		return money;
	}

}
