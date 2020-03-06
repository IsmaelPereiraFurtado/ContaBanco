package application;
import java.util.Scanner;
import java.util.Locale;
import entidade.AreaTriangulo;

public class Triangulo {
	
	public static void main(String[]arg) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AreaTriangulo x, y;
		x = new AreaTriangulo();
		y = new AreaTriangulo();
		
		
		System.out.println("Digite a medidas do triangulo X ");
	
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite as medidas do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		

		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("A area do triangulo X é %.4f%n", areax);
		System.out.printf("A area do traigulo Y é %.4f%n", areay);
		
		if (areax < areay) {
			System.out.println("A area maior é  (Y)");
			}else {
			System.out.println("A area maior é (X)");
			}
		System.out.println("Ismael é lindo");
		sc.close();
	}
	
}
