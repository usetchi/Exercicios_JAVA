import java.util.Scanner;

public class Exercicio2_e_Trapezio {
	public static void main (String args[]) {

		float area, basemaior, basemenor, altura;

		Scanner teclado;
		teclado = new Scanner (System.in);

		System.out.println("-------------------");
		System.out.print  ("Informe a maior base: ");
		basemaior = teclado.nextFloat();
		System.out.println("-------------------");
		System.out.print  ("Informe a menor base: ");
		basemenor = teclado.nextFloat();
		System.out.println("-------------------");
		System.out.print  ("Informe a altura: ");
		altura = teclado.nextFloat();
		System.out.println("-------------------");

		area = (basemaior + basemenor) * altura / 2;

		System.out.println ("A area do trapézio  eh : "+area);
		System.out.println("-------------------");

	}

}



//área de um trapézio, dadas suas bases e sua altura
//Área = (base maior + base menor)* altura /2