package exerc�cioVetoresMatrizes;

import java.util.Scanner;

/* Autor: Edgard
 * Data:08/06/2021
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
 */

public class exercicioJavaVetoresMatrizes02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner n = new Scanner(System.in);
		
		//declarei minhas variaveis
		int[] vetor = new int[6];
		int soma=0, qntimpar=0;
		
		//declarei um ponto de partida e um ponto de parada
		for(int i=0; i<=5; i++) {
			System.out.printf("Digite um valor: ");//pede para o usuario digitar o valor do numeros
			vetor[i] = n.nextInt();//guardei no vetor os [6] numeros inteiros
			
			if(vetor[i]%2==0){// usei um if(se) e um else(senao) para encontrar um numero impar e um numero par
				soma+=vetor[i];
			}else{qntimpar++;}}
		
			System.out.printf("\nN�MEROS PARES: ");//pedi para mostrar os numeros pares de acordo com a formula que fiz ( if e else)
			
			for(int i=0; i<=5; i++) {
				if(vetor[i]%2==0){System.out.printf("| %d |", vetor[i]);}}//pedi para ele somar os numeros impares digitados
			
			System.out.printf("\nN�MEROS IMPARES: ");//escrevi para aparecer no console
			
			for(int i=0; i<=5; i++) {
				if(vetor[i]%2!=0) {System.out.printf("| %d |", vetor[i]);}}//pedi par ele somar os numeros pares digitados
			
			System.out.printf("\nA SOMA dos n�meros PARES: %d", soma);//fiz a equa��o e para mostrar 
			System.out.printf("\nA QUANTIDADE de n�meros IMPARES: %d", qntimpar);
			
			n.close();//encerrei meu programa
			
	}

	}


