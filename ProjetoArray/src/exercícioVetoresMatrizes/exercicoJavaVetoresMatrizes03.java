package exercícioVetoresMatrizes;

//Autor:Edgard
//Dta:08/06/2020
//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
import java.util.Scanner;

public class exercicoJavaVetoresMatrizes03 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int cont = 0;

		Scanner m = new Scanner(System.in);

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("Digite um valor: ");
				matriz[l][c] = m.nextInt();

				if (matriz[l][c] > 10) {
					cont++;
				}
			}
		}

		System.out.println("\n");

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf(" | %d |", matriz[l][c]);
			}
			System.out.println("");
		}

		System.out.printf("\nHá %d números maiores que 10 na matriz.", cont);

		m.close();
	}

}
