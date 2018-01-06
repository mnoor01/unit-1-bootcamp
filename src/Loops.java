import java.util.HashMap;
import java.util.Map;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {


    public static void main(String args[]) {
//        ontThroughTen();
//        forOneThroughTen();
//        oneThroughn(11);
//        evenNumbers(9);
//        sumOfNumbers();
//        sumOfN(1000);
//        printS("nice", 4);
//        fibonacciNumbers();
//        System.out.println(sumOfFibonacciNumbers(10));
//        HashMap<Integer, Integer> wayne = numberPuzzle();
//        System.out.println(digits());
//        System.out.println(sumOfStringNumbers("587984579nfknvknfd"));
//        System.out.println(sumOfStringNumbers("123dnfvnwf"));
        System.out.println(isNot("this is android"));
        System.out.println(betweenWords("123xy123","xy"));
//        for (int s : wayne.keySet()) {
//
//            System.out.print("num 1: " + s + " ");
//            System.out.println("num 2: " + wayne.get(s));
//        }

    }

    public static void ontThroughTen() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i++);

        }


    }

    public static void forOneThroughTen() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void oneThroughn(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i++);
        }

    }

    public static void evenNumbers(int n) {
        int i = 0;
        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

    }

    public static void sumOfNumbers() {
        int k = 0;
        for (int i = 0; i <= 10; i++) {
            k = k + i;


        }
        System.out.println(k);
    }

    public static void sumOfN(int n) {
        int k = 0;
        for (int i = 0; i <= n; i++) {
            k += i;

        }
        System.out.println(k);
    }

    public static void printS(String s, int n) {
        String k = "";
        for (int i = 0; i < n; i++) {
            k = k + " " + " " + s;
            if (n < 0) {
                System.out.println(" ");
            }


        }
        System.out.println(k);
    }

    public static void fibonacciNumbers() {
        int n = 10;
        if (n < 1) {
            System.out.println(n);
        }
        //0,1,1,2,3,5,8,11
        for (int i = 0; i < n; i++) {
            System.out.println(((i - 1)) + ((i - 2)));

        }
    }

    public static int sumOfFibonacciNumbers(int j) {
        int k = 10;
        for (int i = 0; i < k; i++) {
            k = ((i - 1) + (i - 2));
            j = k + j;

        }
        return j;
    }

    //    public static int sumNumbers(String someString) {
//        int i = 0;
//        for (i = 0; i < 10; i++) {
//            if (i == someString.substring(0, i)) {
//                return i;
//            }
//
//        }
//        return i;
//
//    }
    public static HashMap numberPuzzle() {
        int a;
        int b;
        int k;
        int l;
        HashMap<Integer, Integer> linkedNumbers = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            a = i;
            for (int j = 0; j < 100; j++) {
                b = j;
                if ((a + b) == 60) {
                    linkedNumbers.put(a, b);

                }
                for (k = 0; k < 100; k++) {
                    for (l = 0; l < 100; l++) {
                        if ((k - l) == 14) {
                            linkedNumbers.put(k, l);
                        }

                    }

                }


            }


        }
        return linkedNumbers;
    }

    public static int sumOfStringNumbers(String wordInput) {
        String numberWord = "";
        int numbs = 0;

        for (int i = 0; i < wordInput.length(); i++) {
            if (Character.isDigit(wordInput.charAt(i))) {
                numberWord += wordInput.charAt(i);
                numbs = Integer.valueOf(numberWord);
            }

        }
        return numbs;
    }

    public static HashMap<Integer, Integer> digits() {
        HashMap<Integer, Integer> digitSum = new HashMap<>();
        int a = 0;
        int sum = 0;
        int nice = 100;


        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                a++;
                for (int j = 0; j < 10; j++) {
                    sum = (a + j);


                }
            }


        }
        for (int l = 0; l < 100; l++) {
            digitSum.put(l, sum);
        }
        return digitSum;

    }

    public static String isNot(String inputSentence) {
        int i = 0;
        while (i < inputSentence.length() - 1) {
            if (inputSentence.substring(i, i + 2).equalsIgnoreCase("is") && !Character.isLetter(inputSentence.charAt(i - 1))) {
                inputSentence = inputSentence.substring(0, i) + "is not" + inputSentence.substring(i + 2, inputSentence.length());
                return inputSentence;

            }
            i++;
        }
        return inputSentence;
    }

    public static String betweenWords(String inputWord, String sideWord) {
        String output=" ";
        int i=0;
        while (i<inputWord.length()){
            if (inputWord.substring(i,))
        }
        return output;
    }
}
