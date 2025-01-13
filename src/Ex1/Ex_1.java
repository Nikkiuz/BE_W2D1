package Ex1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex_1 {

	public static void eseguiArray() {
		int[] array = new int[5];
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1,11);
		}
		cambiaNumero(array);
		stampaArray(array);

	}

	public static void stampaArray(int[] array) {

		System.out.println(Arrays.toString(array));
	}

	public static void cambiaNumero(int[] array) {
		int risposta;
		do {
			Scanner myscanner = new Scanner(System.in);

			System.out.println("scegli un numero e premi enter");
			int numero = myscanner.nextInt();
			System.out.println("ora scegli la posizione in cui inserirlo");
			int posizione = myscanner.nextInt();

			if (posizione < 0 || posizione >= array.length) {
				throw new RuntimeException("posizione non valida");
			} else {
				array[posizione - 1] = numero;
			}
			System.out.println("per continuare inserisci un numero, per terminare inserisci 0");
			risposta = myscanner.nextInt();
			myscanner.close();

		}
		while (risposta != 0);


	}
}
