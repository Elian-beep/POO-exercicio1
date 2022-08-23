package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret1 = new Retangulo();
		System.out.println("Digite a largura e altura do retangulo:");
		ret1.width = sc.nextDouble();
		ret1.height = sc.nextDouble();
		
		double area = ret1.area();
		double perimetro = ret1.perimetro();
		double diagonal = ret1.diagonal();
		
		System.out.printf("AREA: %.2f\n", area);
		System.out.printf("PERÍMETRO: %.2f\n", perimetro);
		System.out.printf("DIAGONAL: %.2f\n", diagonal);
		
		sc.close();

	}

}
