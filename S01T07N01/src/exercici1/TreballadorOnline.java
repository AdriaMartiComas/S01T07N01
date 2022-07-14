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

		return (nHores * this.getPreuHora()) + TreballadorOnline.tarifaInternet;
	}
	
	@Deprecated
	public static void metodeObsolet() {
		System.out.println("Soc un metode obsolet de la classe TreballadorOnline");
	}

}

/*
 * Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza
 * l’anotació corresponent. Invoca des d'una classe externa els mètodes
 * obsolets, suprimint mitjançant l'anotació corresponent els “warnings” per ser
 * obsolets.
 * 
 * 
 * 
 */
