/* NIM		: 13020210170		*/
/* NAMA 		: ANDI CHUSNUL IDZAH	*/
/* HARI,TANGGAL	: SENIN,20/03/2023	*/


import java.util.Scanner;

/* Contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */

public class PrintXRepeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus : */
		
		int Sum;
		int x;
		Scanner masukan=new Scanner (System.in);
		/* Program */
		
		System.out.print ("Masukan nilai x (int),akhiri dg 999 : ");
		x = masukan.nextInt(); /* First Elmt */
	
		if ( x == 999) {
			System.out.print("Kasus kosong \n");
		}else {	/* Minimal ada suatu data yang dijumlahkan */
		
		Sum = 0;	/* Inisialisasi; invariant !! */
		do{
			Sum = Sum + x; 	/* Proses */
			System.out.print ("Masukan nilai x (int), akhiri dg 999 : ");
			x = masukan.nextInt (); /* Next Elmt */
		} while (x != 999);	/* Kondisi pengulangan */
		System.out.println ("Hasil penjumlahan = "+Sum);
	/* Terminasi */
		
		}

	}

}