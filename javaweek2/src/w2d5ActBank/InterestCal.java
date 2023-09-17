package w2d5ActBank;

public abstract class InterestCal {
	protected double rate;
	abstract void getRate();
	
	public double calInterest(int balance) {
		return balance*rate/100;	
	}

}
