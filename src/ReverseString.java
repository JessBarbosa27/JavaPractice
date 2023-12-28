public class ReverseString {


    public static void main(String[] args) {
        String givenString = "Hello!!";

        System.out.println("String Builder Reverse Approach : " + reverseStringByStringBuilderReverse(givenString));

        System.out.println("Manual Approach : " + reverseStringManually(givenString));

    }

    private static String reverseStringByStringBuilderReverse(String givenString) {
        StringBuilder builder = new StringBuilder(givenString);
        return builder.reverse().toString();
    }

    private static String reverseStringManually(String givenString) {

        StringBuilder reversedString = new StringBuilder();

        for (int i = givenString.length() - 1; i >= 0; i--) {

            reversedString.append(givenString.charAt(i));

        }
        return reversedString.toString();

    }
}
