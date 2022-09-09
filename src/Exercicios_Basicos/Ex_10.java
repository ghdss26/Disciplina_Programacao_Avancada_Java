package Exercicios_Basicos;

import java.util.Scanner;

/* 
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a
em anos, meses e dias. Obs: Apenas para facilitar o cálculo, considere todo ano
com 365 dias e todo mês com 30 dias.
 */

public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ano, mes, dia, numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		numero = sc.nextInt(); 
		
		ano = numero / 365; 
		mes = (numero % 365) / 30;
		dia = (numero % 365) % 30; 
		
		System.out.printf("%d ano(s) \n", ano);
		System.out.printf("%d mes(s) \n", mes);
		System.out.printf("%d dia(s) \n", dia);
		
	}

}
