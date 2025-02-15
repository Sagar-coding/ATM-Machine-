import java.util.Scanner;

public class Atm {
     
    
   
    int pin = 8520;
    
    MainMenu menu1 = new MainMenu();

   
       
        
    

    public void checkPin(){
        System.out.println("Enter your Pin:");
        Scanner sc = new Scanner(System.in);
        int checkedPin = sc.nextInt();


        if(checkedPin == pin){
            menu1.menu();
        }
        else{
            System.out.println("Enter A Valid Pin:");
        }
    }
}  