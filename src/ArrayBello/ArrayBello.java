package ArrayBello;

public class ArrayBello {

    private int[] array;
    private int counter;

    public ArrayBello(int lunghezzaArray) {
        array = new int[lunghezzaArray];
        counter = 0;
    }

    public void add(int userNum) {

        if (counter == array.length) {
            
            int[] nuovoArray = new int[array.length + 1];

            for (int idx = 0; idx < array.length; idx++) {
                nuovoArray[idx] = array[idx];
            }

            array = nuovoArray;
        }

        array[counter] = userNum;
        counter++;
    }

    public int get(int indice){
        if(indice < 0 || indice >= counter){
            System.out.println("Indice non valido: " + indice);
        }
        System.out.println("L'elemento all'indice " + indice + " è " + array[indice]);
        return array[indice];
    }

    public int print(){
        for (int idx = 0; idx < counter; idx++) {
            int el = array[idx];
            System.out.println(array[idx] + " ");
        }
        return 1;
    }

    public static void main(String[] args) {
        ArrayBello mioArray = new ArrayBello(5);
        mioArray.print();
        mioArray.add(5);
        mioArray.add(3);
        mioArray.add(4);
        mioArray.add(39);
        mioArray.add(51);
        mioArray.print();
        mioArray.get(6);
    }
}
