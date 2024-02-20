public class UserDefineExection {
    // throw vs throws & try catch using all of this and create a user define Exception
    public static void main(String[] args) {
        try{
            vote(21);
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static void vote(int age) throws InvalidAgeException{
        if(age<18){
           throw  new InvalidAgeException("not eligible for the voting");
        }
        else {
            System.out.println("eligible for voting");
        }
    }
}
class InvalidAgeException extends Exception{
    // create a constuctor
    InvalidAgeException(String mgs){
        System.out.println(mgs);
    }

}
