package week1.day2;

public class LearnMethods {
	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		obj.CarName();
		int RegNumber = obj.getRegNumber();
		System.out.println(RegNumber);
		String CarVarient = obj.getCarVarient();
		System.out.println(CarVarient);
		int Multiply = obj.MultiplyTwoNumbers(3, 3);
		System.out.println(Multiply);
		
	}
	public void CarName() {
		System.out.println("xuv");
	}
	public int getRegNumber() {
		int RegNumber = 9548;
		return RegNumber;
	}
	public String getCarVarient() {
		return "petrol";
	}
	public int MultiplyTwoNumbers(int a, int b) {
		return a*b;
	}	
		
}		

