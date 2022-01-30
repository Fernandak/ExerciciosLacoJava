package LacoRepeticao;

import java.util.Scanner;

/*
 * 6- Escrever um programa que receba vários números
 *inteiros no teclado.E no final imprimir a média dos
 *números múltiplos de 3. Para sair digitar 0(zero).
 *(DO...WHILE)
 */
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num, soma=0, contador=0;
		double media=0;
		System.out.println("Para sair digite 0(Zero)");
		do {
			System.out.println("Digite um numero: ");
			num = entrada.nextInt();

			if(num %3==0 && num!=0)
			{
				soma = soma+num;
				contador++;
			}			
		}while(num !=0);
		
		media = soma/contador;
		System.out.println("Média dos numeros digitados: "+media);
		entrada.close();
	}


}



