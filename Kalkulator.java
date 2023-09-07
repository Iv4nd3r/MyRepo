import java.util.Scanner;

public class Kalkulator {
	public static void main(String[] args) {
		float a, b;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Silahkan masukan nilai a :");
		a = scn.nextFloat();
		System.out.println("Silahkan masukan nilai b :");
		b = scn.nextFloat();
		
		scn.close();
		
		System.out.printf("Isi variabel a adalah %f\n", a);
		System.out.printf("Isi variabel b adalah %f\n", b);
		System.out.printf("Hasil penjumlahan variabel a dan b = %f\n", a + b);
		System.out.printf("Hasil pengurangan variabel a dan b = %f\n", a - b);
		System.out.printf("Hasil perkalian variabel a dan b = %f\n", a * b);
		System.out.printf("Hasil pembagian variabel a dan b = %f\n", a / b);
	}
}