package Day_3_oops;
//class Fixedamount
//{
//	public int fixedamount=10000;
//}
//abstract class WithdrawalAmount 
//{
//	abstract void witdraw(int amount);
//}
//public class Bank_Scenario extends WithdrawalAmount  
//{
//	Fixedamount f=new Fixedamount();
//	void witdraw(int amount)
//	{
//		f.fixedamount-=amount;
//		System.out.println("witdraw:"+amount);
//		System.out.println("Available Balance: "+f.fixedamount);
//	}
//	public static void main(String[] args);
//	{
//		{
//			int amount=Integer.parseInt(args[0]);
//			Bank_Scenario b=new Bank_Scenario();
//			b.witdraw(amount);
//			
//		}
//		
//	}
//
//}
class Fixedamount {
    public int fixedamount = 10000;
}

abstract class WithdrawalAmount {
    abstract void withdraw(int amount);
}

public class Bank_Scenario extends WithdrawalAmount {
    Fixedamount f = new Fixedamount();

    @Override
    void withdraw(int amount) {
        if (amount <= f.fixedamount) {
            f.fixedamount -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Available Balance: " + f.fixedamount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter the amount to withdraw as a command-line argument.");
            return;
        }

        int amount = Integer.parseInt(args[0]);
        Bank_Scenario b = new Bank_Scenario();
        b.withdraw(amount);
    }
}
