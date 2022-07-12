package exercici1;

public abstract class Treballador {
	private String nom;
	private String cognom;
	private Double preuHora;

	public Treballador(String nom, String cognom, Double preuHora) {

		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}

	public Double getPreuHora() {
		return preuHora;
	}

	public void setPreuHora(Double preuHora) {
		this.preuHora = preuHora;
	}

	public String getNom() {
		return nom;
	}

	public String getCognom() {
		return cognom;
	}

	@Override
	public String toString() {
		return "Treballador [nom=" + nom + ", cognom=" + cognom + ", preuHora=" + preuHora + "]";
	}

	abstract double calcularSou(int nHores);


	

}
