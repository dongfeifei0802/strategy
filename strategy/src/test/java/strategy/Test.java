package strategy;
public class Test {
	static int zfcount =55;
	public static void main(String[] args) {
		String str = "�л�����з,�й���Ϻ,����,�̲Σ��,�̲Σ��θɣ�,��������,������,�����,��Ϻ,����,�ȱ�,�ߵ��β�t,�ձ���Ϻ,����з��ĸз��,��Ŀ��,��Ƭ��,����,ĵ��,����Ϻ,����,�޷���,����,����,Ϻ��,����,����,������,���㣨���ǣ�,����,����,����,����,����,����,����,�ƻ���";
		String result = "";
			while(str.length()>zfcount){
				String temp = getStr(str);
				result  += temp+"\n"; 
				str = str.substring(temp.length());
			}
			result  += str;
			System.out.println(result);
	}
	public static String getStr(String str){
		return str.substring(0, str.substring(0, zfcount).lastIndexOf(",")+1);
	}

}
