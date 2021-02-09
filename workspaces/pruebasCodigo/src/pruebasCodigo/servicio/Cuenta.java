package pruebasCodigo.servicio;

import java.math.BigDecimal;

public class Cuenta {

	private BigDecimal balance = new BigDecimal("1000");
	
	public static Cuenta cuenta() {
		return new Cuenta();
	}
	
	public void addMoney(BigDecimal money) {
		this.balance = this.balance.add(money);
	}
	
	public void removeMoney(BigDecimal money ) {
		this.addMoney(money.negate());
	}
	
	public BigDecimal getBalance() {
		return this.balance;
	}
	
}
