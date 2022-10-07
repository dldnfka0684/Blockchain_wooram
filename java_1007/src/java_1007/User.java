package java_1007;

public class User {
	
		//인스턴스 변수 생성 및 사용
		//class 안에서 선언 : static 이라는 키워드는 포함되면 안됨 접근지정자 특성 자료형 이름( = 초기값);
		//접근 지정자 
		//private : 클래스 내에서만 접근 가능
		//package : 동일한 패키지 내에서는 public 이 되고 다른 패키지에서는 private가 됩니다.
		//protected : 자신의 클래스와 상속받은 클래스 내부에서만 사용 가능
		//public : 자신의 클래스 내부 와 클래스로 만들어진 인스턴스를 통해서 접근 가능
		
		//특성
		//trasient : 직렬화할 떄 제외 -전송할 때 제외
		//volatile : 변수의 값을 복사하지 말고 직접 사용
		//final : 값을 변경하지 못하도록 하는 것
		//static : 속성을 만들고자 하는 경우 사용
		//멤버 접근 : 클래스나 인스턴스가 자신의 멤버에 접근하는 경우 클래스 내부에서는 이름만 사용하면 되는데
		//동일한 이름이 있을 때는 thus나 super.을 붙여서 사용하기도 합니다.
		//클래스나 인스턴스가 클래스 외부에서 접근할 때는 클래스이름 이나 인스턴스이름.멤버이름으로 접근합니다.
		//인스턴스 변수는 각 인스턴스가 별도로 소유합니다.
		
		//속성의 초기화
		//인스턴스 속성과 static 속성은 처음 값을 설정하지 않으면 기본값으로 초기화 됩니다.
		//boolean - false / byte, short, char, int, long - 0; / float, double - 0.0 / 나머지 - null
		//static 초기화
		//클래스 내부에 static{내용} 의 형태로 작성 클래스가 메모리에 로드 될 때 맨 처음 한 번만 호출됨 static 속성만 사용 가능
		//여러개를 만들면 순서대로 실행됨니다.
		
	
		//알번 초기화
		//클래스 내부에 {내용} 의 형태로 작성, 인스턴스를 생성할 때 마다 호출, 모든 속성을 사용하는 것이 가능
	
		//static 속성
		public static String network;
	
		//유저의 아이디, 계좌번호, 잔액을 각각의 유저가 소유하도록 선언 인스턴스 속성으로 생성
		public String id;
		public String accountNumber;
		public int balance;
		
		//이 클래스가 처음 사용될 때 한 번 수행
		static {
			System.out.println("처음에 한 번 수행");
		}
		
		
		//일반 초기화 : 인스턴스를 생성 할 때 마다 수행
		//new를 만나면 인스턴스가 생성됨, 생성자를 이용해서 작업하는 것이 일반적
		{
			System.out.println("인스턴트 생성할 때 마다 수행");
		}
		
		//값을 변경하지 못하는 읽기 전용 속성을 생성, 실제 프로그램에서는 옵션을 설정하거나
		public final String CONYRACTNAME = "고칠 수 없음";
	
		
		
		
		}
