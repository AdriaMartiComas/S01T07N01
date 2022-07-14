package exercici1;

public class TreballadorPresencial extends Treballador {
	private static double benzina;

	public TreballadorPresencial(String nom, String cognom, Double preuHora) {
		super(nom, cognom, preuHora);
		
	}

	public static double getBenzina() {
		return benzina;
	}

	public static void setBenzina(double benzina) {
		TreballadorPresencial.benzina = benzina;
	}
	

	@Override
	public String toString() {
		return "TreballadorPresencial [getPreuHora()=" + getPreuHora() + ", getNom()=" + getNom() + ", getCognom()="
				+ getCognom() + "]";
	}

	@Override
	public double calcularSou(int nHores) {
		return (nHores*this.getPreuHora()) + TreballadorPresencial.benzina;
	}
	
	@Deprecated
	public static void metodeObsolet() {
		System.out.println("Soc un metode obsolet de la classe TreballadorPresencial");
	}


	

}
