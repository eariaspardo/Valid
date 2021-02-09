package pruebasCodigo.enums;

import java.math.BigDecimal;
import java.math.RoundingMode;

import pruebasCodigo.servicio.Cuenta;

public enum TransaccionType {
	
	COMPRAR{
		@Override
		public void doTransacionOperation(BigDecimal cashValue, Cuenta cuenta) {
			BigDecimal percentageValue = calculateTax(BigDecimal.valueOf(0.15), cashValue);
			cashValue = cashValue.add(percentageValue);
			cuenta.removeMoney(cashValue);
		}},
	VENDER() {
		@Override
		public void doTransacionOperation(BigDecimal cashValue, Cuenta cuenta) {
			BigDecimal percentageValue = calculateTax(BigDecimal.valueOf(0.1), cashValue);
			cashValue = cashValue.add(percentageValue.negate());
			cuenta.addMoney(cashValue);
		}
	},
	DEPOSITAR{
		@Override
		public void doTransacionOperation(BigDecimal cashValue, Cuenta cuenta) {
			BigDecimal percentageValue = calculateTax(BigDecimal.valueOf(0.05), cashValue);
			cashValue = cashValue.add(percentageValue.negate());
			cuenta.addMoney(cashValue);
		}},
	RETIRADA{
		@Override
		public void doTransacionOperation(BigDecimal cashValue, Cuenta cuenta) {
			BigDecimal percentageValue = calculateTax(BigDecimal.valueOf(0.20), cashValue);
			cashValue = cashValue.add(percentageValue);
			cuenta.removeMoney(cashValue);
			
		}};
	
	public abstract void doTransacionOperation(BigDecimal cashValue, Cuenta cuenta);

	BigDecimal calculateTax(BigDecimal percentaje, BigDecimal cashValue) {
		return cashValue.multiply(percentaje).divide(new BigDecimal(100), RoundingMode.HALF_DOWN);
	}

}
