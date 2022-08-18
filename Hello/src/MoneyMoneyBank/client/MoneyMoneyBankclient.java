package client;

import application.GSCurrentAcc;
import application.GSSavingAcc;
import application.MoneyMoneyBank;

public class MoneyMoneyBankclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//saving account creation
		MoneyMoneyBank obj=new MoneyMoneyBank();
		GSSavingAcc swamy=(GSSavingAcc) obj.getNewSavingAcc(124, "swamy", 600.0f, true);
		swamy.withdraw(swamy.getAccBal());
		
		//current account creation
		GSCurrentAcc kiccha=(GSCurrentAcc) obj.getNewCurrentAcc(121,"kiccha",800.0f,20.0f);
		kiccha.withdraw(kiccha.getAccBal());
	}

}
