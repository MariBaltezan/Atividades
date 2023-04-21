import java.util.Scanner;
//como importar classe ^^
public class exercicio1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro número:");
	int valor01 = sc.nextInt();
	
	System.out.println("Digite o segundo número:");
	int valor02 = sc.nextInt();
	
	System.out.println("Digite o terceiro número:");
	int valor03 = sc.nextInt();
	
	//else if maior 
	
	if(valor01 > valor02 & valor01 > valor03) { 
	System.out.println("o maior valor é: " + valor01);
	}else if(valor02 > valor01 & valor02 > valor03) { 
		System.out.println("o maior valor é: " + valor02);
	}else if(valor03 > valor01 & valor03 > valor02) { 
		System.out.println("o maior valor é: " + valor03);
	}else{ 
			System.out.println("os valores são iguais: " + valor01 + ", "  + valor02 + ", " +  valor03); 
	}
	
	//else if menor
	if(valor01 < valor02 & valor01 < valor03) { 
		System.out.println("o maior valor é: " + valor01);
	}else if(valor02 < valor01 & valor02 < valor03) { 
		System.out.println("o menor valor é: " + valor02);
	}else if(valor03 < valor01 & valor03 < valor02) { 
		System.out.println("o menor valor é: " + valor03);
	}else{ 
		System.out.println(""); 
		}
	
  }
}
