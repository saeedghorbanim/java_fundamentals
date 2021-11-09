public class FizzBuzz {

    public static void fizzBuzzFunction (int num){
        if(num % 2 == 0 && num % 3 == 0){
            System.out.println("divides by both 2 and 3");
        }
        else if (num % 2 == 0) {
            System.out.println("divides by 2 only");
        }

        else if (num % 3 == 0) {
            System.out.println("divides by 3 only");
        }

        else {
            System.out.println("just the number itself");
        }
    }
    
}
