public class StringCalculator extends StringCalculatorInterface{
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");

        for (String number : numbersArray) {
            if(Integer.parseInt(number)<0){
                throw new RuntimeException("Only positive nubvers are allowed");
            } else {
                if (!number.trim().isEmpty() && Integer.parseInt(number) < 1000) {
                    returnValue += Integer.parseInt(number.trim());
                }
            }
        }
        return returnValue;
    }
}