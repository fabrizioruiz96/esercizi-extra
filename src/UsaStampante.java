public class UsaStampante {
    public static void main(String[] args) {
        Stampante prova = new Stampante();
        prova.stampa(true);
        prova.stampa(2147483647);
        prova.stampa(32767);
        prova.stampa(0.123456789012345);
        
    }
}
