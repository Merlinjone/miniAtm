import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pin=1234;
        double balance=100000.00;
        int password;
        String name;
        int addAmount=0;
        int getAmount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter pin number: ");
        password =sc.nextInt();
        if(password==pin){

            System.out.println("Enter your Name:");
            name=sc.nextLine();
            System.out.println("Welcome to MiniAtm System"+""+name);
            while(true){
                System.out.println("select 1 to 5 :");

                System.out.println("1.Add Amount: ");
                System.out.println("2.Get Amount: ");
                System.out.println("3.Check Balance: ");
                System.out.println("4.print receipt: ");
                System.out.println("5.exit: ");
                int opt=sc.nextInt();

                switch (opt) {
                    case 1 -> {
                        System.out.println("Enter the amount to Credit:");
                        addAmount = sc.nextInt();
                        balance += addAmount;
                    }
                    case 2 -> {
                        System.out.println("Enter the amount to withdraw:");
                        getAmount = sc.nextInt();
                        if (getAmount <= balance) {
                            balance -= getAmount;
                        } else {
                            System.out.println("Insufficient balance!!!");
                        }
                    }
                    case 3 -> System.out.println("balance is " + balance);
                    case 4 -> {
                        System.out.println("The amount you have credit:" + addAmount);
                        System.out.println("The amount you have debit:" + getAmount);
                        System.out.println("Available balance is :" + balance);
                        System.out.println("Thank you!!!Visit Again!!!");
                    }
                    default -> System.out.println("Press the number 1 to 5:");
                }
            if(opt==5){
                System.out.println("thank you!");
                break;
            }
            }
        }
        else{
            System.out.println("wrong pin!!!");
        }
    }
}
