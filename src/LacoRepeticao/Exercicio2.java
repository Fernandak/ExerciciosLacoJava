package LacoRepeticao;

import java.util.Scanner;

/*
 * 2- Ler 10 n�meros e imprimir quantos s�o pares 
 * e quantos s�o �mpares. (FOR)
 */
public class Exercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num=10, par=0, impar=0; 
		int[] vet = new int[1];

		for (int i=0; i < num; i++) {	
			System.out.println("Digite um numero: ");
			vet[i] = entrada.nextInt();
		}

		for (int i=0; i < num; i++) {
			if (vet[i] % 2 == 0 ) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Os n�meros pares s�o:"+par);
		System.out.printf("Os n�meros impares s�o: "+impar);
		entrada.close();

	}
}
