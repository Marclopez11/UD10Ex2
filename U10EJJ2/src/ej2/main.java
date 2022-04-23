package ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {

			System.out.println("Mensaje mostrado por pantalla");
			throw new MiException(1);

	

		} catch (MiException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Programa terminado");

	}

}
