import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("확인할 구구단 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println();
		
			for(int i = 1; i < 10; i++)
			{
				System.out.println(num +"X" + i + "=" +  num * i);

			}

	}

}
