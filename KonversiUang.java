/* Nama : Alifah Nurul Ananda
   NIM  : 13020210140 */


import java.util.Scanner;

public class KonversiUang{
	public static void main(String[] args){
		
		int Dol;
		int Rup;

		System.out.print("Masukkan Dollar : ");
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		Dol = 1509480;
		Rup = Dol*a;

		System.out.println("Hasil "+a+" Dollar = "+Rup+" Rupiah");

	}
}