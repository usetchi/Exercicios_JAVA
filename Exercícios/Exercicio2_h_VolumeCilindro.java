import java.util.Scanner;

public class Exercicio2_h_VolumeCilindro {
	public static void main (String args[]) {

		float volume, raio, altura;
		float PI = 3.14f;


		Scanner teclado;
		teclado = new Scanner (System.in);

		System.out.println("--------------------------");
		System.out.print  ("Informe o valor do raio: ");
		raio = teclado.nextFloat();
		System.out.println("--------------------------");
		System.out.print  ("Informe o valor da altura: ");
		altura = teclado.nextFloat();
		System.out.println("-------------------");

		volume = PI * raio * raio * altura;

		System.out.println ("Volume de um cilindro eh: "+volume);
		System.out.println("-------------------");


	}

}





//h. volume de um cilindro, dado seu diâmetro e considerando pi=3,14 ; Volume = PI * raio * raio * altura