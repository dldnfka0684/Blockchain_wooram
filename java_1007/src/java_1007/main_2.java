package java_1007;

public class main_2 {

	public static void main(String[] args) {
		String str = "한국어";
		int len = str.length();
		System.out.println(len);
		
		String eng = "HiJava";
		String upp = eng.toUpperCase();
		System.out.println(upp);
		
		String t = "HelloJava";
		int result = t.indexOf("Java");
		System.out.println(result);
		if(result >=0) {
			System.out.println("있음");
		}else {
			System.out.println("없음");
		}
		
	}

}
