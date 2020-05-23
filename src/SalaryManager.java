
public class SalaryManager {
	

	public static void main(String[] args) {
		
		SalaryManager sm = new SalaryManager();
		System.out.println("���� 2õ���� �� ����� ���Ĵ� " + sm.getMonthlySalary(20000000));
		

		
	}

	
	public double getMonthlySalary(int yearlySalary)
	{
		double monthlySalary = (yearlySalary/ 12);
		System.out.println("Monthly salary original:"+monthlySalary);

		double tax = calculateTax(monthlySalary);
		double tax1 = calculateNationalPersion(monthlySalary);
		double tax2 = calculateHealthInsureance(monthlySalary);
		double taxTotal = tax + tax1 + tax2;
		
		System.out.println("���� 1 : " + tax);
		System.out.println("���� 2 : " + tax1);
		System.out.println("���� 3 : " + tax2);
		System.out.println("���� ��Ż : " + taxTotal);

		monthlySalary -=taxTotal;
		return monthlySalary;
	}
	
	public double calculateTax(double monthlySalary)
	{
		double tax = monthlySalary*(12.5/100);
		return tax;
	}
	public double calculateNationalPersion(double monthlySalary)
	{
		double tax1 = monthlySalary*(8.1/100);
		return tax1;
	}
	public double calculateHealthInsureance(double monthlySalary)
	{
		double tax2 = monthlySalary*(13.5/100);
		return tax2;
	}

}
