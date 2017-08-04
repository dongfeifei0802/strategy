package strategyPattern.cash;

public class CashFactory {
	public static CashSuper createCashAccept(String type){
		CashSuper cs = null;
		switch(type){
			case "�����շ�":
				cs = new CashNormal();
				break;
			case "����":
				cs = new CashRebate("0.7");
				break;
			case "��300��100":
				cs = new CashReturn("300","100");
				break;
		}
		return cs;
	}
	public static void main(String[] args) {
		CashSuper cs = createCashAccept("����");
		
		System.out.println(cs.acceptCash(100d));
	}
}
