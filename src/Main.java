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
			System.out.println(number + "���� 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(number + "���� 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println(number + "���� 28�� �Ǵ� 29�ϱ��� �ֽ��ϴ�.");
			break;
		default :
			System.out.println(" 12�� ���� ���ڸ� �ٽ� �Է����ּ��� ");
			break;


		}
	}
	
	
}
