/** 
 * 
 * Construa um programa para determinar se o indivíduo está com um peso 
 * favorável ou não. Essa situação é determinada através do IMC (Índice de Massa 
 * Corpórea), que é definida como sendo a relação entre o peso (PESO) e o quadrado 
 * da Altura (ALTURA) do indivíduo. Ou seja, IMC = PESO / (ALTURA*ALTURA) e, a 
 * situação do peso é determinada pela tabela abaixo:  
 * 
 * Entrada = Receber o peso (float) e a altura (float). 
 * 
 * Saída = Imprimir o IMC e a situação do paciente conforme tabela.
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		double peso; 
		double altura; 
		double imc;
		
		System.out.println("informe o peso da pessoa: ");
		peso = sc.nextDouble(); 
		
		System.out.println("Informe a altura da pessoa: "); 
		altura = sc.nextDouble(); 
		
		imc = (peso / (altura * altura)); 
		
		System.out.println("Seu Imc é: " + imc);
		
		if(imc <= 20) {
			
			System.out.println("Abaixo do Peso");
			
		} else if(imc > 20 && imc <= 24.9) {
			
			System.out.println("Peso Normal"); 
			
		} else if(imc > 25 && imc <= 29.9) { 
			
			System.out.println("Sobrepeso");
			
		} else if(imc > 30 && imc <= 39.9) {
			
			System.out.println("Obeso");
			
		} else if(imc >= 40) {
			
			System.out.println("Obeso Mórbido");
		}
	}

}
