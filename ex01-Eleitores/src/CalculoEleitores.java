
public class CalculoEleitores {

	
	private int totalEleitor;
	private int votosValidos;
	private int votosBrancos;
	private int votosNulos;
	
	
	public CalculoEleitores() {
		super();
	}


	public CalculoEleitores(int totalEleitor, int votosValidos, int votosBrancos, int votosNulos) {
		super();
		this.totalEleitor = totalEleitor;
		this.votosValidos = votosValidos;
		this.votosBrancos = votosBrancos;
		this.votosNulos = votosNulos;
	}


	public int getTotalEleitor() {
		return totalEleitor;
	}


	public void setTotalEleitor(int totalEleitor) {
		this.totalEleitor = totalEleitor;
	}


	public int getVotosValidos() {
		return votosValidos;
	}


	public void setVotosValidos(int votosValidos) {
		this.votosValidos = votosValidos;
	}


	public int getVotosBrancos() {
		return votosBrancos;
	}


	public void setVotosBrancos(int votosBrancos) {
		this.votosBrancos = votosBrancos;
	}


	public int getVotosNulos() {
		return votosNulos;
	}


	public void setVotosNulos(int votosNulos) {
		this.votosNulos = votosNulos;
	}

	public double calcularValido() {
		double total = (double) this.votosValidos / this.totalEleitor;

		return total * 100;
	}

	public double calcularBranco() {
		double total = (double) this.votosBrancos / this.totalEleitor;
		return total * 100;

	}
	public double calcularNulo() {
		double total = (double) this.votosNulos / this.totalEleitor;
		return total * 100;

	}
	


	@Override
	public String toString() {
		return "Dados Das Eleições: "
				+ "\n------------------"
				+ "\nTotal de Eleitores = " + totalEleitor + ""
				+ ", \nVotos Válidos = " + votosValidos + ""
				+ ", \nVotos Brancos = "+ votosBrancos + ","
						+ " \nvotosNulos=" + votosNulos+ "." ;
	}
		
		
		

	}


