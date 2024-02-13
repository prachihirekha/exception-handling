

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            int a=10;
            int b =2;
            int c;
            c =a/b;
            System.out.println(c);

            int j[]={1,2,3,4};
            System.out.println(j[1]);

            String s =null;
            System.out.println(s.toUpperCase());
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Array is out of bound");
        }catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }catch (Exception e){
            System.out.println("All type of exception handled");
    }

   // private static boolean toUpperCase(String s) {
    }
}
