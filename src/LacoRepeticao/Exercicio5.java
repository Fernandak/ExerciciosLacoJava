package LacoRepeticao;

import java.util.Scanner;

/*
 * 5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 */
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num, soma=0;

		do {
			System.out.println("Digite um numero do teclado: ");
			num = entrada.nextInt();

			soma += num;
		}
		while(num !=0);
		System.out.println("Soma dos numeros digitados: "+num);
		entrada.close();	 
	}

}


