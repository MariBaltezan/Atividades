import java.util.Scanner;
public class exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("por favor, digite seu salario bruto");
		double salario = sc.nextFloat();
		double diferenca = 0;
		
		if(salario < 1000 ){
			diferenca = salario * 0.06;
		}else if(salario <= 2500 ) {
			diferenca = salario * 0.08;
		}else if(salario <= 4.800) {
			diferenca = salario * 0.10;
		}else {
			diferenca = salario * 0.15;
		}
		System.out.println ("seu salario é: " + (salario - diferenca));
		
}
}

