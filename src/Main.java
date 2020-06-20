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
			System.out.println("천원 단위의 지폐만 가능합니다 다시 넣어주세요.");
		}
		return insert;
	}
	
	public void function() {
		Scanner sc = new Scanner(System.in);
		System.out.println("지폐 또는 동전을 넣어주세요> ");
		Main mn = new Main();
		mn.nowMoney = sc.nextInt();
		mn.insertMoney(mn.nowMoney);
		mn.showWindow(mn.nowMoney);
		while (true) {
			if(mn.nowMoney < 800) {
				sum = sum+mn.nowMoney;				
				System.out.println("현재 금액은" + sum + "입니다.");
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
			System.out.println("현재 투입된 금액은" + insert + "입니다.");
		}
		else {
			System.out.println("현재 투입된 금액은" + "없습니다");
		}
	}

	public void Menu() {
		System.out.println("+---음료를 골라주세요-----+");
		System.out.println("| 1. 게토레이    800원          ");
		System.out.println("| 2. 포카리스웨트 900원       ");
		System.out.println("| 3. 환타      1000원            ");
		System.out.println("| 4. 콜라      1000원            ");
		System.out.println("| 5. 잔돈 배출                       ");
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
			System.out.println("게토레이를 고르셨습니다.");
			nowMoney = nowMoney - a;
			}
			else {
				System.out.println("현재 금액"+nowMoney+"원에 맞는 상품을 선택해주세요.");
				selectMenu();
			}
		}
		if (mu == 2) {
			if(nowMoney >=b) {
			System.out.println("포카리스웨트를 고르셨습니다.");
			nowMoney = nowMoney - b;
			}
			else {
				System.out.println("현재 금액"+nowMoney+"원에 맞는 상품을 선택해주세요.");
				selectMenu();
			}
		}
		if (mu == 3) {
			if(nowMoney >=c) {
			System.out.println("환타를 고르셨습니다.");
			nowMoney = nowMoney - c;
			}
			else {
				System.out.println("현재 금액"+nowMoney+"원에 맞는 상품을 선택해주세요.");
				selectMenu();
			}
		}
		if (mu == 4) {
			if(nowMoney >=d) {
			System.out.println("콜라를 고르셨습니다.");
			nowMoney = nowMoney - d;
			}
			else {
				System.out.println("현재 금액"+nowMoney+"원에 맞는 상품을 선택해주세요.");
				selectMenu();
			}
		}
		if (mu == 5) {
			change();
		}
		System.out.println("잔돈은" + nowMoney + "입니다.");
		return nowMoney;
	}
	
	public void change() {
		System.out.println("잔돈" + nowMoney + "를 배출합니다.");
	}

	
	public static void main(String[] args) {
		Main mn = new Main();
		mn.function();

	}
}


