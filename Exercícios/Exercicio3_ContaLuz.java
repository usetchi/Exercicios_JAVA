/*3. Sabendo que o valor de 100 kw corresponde a 1/7 do valor do salário mínimo, faça um
programa Java que receba o valor do salário mínimo e a quantidade de kw gasta por uma
residência e calcule:
a. o valor em reais de cada kw.
b. o valor em reais a ser pago
c. o novo valor a ser pago por essa residência com um desconto de 10%
*/

import java.util.Scanner;

public class Exercicio3_ContaLuz {
	public static void main (String args[]) {


		float salario , kw_consumo, valor_pago, desconto, umkw, valor_pago_des;
		
		Scanner teclado;
		teclado = new Scanner (System.in);


		System.out.println("--------------------------");
		System.out.print  ("Digite o valor do salario mínimo: ");
		salario = teclado.nextFloat();
		
		System.out.println("--------------------------");
		System.out.print  ("Digite o valor do kW: ");
		kw_consumo = teclado.nextFloat();
		

		umkw = salario/700;

		System.out.println("------------------------------");
		System.out.println("Valor em reais de cada kw eh R$: "+umkw);

		
		valor_pago = kw_consumo * umkw;

		System.out.println("------------------------------");
		System.out.println("Valor em reais a ser pago eh R$: "+valor_pago);		

		
		desconto = (valor_pago *10f)/100;

		System.out.println("--------------------------");
		System.out.println("Desconto de 10% eh R$: " +desconto);

		valor_pago_des = valor_pago - desconto;

		System.out.println("--------------------------");
		System.out.println("Valor a pagar com desconto de 10% eh R$: " +valor_pago_des);
		System.out.println("-------------------");
		

	}
}