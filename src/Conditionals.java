import com.sun.tools.javac.util.Assert;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    public static void main(String args[]) {
        System.out.println(isOdd(5));
        Person james = new Person();
        james.setCity("London");

        Person Mike = new Person();
        Mike.setCity("Hoboken");
        Mike.setName("mike");
        longName(Mike);
        System.out.println(cigarParty(40, false));
        System.out.println(cigarParty(100, false));
        System.out.println(cigarParty(500, true));
        if (!isOdd(5)) {
            throw new IllegalStateException("Failed test 0");
        }

        if (isOdd(4)) {
            throw new IllegalStateException("Failed test 1");
        }
        if (!isMultipleOfThree(6)) {
            throw new IllegalStateException("notFailed test1");

        }
        if (isMultipleOfThree(7)) {
            throw new IllegalStateException("not failed test 2");
        }
        if (!isOddAndMultipleOfThree(15)) {
            throw new IllegalStateException("not failed test 3");

        }
        if (!isOddAndMultipleOfThree(9)) {
            throw new IllegalStateException("failed test 5");
        }
//        System.out.println(isLondon(Mike));
        System.out.println(caughtSpeeding(65, false));
    }

    public static boolean isOdd(int n) {

        return n % 2 != 0;
    }

    public static boolean isMultipleOfThree(int n) {
        return n % 3 == 0;

    }

    public static boolean isOddAndMultipleOfThree(int n) {
        return n % 2 != 0 && n % 3 == 0;
    }

    public static void fizzMultipleOfThree(int n) {
        if (n % 3 == 0) {
            System.out.println("fizz");
        } else {
            System.out.println(n);
        }
    }

    public static boolean isLondon(Person person) {

        return person.getCity().equalsIgnoreCase("London");

    }

    public static void longName(Person person) {
        String name = person.getName();
        if (name.length() > 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("name is too short");
        }
    }

    public static boolean cigarParty(int numberOfCigars, boolean isWeekend) {
        if ((numberOfCigars >= 40 && numberOfCigars <= 60) && isWeekend == false) {
            return true;
        }
        if (numberOfCigars >= 40 && isWeekend == true) {
            return true;
        }
        return false;
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }
        int level = 0;
        if ((speed >= 0 && speed <= 60)) {
            level = 0;
            return level;
        }
        if (speed >= 61 && speed <= 80) {
            level = 1;
            return level;
        }
        if (speed > 80) {
            level = 2;
            return level;
        }

        return level;
    }

    public static String alarmClock(int dayOfTheWeek, boolean onVacation) {
        String alarmTime = "";
        if (onVacation && (dayOfTheWeek > 1 && dayOfTheWeek < 7)) {
            alarmTime = "10:00";
            return alarmTime;

        }
        if (onVacation && (dayOfTheWeek == 1 || dayOfTheWeek == 7)) {
            alarmTime = "alarm is turned off";
            return alarmTime;
        }
        if ((dayOfTheWeek > 1 && dayOfTheWeek < 7) && !onVacation) {
            alarmTime = "7:00";
            return alarmTime;
        }
        if ((dayOfTheWeek > 1 || dayOfTheWeek < 7) && !onVacation) {
            alarmTime = "10:00";
            return alarmTime;
        }
        return alarmTime;

    }

    public static int sameNumbers(int a, int b, int c) {
        int rating = 0;
        if ((a != b) && (b != c) &&(a!=c)) {
            rating=0;
            return rating;

        }
        if(a == b || a == c && b != c || b == a || b == c){
            rating=10;
            return rating;
        }
        if((a==b)&&(b==c)&&(a==c)){
            rating=20;
            return rating;

        }
        return rating;
    }
    public static int blackJack(int a, int b){
        int twentyOne=21;
        if((a>b) && a<21) {
            return a;
        }

        if((a>twentyOne)&& (b>twentyOne)){
            return 0;
        }
        else {
            return b;
        }

    }
    public static boolean evenlySpaced(int a ,int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int middle;
        if (a != max && a != min) {
            middle = a;
        } else if (b != max && b != min) {
            middle = c;
        } else {
            middle = c;
        }
        return (max - middle) == (middle - min);
    }
}
