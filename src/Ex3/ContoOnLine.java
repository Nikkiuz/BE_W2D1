package Ex3;

public class ContoOnLine extends ContoCorrente {
	private double maxPrelievo;

	public ContoOnLine(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

/*	public void stampaSaldo() {
		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti +
			" - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo disponibile: " + maxPrelievo);
	}*/

	@Override
	public void preleva(double importo) throws BancaException {
		if (importo <= maxPrelievo)
			super.preleva(importo);
		else
			throw new BancaException("il prelievo non è disponibile");
	}

}

