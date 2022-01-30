package LacoRepeticao;

import java.util.Scanner;

/*
 * 3- Solicitar a idade de várias pessoas e imprimir:
 *Total de pessoas com menos de21 anos. Total de pessoas 
 *com mais de 50 anos.
  O programa termina quando idade for =-99. (WHILE)
 */
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int vinte1=0,cinquenta1=0,i=0;
		int[] vet = new int[200];
		boolean repetir =true;
		
		System.out.println("Digite -99 para terminar programa:");
		
		while(repetir) {
			System.out.println("Digite sua idade: ");
			vet[i] = entrada.nextInt();
			if (vet[i] == -99) {
				System.out.println();
				repetir = false;
			}else {
				i++;
			}
		}
		while(i > 0){
			if(vet[i]<21) {
				vinte1++;
			}
			if(vet[i]>50) {
				cinquenta1++;
			}
			i--;
		}
		System.out.println("Pessoas com menos de 21 anos: "+vinte1);
		System.out.println("Pessoas com mais de 50 anos: "+cinquenta1);

		entrada.close();

	}
}
