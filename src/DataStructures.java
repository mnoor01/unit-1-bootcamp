import sun.tools.tree.ShiftRightExpression;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    public static void main(String args[]) {
        List<Cat> catList = new ArrayList<>();
        Cat garfield = new Cat();
        garfield.setName("garfield");
        garfield.setFavoriteFood("Lasagna");
        garfield.setAge(12);

        Cat pinkPanther = new Cat();
        pinkPanther.setName("pink panther");
        pinkPanther.setFavoriteFood("pizza");
        pinkPanther.setAge(11);

        Cat catwomen = new Cat();
        catwomen.setName("catwomen");
        catwomen.setFavoriteFood("cheeseburger");
        catwomen.setAge(10);

        Cat Lisa = new Cat();
        Lisa.setName("Lisa");
        Lisa.setFavoriteFood("biryani with curry chicken");
        Lisa.setAge(10);
        List nice= new ArrayList();



        Cat emma = new Cat();
        emma.setName("emma");
        emma.setAge(11);
        emma.setFavoriteFood("mexican food");

        catList.add(pinkPanther);
        catList.add(garfield);
        catList.add(catwomen);
        catList.add(Lisa);
        catList.add(emma);

        for (int i = 0; i < catList.size(); i++) {
            System.out.println(catList.get(i).getName() + " likes " + catList.get(i).getFavoriteFood() + " and is of age " + catList.get(i).getAge());

        }
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(6);
        listOfNumbers.add(6);
        listOfNumbers.add(6);
        listOfNumbers.add(5);
        listOfNumbers.add(4);
        listOfNumbers.add(3);
        listOfNumbers.add(3);
        listOfNumbers.add(2);
        mostFrequentElement(listOfNumbers);
        HashMap<String, Integer> fellows = new HashMap<>();
        fellows.put("wayne", 25);
        fellows.put("anas", 26);
        fellows.put("vivian", 26);
        fellows.put("yisandy", 22);
        fellows.put("Victoria", 23);
        fellows.put("yoki", 24);
        fellows.put("amy", 26);
        fellows.put("neima", 19);
        fellows.put("Volha", 25);
        fellows.put("murad", 29);
        fellows.put("Moaz", 30);
        fellows.put("Chantel", 24);
        fellows.put("Tatiana", 27);
        fellows.put("Francisco", 24);
        fellows.put("Matin", 26);
        fellows.put("Darnell", 28);
        fellows.put("Jervon", 23);
        fellows.put("Jaonne", 25);
        fellows.put("Raheel", 25);
        fellows.put("Amar", 26);
        fellows.put("Siran", 30);
        fellows.put("Ashley", 20);
        fellows.put("Tayshaun", 20);
        String[] hey={"kfnjknerfgvjnerkgjnerjgn","njndjnwrfnref","jwnfknvjn","llll"};

        System.out.println(ommitedStringSize(hey,4));
        int [] myIntegers={1,4,4,6,37,8};
        System.out.println(numbOfClumps(myIntegers));


        HashMap<String,Integer> youngFellows= new HashMap<>();
        youngFellows.put("neima",19);
        youngFellows.put("Tayshaun",20);
        youngFellows.put("Johnny",25);
        System.out.println(canRentACar(youngFellows));


        System.out.println(canRentACar(fellows));
        for (Map.Entry<String, Integer> Z : fellows.entrySet()) {
            System.out.println(Z.getKey() + " " +Z.getValue() );

        }
        sortingSentences("how are you honey?");


    }

    public static void mostFrequentElement(List<Integer> listOfIntegers) {
//    listOfIntegers=new ArrayList<>();

        HashSet<Integer> integerSet = new HashSet<>();
        integerSet.addAll(listOfIntegers);// so in here I will only add 1 of each item in my list
        HashMap<Integer, Integer> compare = new HashMap<>();
        int holdKey = 0;
        int holdValue = 0;
        for (Iterator<Integer> it = integerSet.iterator(); it.hasNext(); ) {
            int i = it.next();//this is taking the integers inside the set.
            if (!compare.containsKey(i)) {
                int count = 0;
                for (int j = 0; j < listOfIntegers.size(); j++) {
                    if (i == listOfIntegers.get(j)) {
                        count++;
                    }
                }
                if (holdValue < count) {
                    holdValue = count;

                    holdKey = i;
                }

            }

        }
        System.out.println("Most Frequent number: " + holdKey);
        System.out.println("Most Frequent times: " + holdValue);

    }

    public static boolean canRentACar(HashMap<String, Integer> classmates) {
        for (Map.Entry<String, Integer> android : classmates.entrySet()) {
            String fellowName = android.getKey();
            int age = android.getValue();

            if (age >= 25) {
                return true;

            }
            if (age < 25){
                return false;
            }

        }


        return false;
    }
    public static List<String> ommitedStringSize(String[] listOfWords, int sizeOfString){
        List<String> chosenWords= new ArrayList<>();
        for (int i = 0; i < listOfWords.length; i++) {
            String aWord=listOfWords[i];

            chosenWords.add(aWord);

            if (aWord.length()==sizeOfString){
                chosenWords.remove(aWord);

            }
        }
        return chosenWords;
    }
    public static int numbOfClumps(int[] listOfIntegers){
        int count=0;
        for (int i = 0; i < listOfIntegers.length; i++) {

           int numb1=listOfIntegers[i];
            for (int j = 0; j < listOfIntegers.length; j++) {
                int numb2=listOfIntegers[j];
                if (numb1==numb2){
                    count++;
                    return count;
            }
            }


        }
        return count;
    }
    public static void sortingSentences(String sentence){
        String[] wordArray=sentence.split(" ");
        List<String> wordList= new ArrayList<>();

//        System.out.println(wordArray);
            for (String j :wordArray) {

                wordList.add(j);
                Collections.sort(wordList);


            }
            System.out.println(wordList);
        }
    }

