package week1.day2;

public class Calculator {
	public static void main(String[] args) {
		Calculator CAL=new Calculator();
		CAL.MyCalculator();
		int add=CAL.addThreeNumbers(1,2,3);
		System.out.println(add);
		int sub=CAL.subTwoNumbers(3,2);
		System.out.println(sub);
		double multiply=CAL.multiplyTwoNumbers(2,2);
		System.out.println(multiply);
		float divide=CAL.divideTwoNumbers(4,2);
		System.out.println(divide);
	}
	public void MyCalculator() {
	}
	public int addThreeNumbers(int a, int b, int c) {
		return a+b+c;
	}
	public int subTwoNumbers(int a , int b) {
		return a-b;
	}
	public double multiplyTwoNumbers(double a , double b) {
		return a*b;
	}
	public float divideTwoNumbers(float a , float b) {
		return a/b;
	}

}
