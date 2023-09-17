package w2d5ActBank;

public class FactoryPattern {
	public InterestCal getInterestCal(String interestType) {
		if(interestType == null) 
		{return null; }
		if(interestType.equalsIgnoreCase("SAVINGSACCOUNT")){
			return new SavingsAccount();
		}
		if(interestType.equalsIgnoreCase("CURRENTACCOUNT")){
			return new CurrentAccount();
		}
		if(interestType.equalsIgnoreCase("FDACCOUNT")){
			return new FDAccount();
		}
		if(interestType.equalsIgnoreCase("LOANACCOUNT")){
			return new LoanAccount();
		}return null;
	}
	
}
