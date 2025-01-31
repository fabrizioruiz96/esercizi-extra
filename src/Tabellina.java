
public class Tabellina {

    private int numero;

    public Tabellina(int numero){
        this.numero = numero;
        stampa();
    }

    private void stampa(){
        for (int i = 1; i <= 10; i++){
            int result = numero * i;
            System.out.println(result);
        }
    }
}
