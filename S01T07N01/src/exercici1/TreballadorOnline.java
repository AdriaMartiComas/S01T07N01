package exercici1;

public class TreballadorOnline extends Treballador {
	private static final double tarifaInternet = 24;

	public TreballadorOnline(String nom, String cognom, Double preuHora) {
		super(nom, cognom, preuHora);

	}

	public static double getTarifainternet() {
		return tarifaInternet;
	}

	@Override
	public String toString() {
		return "TreballadorOnline [tarifaInternet=" + tarifaInternet + ", getPreuHora()=" + getPreuHora()
				+ ", getNom()=" + getNom() + ", getCognom()=" + getCognom() + "]";
	}

	@Override
	public double calcularSou(int nHores) {

		return (nHores * this.getPreuHora()) + this.tarifaInternet;
	}

}
