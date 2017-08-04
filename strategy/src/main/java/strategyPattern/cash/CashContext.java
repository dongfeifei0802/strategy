package strategyPattern.cash;

public class CashContext {
	private CashSuper cs;
	public CashContext(CashSuper csuper){
		System.out.println("********************");
		this.cs=csuper;
	}
}
