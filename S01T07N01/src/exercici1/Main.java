package exercici1;

public class Main {

	public static void main(String[] args) {
		TreballadorPresencial.setBenzina(70.0);
		
		TreballadorPresencial treballador1 = new TreballadorPresencial("Maria", "Cases", 15.3);
		TreballadorOnline treballador2 = new TreballadorOnline("Jordi", "Fuster", 15.3);
		
		double sou1 = treballador1.calcularSou(40*4);
		double sou2 = treballador2.calcularSou(40*4);
		
		System.out.println("El treballador: "+treballador1.getNom()+" "+treballador1.getCognom()+", te un sou mensual de:"+ sou1);
		System.out.println("El treballador: "+treballador2.getNom()+" "+treballador2.getCognom()+", te un sou mensual de:"+ sou2);

	}

}
