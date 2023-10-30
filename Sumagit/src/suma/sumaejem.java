package suma;
import java.util.Scanner;
public class sumaejem {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println ("Introduce un número");
		double num1 = Double.parseDouble(sc.nextLine());
		System.out.println ("Introduce otro número");
		double num2 = Double.parseDouble(sc.nextLine());
		double sum = num1 + num2;
		System.out.println ("La suma es " + sum);
		sc.close();
	}

}
