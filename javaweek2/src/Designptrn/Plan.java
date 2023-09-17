package Designptrn;

abstract class Plan {
	protected double rate;
	abstract void getRate();
	
	public void calculatrBill(int units) {
		System.out.println(units*rate);
	}
}
