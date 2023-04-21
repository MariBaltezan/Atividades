import java.util.Scanner;
public class exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bom dia! nossas maçãs custam 0,30 centavos quando compradas em menos de meia duzia, a 0,25 quando acima de meia duzia\ngostaria de quantas maças?");
		int Macavalor = sc.nextInt();
	
		if(Macavalor < 11){
			System.out.println ("seu valor é " + (Macavalor * 0.30) + " você comprou " + +Macavalor + " maças!" );
		}else {
			System.out.println ("seu valor é " + (Macavalor * 0.25)+ " você comprou " + +Macavalor +" maças!" );
		}
		
	
	}
}
