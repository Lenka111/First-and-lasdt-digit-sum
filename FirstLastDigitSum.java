//Elena Voinu
public class FirstLastDigitSum {
    
    // method named sumFirstAndLastDigit with one parameter of type int called number
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int lastDigit = 0;
        int firstDigit = 0;
        
        //If the number is negative then the method needs to return -1 to indicate an invalid value.
        if(number < 0)
            return -1;

        // if the number is greater than 0 and less than 10, multiply it by to to get the sum
        if ((number > 0) && (number < 10)) {
            return number * 2; 
        }

        else {
            // find the last digit using the modulo operator
            lastDigit = number % 10;
            // loop and return the sum of the first and the last digit of that number
            while(number >=10){
                
                // find first number by dividing the number by 10
                number /=10;
                //store the first number in a variable
                firstDigit = number;
                //sum of first and lust digit
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
