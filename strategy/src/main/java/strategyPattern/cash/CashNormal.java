package strategyPattern.cash;
/**
 * Õý³£Àà
 * @author Personal
 *
 */
public class CashNormal extends CashSuper{

	@Override
	public double acceptCash(Double money) {
		return money;
	}

}
