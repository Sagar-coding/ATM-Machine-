
import java.util.Scanner;



public class MainMenu {
    
    float Balance;
   
    public void menu(){

       

        System.out.println("Enter Your Choice:");
        System.out.println("1.Check A/C Balance");
        System.out.println("2. Deposite Money");
        System.out.println("3.Withdrwal Money");
        System.out.println("4.Exit");

        
       
      


        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt==1){
            checkBalance();
           
        }
        else if(opt==2){
           depositeMoney();
           

        }
        else if(opt==3){
           withdrwalMoney();
        }
        else if(opt==4){
            System.out.println("Thanks for using");
        }
        else{
            System.out.println("Please Enter A Valid Choice:");
        }
    }


    public void checkBalance(){
        System.out.println("Balance is:" + Balance);
        menu();
    }

    

    public void depositeMoney(){
        System.out.println("Enter the Amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        Balance = Balance+amount;
        System.out.println("Money Depostied Succesfully");
        menu();
        

    }

    public void withdrwalMoney(){
        System.out.println("Enter Amount To Withdrwa:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount > Balance){
            System.out.println("!!Insufficient Balance!!");
        }
        else{
            Balance =  Balance - amount;
            System.out.println("Money Withdrwal Successful");
        }
       menu();
    }

}
