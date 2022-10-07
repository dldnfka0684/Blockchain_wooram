package java_1007;
//객체 지향 언어에서는 전역 변수를 만드는 것 과 변수를 직접 핸들링하는 것을 금기시 합니다.
public class main {

	public static void main(String[] args) {
		//User 클래스의 인스턴스 만들기
		User user1 = new User();
		user1.id = "itggangpae";
		user1.accountNumber = "110";
		user1.balance = 3000;
		
		User user2 = new User();
		user2.id = "itstudy";
		user2.accountNumber = "220";
		user2.balance = 2500;
		
		//Class를 이용한 static 접근
		User.network = "bitcoin";
		user1.network = "etherium";
		
		//id 는 instance 속성이라서 각자소유
		System.out.println(user1.id);
		System.out.println(user2.id);
		
		//network는 static 속성이라서 공유 마지막 것을 기준으로 공유
		System.out.println(user1.network);
		System.out.println(user2.network);
		System.out.println(User.network);
		
		//지역 변수 : 메서드 안에서 만든 변수(자동초기화가 안되므로 데이터를 대입하지 않고 사용하는것은 에러 발생)
		
		//int x;
		//System.out.println(x);
		User user3 = new User();
		System.out.println(user3.id);
		System.out.println(user3.balance);
		user3.balance = 100;
		final int readOnlyValue = user3.balance; 
		
		//메서드 특성
		//static : 클래스로 호출 가능한 메서드
		//abstract : 내용이 없는 메소드 반드시 함수를 구현해서 사용
		//final : 재정의 (Overriding)할 수 없는 메서드
		//synchronized : 멀티 스레드 환경에서 순차적으로 하나씩 수행해야 하는 메서드
		//native : C언어와 같은 native 언어의 한수나 메서드를 호출하고자 할 때 사용
		
		//returntype : 함수의 작업이 끝나고 난 후 남겨주는 데이터의 자료형으로 남겨주는 데이터가 없을 때는 void 라고 해야 합니다.
		//매개변수(argument, parameter) : 함수느 메서드 외부에서는 argument 라는 표현을 사용하고 내부에서는 parameter 라고 하기도 합니다.
		//함수를 호출할 때 넘겨주는 데이터로 함수의 수행에 필요한 데이터 입니다. 없으면 () 해도 됩니다.
		
		//함수를 만드는 목적
		//중복된 코드제거 : 자주 사용되는 코드는 하나의 이름으로 묶어두고 재사용
		//모듈화 : 한꺼번에 수행되어야 하는 코드의 길이가 너무 긴 경우 작게 잘라서 구현, 코드의 가독성이 좋아지고 메모리효율도 높아짐
		//이러한 메서드가 private 으로 만들어집니다.
		methodClass.func();
		
	}

}
