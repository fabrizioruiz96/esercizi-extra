public class LoopInfinito {
    public static void main(String[] args) {
        int i = 1;
        while(i>0){
            int index = 0;
            while(true){
                System.out.println(index);
                index++;
            }
            i++;
        }
    }   
}