import java.util.Scanner;

public class FatorialApplication {

	public static void main(String[] args) {
		
		System.out.println("------------");
		System.out.println("C?lculo de Fatorial:");
		System.out.println("============");
		System.out.println("Digite um n?mero inteiro a ser calculado o seu fatorial:");
		Scanner sc = new Scanner(System.in);
		int fat = sc.nextInt();
		System.out.println("O n?mero digitado foi: " + fat);

		int f = 1;
		System.out.print("O Fatorial de: " + fat + "! => ");
		for (int i = 1; i <= fat; ++i) {

			f = f * i;
			if (i < fat) {
				System.out.print(i + " x ");

			} else if (i == 1) {

			} else {
				System.out.print(i + " = ");
			}

		}
		System.out.print(f);
		sc.close();
	}
	
}
