import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main go = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("곱셈 : 1, 나누기 : 2, 더하기 : 3, 뺄셈 : 4");
		int num3 = sc.nextInt();
		System.out.println("값을 처리할 첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("값을 처리할 두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		if(num3 == 1)
		{
			go.gob(num1, num2);
		}
		else if(num3 == 2)
		{
			go.div(num1, num2);
		}
		else if(num3 == 3)
		{
			go.add(num1, num2);
		}
		else if(num3 == 4)
		{
			go.minus(num1, num2);
		}


		
		
	}
	
	public int add(int a, int b) {
		int hab = a + b;
		System.out.println(hab);
		return hab;
	}
	public int gob(int a, int b) {
		int gb = a * b;
		System.out.println(gb);
		return gb;
	}
	public int div(int a, int b) {
		int dv = a / b;
		System.out.println(dv);
		return dv;
	}
	public int minus(int a, int b) {
		int ms = a - b;
		System.out.println(ms);
		return ms;
	}
	
}
