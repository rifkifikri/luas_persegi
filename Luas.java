package luas_persegi_panjang;
import java.util.Scanner;

public class Luas {
	public static void main(String[] args){
		int panjang,luas,lebar;
		Scanner userInput = new Scanner(System.in);//library yang di sediakan java untuk input data user

		//menghitung luas persegi panjang
		System.out.print("masukkan nilai panjang=");
		panjang=userInput.nextInt();//nextint untuk input yang bertipe data integer;
		System.out.print("masukkan nilai lebar=");
		lebar = userInput.nextInt();
		
		luas= panjang*lebar;
		
		System.out.print("luasnya adalah = " + luas);
	}
	
}