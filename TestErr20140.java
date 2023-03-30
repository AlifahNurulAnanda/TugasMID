/* Nama : Alifah Nurul Ananda
   NIM  : 13020210140 */


import java.util.Scanner;

public class TestErr20140{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nilai i : ");
		int i = input.nextInt();
		System.out.println("Nilai j : ");
		int j = input.nextInt();

		if(i<j) {
			System.out.println(i); }
		else
		
		do{
			j++;
		} while (j<10);
			System.out.println(j);
	}
}