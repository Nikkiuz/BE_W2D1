package Ex3;

public class Ex3_main {
	public static void main(String[] args){

		ContoCorrente contoFrancesco = new ContoCorrente("Francesco", 10000);
		ContoCorrente contoValentina = new ContoCorrente("Valentina", 5000);

		try {
			contoFrancesco.preleva(2000);
		}
		catch (BancaException e) {
			System.out.println("Errore: "+ e);
			e.printStackTrace();
		}
	}
}
