import java.util.Scanner;

public class Exercicio2_c_AreaTriangulo {
	public static void main (String args[]){
		
		float base, area, altura;

		Scanner teclado;
		teclado = new Scanner (System.in);

		System.out.println("-------------------");
		System.out.print("Digite a Base: ");
		base = teclado.nextFloat();
		System.out.println("-------------------");

		System.out.print("Digite a Altura: ");
		altura = teclado.nextFloat();
		System.out.println("-------------------");

		area = (base * altura)/2;

		System.out.println("Valor da Area eh: "+area);
		System.out.println();


	}
}