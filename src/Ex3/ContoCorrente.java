package Ex3;

public class ContoCorrente {
	private String titolare;
	private int nMovimenti;
	private final int maxMovimenti = 50;
	private double saldo;

	public ContoCorrente(String titolare, double saldo) {
		this.titolare = titolare;
		this.saldo = saldo;
		this.nMovimenti = 0;
	}

	void preleva(double x) throws BancaException {
		if (nMovimenti < maxMovimenti) {
			saldo = saldo - x;

		} else {
			saldo = saldo - x - 0.50;
		}

		if (saldo < 0) {
			throw new BancaException("il conto è in rosso");
			nMovimenti++;
		}
	}

	double restituisciSaldo() {
		return saldo;
	}
}

