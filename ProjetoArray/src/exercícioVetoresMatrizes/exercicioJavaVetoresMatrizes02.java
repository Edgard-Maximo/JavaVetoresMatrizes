package exercícioVetoresMatrizes;

import java.util.Scanner;

/* Autor: Edgard
 * Data:08/06/2021
 * 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
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
		
			System.out.printf("\nNÚMEROS PARES: ");//pedi para mostrar os numeros pares de acordo com a formula que fiz ( if e else)
			
			for(int i=0; i<=5; i++) {
				if(vetor[i]%2==0){System.out.printf("| %d |", vetor[i]);}}//pedi para ele somar os numeros impares digitados
			
			System.out.printf("\nNÚMEROS IMPARES: ");//escrevi para aparecer no console
			
			for(int i=0; i<=5; i++) {
				if(vetor[i]%2!=0) {System.out.printf("| %d |", vetor[i]);}}//pedi par ele somar os numeros pares digitados
			
			System.out.printf("\nA SOMA dos números PARES: %d", soma);//fiz a equação e para mostrar 
			System.out.printf("\nA QUANTIDADE de números IMPARES: %d", qntimpar);
			
			n.close();//encerrei meu programa
			
	}

	}


