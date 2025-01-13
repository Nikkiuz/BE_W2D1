package Ex3;

public class ContoOnLine {
	private double maxPrelievo;

	public ContoOnLine(String titolare, double saldo, double maxP){
		super(titolare,saldo);
		this.maxPrelievo = maxP;
	}

	void stampaSaldo(){
		System.out.println("Titolare: "+titolare+" - Saldo: "+saldo+" - Num movimenti: "+nMovimenti+
			" - Massimo movimenti: "+maxMovimenti+" - Massimo prelievo disponibile: "+maxPrelievo);
	}

	public void preleva(double x) {
		if (x <= maxPrelievo) {
			super.preleva(x);
		}

		if (x > maxPrelievo)
			throw new BancaException("il prelievo non è disponibile");
	}

}

