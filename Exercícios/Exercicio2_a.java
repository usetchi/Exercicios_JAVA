import java.util.Scanner;

public class Exercicio2_a {
	public static void main (String args[]) {

		float lado, area;

		
		Scanner teclado;
		teclado = new Scanner (System.in);

		System.out.println ("Digite o Lado do quadrado: ");
		lado = teclado.nextFloat();
			   
		System.out.println ("-----------");
		area = lado * lado;

		System.out.println ("A area do quadrado eh: "+ area);


	}
}