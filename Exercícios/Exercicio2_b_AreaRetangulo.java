import java.util.Scanner;

public class Exercicio2_b_AreaRetangulo {
	public static void main (String args[]){

		float area, base, altura;
		
		Scanner teclado;
		teclado = new Scanner (System.in);


		System.out.println("----------------");
		System.out.print(" Digite o valor da base: ");
		base = teclado.nextFloat();
		System.out.println("----------------");

		
		System.out.print(" Digite o valor da Altura: ");
		altura = teclado.nextFloat();
		System.out.println("----------------");

		area = base * altura;

		
		System.out.println(" A area do retangulo eh:  "+area);
		System.out.println("----------------");



	}
}