import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        
        double acc_balance=9900;
        int pin=1234;
        int j=1;
        Scanner s=new Scanner(System.in);
        while(j==1){
        System.out.println("Enter your Choice");
        System.out.println("1.CashWithdrawal. 2.Account Balance. 3.Pin Change. 4.Deposit 5.Exit ");
        
        int choice=s.nextInt();
        switch(choice){
            case 1:
            System.out.println("Enter the withdraw amunt");
           int  amount=s.nextInt();
            if(amount<=acc_balance){
          System.out.println("Amount Withdraw Successfully");
          System.out.println("Available Balance After Transaction is"+(acc_balance-amount));
            }
            else{
                System.out.println("Insufficient fund");
            }
            break;
            case 2:
            System.out.println("Available Balance is"+acc_balance);
            break;
            case 3:
            System.out.println("Enter your Current Pin");
            int pin1=s.nextInt();
            if(pin==pin1){
             System.out.println("Enter new Pin");
             System.out.println("Pin Changed");
            }
            else{
                System.out.println("Please enter Valid Password");
            }
            break;

            case 4:
            System.out.println("Enter the Deposit Amount");
            int damount=s.nextInt();
            System.out.println("Available balance is"+(acc_balance+damount));
            break;
            
            case 5:
            j++;
            break;
            default:
            System.out.println("Invalid Choice");
        }
    }

    }
}
