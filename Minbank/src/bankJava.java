

public class bankJava {

    double mittSaldo = 5000;
    double summan;
    public Object Menu;

    public void uttag(int summan) {

        mittSaldo = mittSaldo - summan;
    }

    public void insattning(int summan) {

        mittSaldo = mittSaldo + summan;
    }

    public double visaSaldo() {
        return mittSaldo;
    }



}