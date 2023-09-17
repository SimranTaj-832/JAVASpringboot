package Bank;

import BankPojo.SavingTran;

public class genAcc {
	public BankingApp getInterestCal(String interestType) {
		if(interestType == null) 
		{return null; }
		if(interestType.equalsIgnoreCase("SAVINGSACCOUNT")){
			return new BankingApp();
		}
		if(interestType.equalsIgnoreCase("CURRENTACCOUNT")){
			return new BankingApp();
		}
		if(interestType.equalsIgnoreCase("FDACCOUNT")){
			return new BankingApp();
		}
		if(interestType.equalsIgnoreCase("LOANACCOUNT")){
			return new BankingApp();
		}return null;
	}

}
