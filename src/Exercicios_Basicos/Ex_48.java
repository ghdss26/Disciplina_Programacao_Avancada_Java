/** 
 * 
 * Elabore um programa que, a partir da idade e do peso de um paciente, lidas via 
 * teclado, calcule a dosagem de determinado medicamento e escreva a receita 
 * Informando quantas gotas do medicamento. O paciente deve tomar por dose. 
 * Considere que o medicamento em questão possui 500 mg por ml, o que cada ml 
 * corresponde a 20 gotas.
 * 
 * ● Adultos ou adolescentes desde 12 anos, Inclusive, se tiverem peso igual ou 
 * acima dos 60 quilos devem tomar 1000 mg; com peso abaixo dos 60 quilos 
 * devem tomar 875 mg.
 * 
 * ● Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo peso corpóreo. 
 * 
 * Entrada = Receber a idade (int) e o peso (float). 
 * 
 * Saída = Imprimir a receita informando quantas gotas do medicamento o paciente deve tomar por dose.
 * 
 */

package Exercicios_Basicos;

import java.util.Scanner;

public class Ex_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		double peso; 
		
		double dosagem;
		double gotas = 0;
		
		System.out.println("Informe a idade do paciente: "); 
		idade = sc.nextInt(); 
		
		System.out.println("Informe o peso do paciente: ");
		peso = sc.nextDouble(); 
		
		if(idade >= 12 && peso >= 60) {
			
			dosagem = 1000;
			
			gotas = dosagem / 25;
			
		} else if(idade >= 12 && peso <= 60) {
			
			dosagem = 875; 
			
			gotas = dosagem / 25;
		}
		
		if(idade < 12 && peso > 5 && peso < 9) {
			
			dosagem = 125; 
			
			gotas = dosagem / 25;
			
		} else if(idade < 12 && peso > 9.1 && peso < 16) {
			
			dosagem = 250; 
			
			gotas = dosagem / 25;
			
		} else if(idade < 12 && peso > 16.1 && peso < 24) {
			
			dosagem = 375; 
			
			gotas = dosagem / 25;
			
		} else if(idade < 12 && peso > 24.1 && peso < 29.9) {
			
			dosagem = 500;
			
			gotas = dosagem / 25;
			
		} else if(idade < 12 && peso > 30) {
			
			dosagem = 750;
			
			gotas = dosagem / 25;
		}
		
		System.out.println("Quantidade de gotas: " + gotas + " gotas ");
	}

}
