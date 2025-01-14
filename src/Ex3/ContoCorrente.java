package Ex3;

public class ContoCorrente {
	private String titolare;
	private int nMovimenti;
	private final int maxMovimenti = 50;
	private double saldo;
	private final static double commissioneBanca = 0.50;

	//costruttore
	public ContoCorrente(String titolare, double saldo) {
		this.titolare = titolare;
		this.saldo = saldo;
		this.nMovimenti = 0;
	}

	public double restituisciSaldo() {
		return this.saldo;
	}

	public void preleva(double importo) throws BancaException {
		if (nMovimenti < maxMovimenti) {
			saldo = saldo - importo;

		} else {
			saldo = saldo - importo - commissioneBanca;
		}
		if (saldo < 0)
			throw new BancaException("Il tuo conto è in rosso");

		nMovimenti++;
	}
}

