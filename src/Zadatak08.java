
public class Zadatak08 {
public static void main(String[] args) {
	int num = (int) (10000 + Math.random() * 100000);
	System.out.println(num);
	int num1 = num % 10;
	int num2 = num / 10 % 10;
	int num3 = num /100 % 10;
	int num4 = num /1000 % 10;
	int num5 = num /10000 % 10;
	System.out.println(num5);
	System.out.println(num4);
	System.out.println(num3);
	System.out.println(num2);
	System.out.println(num1);
}
}
