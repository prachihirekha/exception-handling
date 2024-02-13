public class Handling {
    public static void main(String[] args) {
        //try catch finally
        try{
            System.out.println("I Am Okay");
            int a =20,b=0,c;
            c =a/b;
            System.out.println("I am executed");
        }catch (ArithmeticException a){
            System.out.println("can't divided by zero");
        }finally {
            System.out.println("i am always execute");
        }
        System.out.println("main method ended");
    }
}
