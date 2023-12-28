public class FizzBuzz {

    public static void main(String[] args) {
        printFizzBuzz(1, 100);
    }

    private static void printFizzBuzz(Integer start, Integer total) {

        // create a loop of total numbers to be printed
        for (int i = start; i <= total; i++) {

            // fizzBuzz if divisible by 5 and 3
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");

            }
            // buzz if divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }

            // fizz if divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }

            //else print number
            else {
                System.out.println(i);
            }
        }


    }
}
