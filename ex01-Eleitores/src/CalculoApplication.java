
public class CalculoApplication {

	public static void main(String[] args) {
		
		CalculoEleitores el = new CalculoEleitores(1000, 800, 150, 50);
		
		System.out.println(el.toString());
		System.out.println();
		System.out.println("------------------");
		System.out.println("Percentual de Votos V�lidos: "+el.calcularValido()+ " %");
		System.out.println("Percentual de Votos Brancos: "+el.calcularBranco()+ " %");
		System.out.println("Percentual de Votos Nulos: "+el.calcularNulo()+ " %");

	}

}
