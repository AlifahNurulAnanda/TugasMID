/* Nama : Alifah Nurul Ananda
   NIM  : 13020210140 */

interface A{ 
	public void aaa(); }
interface B extends A{
	public void aaa();
}

	public class Central0140 implements A, B{
		public void aaa(){
			System.out.println("aaa");
		}

	public static void main(String [] args){
			System.out.println("main");

		}

}