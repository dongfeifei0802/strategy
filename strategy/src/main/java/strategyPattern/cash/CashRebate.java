package strategyPattern.cash;
/**
 * ¥Ú’€¿‡
 * @author Personal
 *
 */
public class CashRebate extends CashSuper{
private double moneyRebate =1d;
	public CashRebate(String moneyRebate){
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}
	@Override
	public double acceptCash(Double money) {
		return money*moneyRebate;
	}

}
