package Stampante;

public class Stampante{

    private boolean myBoolean;
    private int myInt;
    private short myShort;
    private double myDouble;
    private long myLong;

    public void stampa(boolean userBoolean){
        myBoolean = userBoolean;
        System.out.println(myBoolean);
    }

    public void stampa(int userInt){
        myInt = userInt;
        System.out.println(myInt);
    }

    public void stampa(short userShort){
        myShort = userShort;
        System.out.println(myShort);
    }

    public void stampa(double userdouble){
        myDouble = userdouble;
        System.out.println(myDouble);
    }

    public void stampa(long userLong){
        myLong = userLong;
        System.out.println(myLong);
    }
}