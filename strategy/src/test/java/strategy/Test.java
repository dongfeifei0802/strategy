package strategy;
public class Test {
	static int zfcount =55;
	public static void main(String[] args) {
		String str = "ÖÐ»ªÈÞòüÐ·,ÖÐ¹ú¶ÔÏº,ÎÚ÷¯,´Ì²Î£¨»î£©,´Ì²Î£¨ÑÎ¸É£©,¼ÓÖÝöÔÓã,´óÁâöÒ,´ó»ÆÓã,¶ÔÏº,´øÓã,ÉÈ±´,°ßµã²æÎ²õt,ÈÕ±¾¶ÔÏº,Ëó×ÓÐ·£¨Ä¸Ð·£©,±ÈÄ¿Óã,ÑÀÆ¬Óã,ÑÀöÒ,ÄµòÃ,ÅýÅÃÏº,¼×Óã,ÂÞ·ÇÓã,»¨öÔ,²ÝÓã,ÏºòÁ,¸òòÛ,Òøöð,ÂíöÞÓã,±«Óã£¨µ¥¿Ç£©,öãÓã,ÀðÓã,öêÓã,öóÓã,öýÓã,÷©Óã,÷¬Óã,»Æ»¨Óã";
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
