package Ex2;

import java.util.Scanner;

public class Ex_2 {

	public static void InsertData(){
		Scanner myscanner = new Scanner(System.in);

		System.out.println("inserisci i km percorsi");
		int km = myscanner.nextInt();
		System.out.println("inserisci i litri di carburante consumati");
		int litri = myscanner.nextInt();
		CalcoloKmLitro(km,litri);
	}
	public static void CalcoloKmLitro(int km, int litri){
		try{
			if(litri==0){
				throw new Exception("non è possibile eseguire l'operazione");
			}
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		int CalcoloKmLitro= km/litri;
		System.out.println("il consumo è pari a "+CalcoloKmLitro+"km/lt");
	}
}
