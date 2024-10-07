import java.util.*;

public class ATMOperations {
	double balance ;
	String password = "bunny123";
	boolean checkpassword(String password){
		boolean checkpass=false;
		if(this.password.equals(password)){
			checkpass=true;
		}
		return checkpass;
	}
	double checkbalance(){
		return balance;
	}
	boolean WithDrawAmount(double amount){
		boolean succuss=false;
		if(balance>=amount){
			balance-=amount;
			succuss=true;
		}
	return succuss;
	}
	boolean depositeAmount(double amount){
		boolean succuss=false;
		if(amount>0){
			balance+=amount;
			succuss=true;
		}
		return succuss;
	}
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		ATMOperations ob1 = new ATMOperations();
		System.out.println("Enter the Your PassWord :");
		String pass = sc.nextLine();
		if(ob1.checkpassword(pass)==false){
			System.out.println("Invalid PassWord .... Access Denied ");
			return;
		}
		boolean exit = false;
		while(!exit){
			System.out.println("1.Check Balance ");
			System.out.println("2.Deposite Amount ");
			System.out.println("3.WithDraw Amount ");
			System.out.println("4.Exit ");
			int op=sc.nextInt();
			switch(op){
			case 1 : System.out.println("Your Current Balance "+ob1.checkbalance());break;
			case 2 : System.out.println("Enter to Deposite Amount: ");
					double am1=sc.nextDouble();
					if(ob1.depositeAmount(am1)){
					System.out.println(am1+" is succussfully Deposited... ");
				}else{
				System.out.println("Insuffient Balance");
			}
			break;
			case 3 : System.out.println("Enter Amount to Withdraw : ");
					double am2 = sc.nextDouble();  	
					if(ob1.WithDrawAmount(am2)){
						System.out.println(am2+" is succussfully withdrawn .....");
					}else{
						System.out.println("Insuffient Balance");
					}
					break;
			case 4 : exit=true;
					System.out.println("Thank You for Using Our Services..");
					break;
			}
		}
	}

}