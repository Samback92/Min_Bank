import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        bankJava bank = new bankJava();
        Scanner input = new Scanner(System.in);
        int summan;
        boolean run = true;
        int menyVal = 0;

        while (run) {

            System.out.println("vad vill du göra?: ");
            System.out.println("(1) - Kolla saldo -");
            System.out.println("(2) - sätta in pengar -");
            System.out.println("(3) - Ta ut pengar -");
            System.out.println("(4) - Avsluta -");
            if (input.hasNextInt()) {
                menyVal = input.nextInt();
                if (menyVal <= 0 || menyVal > 4) {
                    System.out.println("Välj ett alt. mellan 1 och 4!");
                } 
            } else {
                System.out.println("Nu blev det väl fel va?");
                input.nextLine();
            }
            
        
                

            switch(menyVal){
                
                case 1 :

                    System.out.println("***Kolla saldo***");
                    System.out.println("Ditt saldo är: " + bank.visaSaldo());
                    System.out.println("*********************");
                    break;

                case 2 :

                    System.out.println("***Insättning***");
                    System.out.println("Skriv in en summa att sätta in:");
                    summan = input.nextInt();
                    bank.insattning(summan);
                    System.out.println("*********************");
                    break;

                case 3 :

                    System.out.println("***Uttag***");
                    System.out.println("Skriv in en summa:");
                    summan = input.nextInt();
                    bank.uttag(summan);
                    System.out.println("*********************");
                    break;

                case 4 :

                    System.out.println("Ha en bra dag och välkommen åter!");
                    break;

                default :

                    System.out.println("***Välj mellan alternativen***.");
            } 
        } input.close();  
    }
}