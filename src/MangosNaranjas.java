import java.util.ArrayList;

public class MangosNaranjas {
	private int mangos;
	private int naranjas;
	
	public MangosNaranjas(int mangos, int naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	}//constructor

	public int getMangos() {
		return mangos;
	}//getMangos

	public void setMangos(int mangos) {
		this.mangos = mangos;
	}//setMangos

	public int getNaranjas() {
		return naranjas;
	}//getNaranjas

	public void setNaranjas(int naranjas) {
		this.naranjas = naranjas;
	}//setNaranjas
	
	public String smn() {
		
		ArrayList <Integer> boxMango = new ArrayList<>();
		ArrayList <Integer> boxNaranja = new ArrayList<>();
		int cajas = 0;
		
		for (int contador = 2; contador <= mangos; contador++) { 
			if(mangos % contador == 0) {
				boxMango.add(contador);
			}//if naranja
		}//for mangos
		for (int contador = 2; contador <= naranjas; contador++) { 
			if(naranjas % contador == 0) {
				boxNaranja.add(contador);
			}//if naranja
		}//for naranjas
		
		for (Integer caja : boxNaranja) {
			for (Integer cajaN : boxMango) {
				if(caja == cajaN && caja > cajas) {
					cajas = cajaN;
				}//if cajaN
				
			}//ifcajas
		}//for cajas		
		
		
		
		int numMango = mangos /  cajas ;
		int numNara =  naranjas /  cajas ;
		
		return "El numero de cajas es: " + cajas + "\nEl numero de mangos en caja es de: " + numMango +
				"\nEl numero de Naranjas en caja es de: " + numNara;
	}//smn
}//class MangoNaranjas
