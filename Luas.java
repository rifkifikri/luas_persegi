package luas_persegi_panjang;
import java.util.Scanner;

public class Luas {
	//class method
	public int setLuas(int panjang, int lebar) {
		int hasil;
		hasil=panjang*lebar;
		return hasil;
	}
	
	public static void main(String[] args){
		int panjang,luas,lebar;
		Scanner userInput = new Scanner(System.in);//library yang di sediakan java untuk input data user
		
		Luas persegi = new Luas();//membuat object untuk memanggil
		
		//menghitung luas persegi panjang
		System.out.print("masukkan nilai panjang=");
		panjang=userInput.nextInt();//nextint untuk input yang bertipe data integer;
		System.out.print("masukkan nilai lebar=");
		lebar = userInput.nextInt();
		
		luas= persegi.setLuas(panjang, lebar);
		
		System.out.print("luasnya adalah = " + luas);
		
	}
	
}