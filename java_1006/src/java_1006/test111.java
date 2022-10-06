package java_1006;

public class test111 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i=i+1)
		{
			if(i<3) {
				for(int j=0;j<i+1;j=j+1)
				{
					System.out.println("*");
				}else {
					for(int j=0;j<5-i;j=j+1)
					{
						System.out.println("*");
					}
				}
			}
			System.out.println("");
		}
	}

}

