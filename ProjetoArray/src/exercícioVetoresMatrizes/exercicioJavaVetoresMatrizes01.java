package exercícioVetoresMatrizes;
/* Autor: Edgard
 * Data:08/06/2021
 * 1- Faça um programa que possua um vetor denominado A que armazene 6 números 
 * inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) armazene em uma variável inteira (simples) a soma entre os valores das 
    posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.

 * */

public class exercicioJavaVetoresMatrizes01 {

	public static void main(String[] args) {
	
	
		int[] n1 = new int[6];//declarei as variantes e quais seriam o numero de amarzenamento
		
		int soma = 0;
		int valor= 0, mais =105;
		
		n1[0] = 1;
		n1[1] = 0;
		n1[2] = 5;
		n1[3] = -2;
		n1[4] = -5;
		n1[5] = 7;
		
		soma+= n1[0] + n1[1] + n1[5];//fiz uma equação de somo igual o exercicio pediu
		
		mais+= valor = n1[4];//apliquei a equação
		
		
		for(int i = 0; i < 5; i++ ) {//usei o for para mostrar quantas vezes o int vai rodar.
		System.out.println(i + " - " + n1[i]);// usei na concatenação o " - " para separar os numeros.
			
		}
		
		  System.out.println("RESULTADO DA SOMA ==> " + soma);
	        System.out.println("RESULTADO POSIÇÃO 04 ==> "+ mais);

	        n1[0] = 1;
	        n1[1] = 0;
	        n1[2] = 5;
	        n1[3] = -2;
	        n1[4] = -5;
	        n1[5] = 7;
	}

}