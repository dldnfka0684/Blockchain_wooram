package java_1007;

public class Alinecode {
	public static void func() {
		for(int i = 0; i < 3; i = i + 1) {
			System.out.println("Hellow Loop");
		}
	}

	public static void main(String[] args) {
		// 10 + 20 을 출려
		//변수를 만드는 이유는 데이터를 여러 번 사용하는경우 중복 수정을 방지하기 위함
		System.out.println(10 + 30);
		int result = 10 + 30;
		System.out.println(result);
		
		//동일한 패턴의 작업을 연속해서 여러 번 할 때는 반복문을 사용
		for(int i = 0; i < 3; i = i + 1) {			
		System.out.println("Hellow Loop");
		}
		
		func();
		System.out.println();
		func();
		
	}

}
