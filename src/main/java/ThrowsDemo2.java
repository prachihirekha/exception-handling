public class ThrowsDemo2 {
    public static void main(String[] args) {
        try {
            for(int i=1;i<=10;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (Exception interruptedException){
            System.out.println(interruptedException);
        }
    }
}
