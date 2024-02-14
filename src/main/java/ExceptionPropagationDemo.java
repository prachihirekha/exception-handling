public class ExceptionPropagationDemo {
    // exception propagation
    public static void main(String[] args) {
        try{
        m1();
        }catch (Exception e){
            System.out.println("Arithmetic Exception handled by main method......!");
        }
    }

     public static void m1() {

            m2();

        }
    public static void m2(){
       //try{
           System.out.println(10/0);
       //}catch (ArithmeticException e){
         //  System.out.println("handled by m2");
       //}
    }
}
