//Elena Voinu
public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int lastDigit = 0;
        int firstDigit = 0;

        if(number < 0)
            return -1;

        if ((number > 0) && (number < 10)) {
            return number * 2; }

        else{

            lastDigit = number % 10;
            while(number >=10){
                number /=10;
                firstDigit = number;
                sum =lastDigit + firstDigit;

            }

            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sum of first and last digit is: " +
                "" + sumFirstAndLastDigit(245));
    }

}