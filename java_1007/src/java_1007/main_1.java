package java_1007;

public class main_1 {

	public static void main(String[] args) {
		// 메서드의 특성에 static 을 추가하면 이 메서드는 static 메서드가 됨니다
		//그러면, 클래스 이름만으로 호출이 가능합니다.
		//static 메서드는 static이 붙지 않은 인스턴스 속성은 사용할 수 없음
		
		//매개변수가 없고 리턴도 없는 인스턴스 메서드를 만들어서 호출하기
		//Hellow Java를 3번 출력하는 작업 수행
		
		//static 이 붙지 않은 메서드를 호출할 땐 인스턴스를 생성한 후 인스턴스를 이용해서 호출
		methodClass Methodclass = new methodClass();
		Methodclass.func();
		
		
		//매개변수가 정수 1개인 메서드 호출
		Methodclass.printDisp(6);
		
		Methodclass.disp("블록체인", 5);
		
		//메서드를 호출하기 위해서 알아야 할 것
		//static의 존재 여부 : static이 있으면 클래스 이름으로 호풀하고, static이 없으면 인스턴스를 이용해서 호출해야 합니다.
		// 매개변수의 자료형과 순서 : 메서드의 매개변수가 있으면 매개변수를 자료형을 맞추어서 순서대로 대입해야 합니다.
		//return의 역할 : 함수의 수행을 종료하고 함수를 호출한 곳으로 제어권을 이용
		//return데이터 : 함수의 수행을 종료하고 함수를 호출한 곳으로 이동할 때 데이터를 가지고 간다라는 의미인데
		//이 경우에는 returntype 자리에 데이터의 자료형을 기재해야 합니다.
		//함수의 수행을 종료하고 데이터를 리턴해주면 이 데이터를 가지고 다른 작업을 연속해서 수행할 수 있습니다.
		
		Methodclass.returnMethod(false);
		Methodclass.noReturn(10, 20);
		int r = (int) Methodclass.hasReturn(10, 20);
		r = Methodclass.hasReturn(r, 30);
		System.out.println(r);
		Methodclass.noReturn3(10, 20, 30);
		
		
		}
	}


