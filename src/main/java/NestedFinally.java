import javax.swing.*;

public class NestedFinally {
    public static void main(String[] args) {
        try{
         String s ="prachi";
            System.out.println(s.toUpperCase());
        }catch (Exception e){

            System.out.println(e);

        } finally {
            try {
                System.out.println(10/0);

            }catch (Exception e){
                System.out.println(e);
            }finally{
                System.out.println("run");
            }

        }
        System.out.println("method ended");
    }
}
