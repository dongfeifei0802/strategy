package strategyPattern.cash;

public class CashFactory {
	public static CashSuper createCashAccept(String type){
		CashSuper cs = null;
		switch(type){
			case "正常收费":
				cs = new CashNormal();
				break;
			case "打折":
				cs = new CashRebate("0.7");
				break;
			case "满300减100":
				cs = new CashReturn("300","100");
				break;
		}
		return cs;
	}
	public static void main(String[] args) {
		CashSuper cs = createCashAccept("打折");
		
		System.out.println(cs.acceptCash(100d));
	}
}
