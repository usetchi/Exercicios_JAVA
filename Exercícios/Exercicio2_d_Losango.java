import java.util.Scanner;


public class Exercicio2_d_Losango {
	public static void main (String args[]){

		float area, diagonal1, diagonal2;

		Scanner teclado;
		teclado = new Scanner (System.in);

		System.out.println("-------------------");
		System.out.print  ("Informe a Diagonal 1: ");
		diagonal1 = teclado.nextFloat();
		System.out.println("-------------------");
		System.out.print  ("Informe a Diagonal 2: ");
		diagonal2 = teclado.nextFloat();
		System.out.println("-------------------");

		area = diagonal1 * diagonal2;

		System.out.println ("Are Losando eh: "+area);
		System.out.println("-------------------");



	}


}