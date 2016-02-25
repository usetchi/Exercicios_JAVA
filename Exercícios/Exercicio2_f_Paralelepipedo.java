import java.util.Scanner;

public class Exercicio2_f_Paralelepipedo {
	public static void main (String args[]) {

	float volume, profundidade, largura, altura;

		Scanner teclado;
		teclado = new Scanner (System.in);

		System.out.println("--------------------------");
		System.out.print  ("Informe a altura: ");
		altura = teclado.nextFloat();
		System.out.println("--------------------------");
		System.out.print  ("Informe largura: ");
		largura = teclado.nextFloat();
		System.out.println("--------------------------");
		System.out.print  ("Informe a profundidade: ");
		profundidade = teclado.nextFloat();
		System.out.println("-------------------");

		volume = altura * largura * profundidade;

		System.out.println ("Volume de um paralelepípedo eh: "+volume);
		System.out.println("-------------------");

	}

}



//f. volume de um paralelepípedo, dadas suas dimensões
//Volume = altura * largura * profundidade