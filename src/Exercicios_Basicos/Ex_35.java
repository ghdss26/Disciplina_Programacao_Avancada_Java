/** 
 * Escreva um programa para calcular e escrever o valor de S, sendo S dado pela 
 * fórmula: S = 1 + 3/2 + 5/4 + 7/8 +... + 39/?
 * 
 * Entrada = Não há nenhuma entrada neste problema. 
 * 
 * Saída = A saída contém um valor correspondente ao valor de S.
 * 
 */

package Exercicios_Basicos;

public class Ex_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 1; 
		double b = 2;
		
		for(int i = 3; i < 40; i++) {
			
			a += i / b;
			
			i++;
			
			b *= 2;
		}
		
		System.out.printf("%.2f", a);
	}

}
