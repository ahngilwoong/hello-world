import java.util.Scanner;

public class Main {
	int nowMoney;
	int insert;

	public void setMoney(int nowMoney) {
		this.nowMoney = nowMoney;
	}

	int result = 0;
	int sum = 0;
	
	
	public int insertMoney(int insert) {
		if (insert >= 5000) { 
			System.out.println("õ�� ������ ���� �����մϴ� �ٽ� �־��ּ���.");
		}
		return insert;
	}
	
	public void function() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Ǵ� ������ �־��ּ���> ");
		Main mn = new Main();
		mn.nowMoney = sc.nextInt();
		mn.insertMoney(mn.nowMoney);
		mn.showWindow(mn.nowMoney);
		while (true) {
			if(mn.nowMoney < 800) {
				sum = sum+mn.nowMoney;				
				System.out.println("���� �ݾ���" + sum + "�Դϴ�.");
				if(sum >= 800) {
					mn.selectMenu();
				}
				else {
					function();
				}
			}

			else if (mn.nowMoney >= 5000) {
				mn.function();
				break;
			}
			else if (mn.nowMoney >= 800) {
				mn.selectMenu();
			}
		}
		
	}



	public void showWindow(int insert) {
		if(insert < 5000) {
			System.out.println("���� ���Ե� �ݾ���" + insert + "�Դϴ�.");
		}
		else {
			System.out.println("���� ���Ե� �ݾ���" + "�����ϴ�");
		}
	}

	public void Menu() {
		System.out.println("+---���Ḧ ����ּ���-----+");
		System.out.println("| 1. ���䷹��    800��          ");
		System.out.println("| 2. ��ī������Ʈ 900��       ");
		System.out.println("| 3. ȯŸ      1000��            ");
		System.out.println("| 4. �ݶ�      1000��            ");
		System.out.println("| 5. �ܵ� ����                       ");
		System.out.println("+-------------------+");
	}

	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		Menu();
		int mu = sc.nextInt();
		int a = 800;
		int b = 900;
		int c = 1000;
		int d = 1000;
		
		if (mu == 1) {
			if(nowMoney >=a) {
			System.out.println("���䷹�̸� ���̽��ϴ�.");
			nowMoney = nowMoney - a;
			}
			else {
				System.out.println("���� �ݾ�"+nowMoney+"���� �´� ��ǰ�� �������ּ���.");
				selectMenu();
			}
		}
		if (mu == 2) {
			if(nowMoney >=b) {
			System.out.println("��ī������Ʈ�� ���̽��ϴ�.");
			nowMoney = nowMoney - b;
			}
			else {
				System.out.println("���� �ݾ�"+nowMoney+"���� �´� ��ǰ�� �������ּ���.");
				selectMenu();
			}
		}
		if (mu == 3) {
			if(nowMoney >=c) {
			System.out.println("ȯŸ�� ���̽��ϴ�.");
			nowMoney = nowMoney - c;
			}
			else {
				System.out.println("���� �ݾ�"+nowMoney+"���� �´� ��ǰ�� �������ּ���.");
				selectMenu();
			}
		}
		if (mu == 4) {
			if(nowMoney >=d) {
			System.out.println("�ݶ� ���̽��ϴ�.");
			nowMoney = nowMoney - d;
			}
			else {
				System.out.println("���� �ݾ�"+nowMoney+"���� �´� ��ǰ�� �������ּ���.");
				selectMenu();
			}
		}
		if (mu == 5) {
			change();
		}
		System.out.println("�ܵ���" + nowMoney + "�Դϴ�.");
		return nowMoney;
	}
	
	public void change() {
		System.out.println("�ܵ�" + nowMoney + "�� �����մϴ�.");
	}

	
	public static void main(String[] args) {
		Main mn = new Main();
		mn.function();

	}
}


