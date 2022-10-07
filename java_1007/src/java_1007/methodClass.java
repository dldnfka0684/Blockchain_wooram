package java_1007;

public class methodClass {
	public  void func(){
		for(int i = 0; i < 3; i = i + 1) {
			System.out.println("Hellow Java");
		}
	}
	
	//매개변수가 있는 메서드
	public void printDisp(int n) {
		for(int i = 0; i < n; i = i + 1) {
			System.out.println("Hellow Java");		
	}

	}
	
	public void disp(String str, int n) {
		for(int i = 0; i < n; i = i + 1) {
			System.out.println(str);
	}
}
	//boolean 1개를 받아서 수행하는 메서드
	public void returnMethod(boolean b) {
		if(b == false) {
			return;
		}
		System.out.println("수행");
		
	}
	// 2개의 정수를 더하는 메서드
	public void noReturn(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}
	public void noReturn3(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);
	}
	public  int hasReturn (int a, int b){
		int result = a + b;
		//메서드가 데이터를 가지고 리턴을 할 때는 리턴하는 데이터의 자료형을 메소드 이름 앞에 기재해야 합니다.
		return result;
	}
	public void min(double a, double b) {
		if(a<b) {
			System.out.println(a);
		}else if(a>b) {
			System.out.println(b);
		}else {
			
		}
	}
}
