import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main mn = new Main();
		mn.whileloop();
		
	}
	
	public void whileloop() {
		int loop=0;
		while(loop<12) {
			loop++;
			switchStatement(loop);
		}
	}
	

	public void switchStatement(int number) {
		switch(number) {
		case 1:
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(number + "월은 31일까지 있습니다.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(number + "월은 30일까지 있습니다.");
			break;
		case 2:
			System.out.println(number + "월은 28일 또는 29일까지 있습니다.");
			break;
		default :
			System.out.println(" 12월 안의 숫자를 다시 입력해주세요 ");
			break;


		}
	}
	
	
}
