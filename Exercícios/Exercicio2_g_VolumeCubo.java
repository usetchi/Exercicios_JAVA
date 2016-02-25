import java.util.Scanner;

public class Exercicio2_g_VolumeCubo {
	public static void main (String args[]) {

		
		float volume, lado;

		Scanner teclado;
		teclado = new Scanner (System.in);

		System.out.println("--------------------------");
		System.out.print  ("Informe o valor do lado do cubo: ");
		lado = teclado.nextFloat();
		System.out.println("-------------------");

		volume = lado * lado * lado;

		System.out.println ("Volume do cubo eh: "+volume);
		System.out.println("-------------------");

	}
}


//g. volume de um cubo, dado seu lado ; Volume = lado * lado * lado