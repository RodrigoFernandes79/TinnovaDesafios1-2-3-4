import java.util.Scanner;

public class SomaMultiplosApplication {

	public static void main(String[] args) {
		System.out.println("------------");
		System.out.println("Soma de M?ltiplos:");
		System.out.println("============");
		System.out.println("Digite um n?mero inteiro a ser calculado a Soma dos M?ltiplos de 3 e 5:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("O n?mero digitado foi: " + n);
		int soma = 0;
		System.out.print("A soma entre: ");
		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 || i % 5 == 0) {

				soma = soma + i;

				System.out.print(i + " ");

			}

		}
		System.out.print("? igual a: " + soma);
		sc.close();
	}
}
