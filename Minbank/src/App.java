import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        bankJava bank = new bankJava();
        Scanner input = new Scanner(System.in);
        int val;
        int summan;
    
        


            do {

            System.out.println("vad vill du göra?: ");
            System.out.println("(1) ta ut pengar");
            System.out.println("(2) sätta in pengar");
            System.out.println("(3) kolla saldo");
            System.out.println("(4) avsluta");
            val = input.nextInt();
            switch(val){
                
                case 1 :

                    System.out.println("***Uttag***");
                    System.out.println("Skriv in en summa:");
                    summan = input.nextInt();
                    bank.uttag(summan);
                    System.out.println("*********************");
                    System.out.println("Ditt saldo är: " + bank.visaSaldo());
                    break;

                
                case 2 :

                    System.out.println("***Insättning***");
                    System.out.println("Skriv in en summa:");
                    summan = input.nextInt();
                    bank.insattning(summan);
                    System.out.println("*********************");
                    System.out.println("Ditt saldo är: " + bank.visaSaldo());
                    break;

               
                case 3 :

                    System.out.println("***Kolla saldo***");
                    System.out.println("Ditt saldo är: " + bank.visaSaldo());
                    System.out.println("*********************");
                    break;

                case 4 :

                    System.out.println("Ha en bra dag och välkommen åter!");
                    break;

                default :

                    System.out.println("***Fel val! Välj mellan alternativen***.");
                    break;

                } 
                }while (val != 4);
                
            

            input.close();  
    }
}