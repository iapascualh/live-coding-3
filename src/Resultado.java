import java.util.Scanner;

public class Resultado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MangosNaranjas mnt;
		int mangos, naranjas;
		System.out.println("ingrese su número de naranjas:");
		naranjas = scan.nextInt();
		System.out.println();
		System.out.println("ingrese su número de mangos: ");
		mangos = scan.nextInt();
		
		scan.close();
		
		mnt = new MangosNaranjas(mangos,naranjas);
		
		System.out.println(mnt.smn());
	}//

}//
