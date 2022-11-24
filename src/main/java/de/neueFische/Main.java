package de.neueFische;

public class Main {
    public static void main(String[] args) {

                System.out.println(stringLongerThenTwenty("testString"));
                System.out.println(stringFancy("testString"));
                System.out.println(stringFanc("test"));
                System.out.println(Fizzbuzz(5));

            }
            public static boolean stringLongerThenTwenty(String testString){
                int stringSize= testString.length();
                System.out.println(stringSize);
                boolean result = stringSize>20 ;
                System.out.println(stringFancy(testString));
                return result ;
            }
            public static boolean stringFancy(String testString){
                boolean result = testString.contains("Fancy");
                return result;
            }
            public static boolean stringFanc(String teststring1){
                boolean result =teststring1.contains("test");
                return result ;

            }
            public static int addieren(int number1, int number2){
                return number1 + number2;
            }
            public static boolean groeßerAls100(int number1 ){
                return 100 < number1;

            }


            public static String Fizzbuzz(int number) {
                if (number%3 ==0) return "fizz";
                else if ( number  %5 ==0) return "buzz";
                else return "number";

            }
        }

