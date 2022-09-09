/**
 * Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2
notas de um aluno. Calcule a média ponderada do aluno, sabendo que a nota A tem
peso 3.5 e a nota B tem peso 7.5. A soma dos pesos é 11. Assuma que cada nota
pode ir de O até 10.0, sempre com uma casa.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Calcule e imprima a variável MÉDIA conforme exemplo abaixo, com um espaço em
branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double).

*/

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		
		double a, b, media; 
		
		System.out.println("Informe a nota A ?"); 
		a = nota.nextDouble(); 
		
		System.out.println("Informe a nota B ?"); 
		b = nota.nextDouble(); 
		
		media = ((3.5 * a) + (7 * b)) / 11; 
		
		System.out.printf("A média Ponderada é: %.5f", media);
	}

}
