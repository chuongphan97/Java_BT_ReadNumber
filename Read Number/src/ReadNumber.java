import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Input number: ");
        int number = scanner.nextInt();
        int ones,tens,hundreds;
        String numberString,tensString ="",onesString ="", hundredsString = "";


        if (number > 999 || number < 0) System.out.println("Out of ability!");
        else {
            if (number <= 12) {
                switch (number) {
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                    case 10 -> System.out.println("Ten");
                    case 11 -> System.out.println("Eleven");
                    case 12 -> System.out.println("Twelve");
                }
            } else if (number <= 20) {
                ones = number % 10;
                switch (ones) {
                    case 3 -> System.out.println("Thirteen");
                    case 4 -> System.out.println("Fourteen");
                    case 5 -> System.out.println("Fifteen");
                    case 6 -> System.out.println("Sixteen");
                    case 7 -> System.out.println("Seventeen");
                    case 8 -> System.out.println("Eighteen");
                    case 9 -> System.out.println("Nineteen");
                    case 0 -> System.out.println("Twenty");
                }

            } else if (number < 100) {

                tens = number / 10;
                ones = number % 10;
                switch (tens) {
                    case 2 -> tensString = "Twenty";
                    case 3 -> tensString = "Thirty";
                    case 4 -> tensString = "Forty";
                    case 5 -> tensString = "Fifty";
                    case 6 -> tensString = "Sixty";
                    case 7 -> tensString = "Seventy";
                    case 8 -> tensString = "Eighty";
                    case 9 -> tensString = "Ninety";
                }
                switch (ones) {
                    case 0 -> onesString = "";
                    case 1 -> onesString = " one";
                    case 2 -> onesString = " two";
                    case 3 -> onesString = " three";
                    case 4 -> onesString = " four";
                    case 5 -> onesString = "five";
                    case 6 -> onesString = " six";
                    case 7 -> onesString = " seven";
                    case 8 -> onesString = " eight";
                    case 9 -> onesString = " nine";
                }
                numberString = tensString + onesString;
                System.out.printf("%s",numberString);
            } else {
                hundreds = number/100;
                tens = (number % 100) / 10;
                ones = (number % 100) % 10;


                switch (hundreds) {
                    case 1 -> hundredsString = "One hundred and ";
                    case 2 -> hundredsString = "Two hundred and ";
                    case 3 -> hundredsString = "Three hundred and ";
                    case 4 -> hundredsString = "Four hundred and ";
                    case 5 -> hundredsString = "Five hundred and ";
                    case 6 -> hundredsString = "Six hundred and ";
                    case 7 -> hundredsString = "Seven hundred and ";
                    case 8 -> hundredsString = "Eight hundred and ";
                    case 9 -> hundredsString = "Nine hundred and ";
                }

                if (tens == 1) {
                    switch (ones) {
                        case 1:
                            tensString = "eleven";

                            break;
                        case 2:
                            tensString = "twelve";
                            break;
                        case 3:
                            tensString = "thirteen";
                            break;
                        case 4:
                            tensString = "fourteen";
                            break;
                        case 5:
                            tensString = "fifteen";
                            break;
                        case 6:
                            tensString = "sixteen";
                            break;
                        case 7:
                            tensString = "seventeen";
                            break;
                        case 8:
                            tensString = "eighteen";
                            break;
                        case 9:
                            tensString = "nineteen";
                            break;
                        case 0:
                            tensString = "twenty";
                            break;
                        default:

                            }


                } else {
                    tensString = switch (tens) {
                        case 2 -> "twenty";
                        case 3 -> "thirty";
                        case 4 -> "forty";
                        case 5 -> "fifty";
                        case 6 -> "sixty";
                        case 7 -> "seventy";
                        case 8 -> "eighty";
                        case 9 -> "ninety";
                        default -> tensString;
                    };
                    onesString = switch (ones) {
                        case 0 -> "zero";
                        case 1 -> "one";
                        case 2 -> "two";
                        case 3 -> "three";
                        case 4 -> "four";
                        case 5 -> "five";
                        case 6 -> "six";
                        case 7 -> "seven";
                        case 8 -> "eight";
                        case 9 -> "nine";
                        default -> onesString;
                    };

                }
                numberString = hundredsString + tensString + onesString;
                System.out.printf("%s",numberString);

            }
        }
    }
}
