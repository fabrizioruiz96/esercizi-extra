package LoopABC;

public class abc {

    private int counter = 0;
    
    public abc(){
        if(counter < 10){
            a();
        } else {
            System.out.println("Finito!");
        }   
    }

    private void a(){
        counter++;
        System.out.println("Sono A n. " + counter);
        b();
    }

    private void b(){
        System.out.println("Sono B n. " + counter);
        c();
    }

    private void c(){
        System.out.println("Sono C n. " + counter);
        a();
    }
}