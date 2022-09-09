//Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis
// (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100,
// 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

// Entrada 
// O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

// Saída
// Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo
// necessárias, conforme o exemplo fornecido.

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n = new Scanner(System.in); 
		
		double[] notas = {100, 50, 20, 10, 5, 2, 1}; 
		
		int cont = 0; 
		
		double N = 0;
		
		System.out.println("Informe um número"); 
		N = n.nextInt(); 
		
		for(int i = 0; i < notas.length; i++) {
			
			cont = (int) (N / notas[i]);
			N %= notas[i]; 
			
			System.out.println(cont + " notas(s) de R$: " + notas[i]);
		}
		
	}

}
