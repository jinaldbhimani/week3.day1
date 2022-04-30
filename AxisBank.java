package bank;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("deposit is ready in bank");
	}

	public static void main(String[] args) {
		BankInfo info=new BankInfo();
		info.deposit();
		info.fixed();
	    info.savings();
	    
	    AxisBank axis=new AxisBank();
	    axis.deposit();
	    
	}
}
