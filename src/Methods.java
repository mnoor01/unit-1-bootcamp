/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {
    System.out.println(calculateSquare(2));
    System.out.println(calculateSquareRoot(4));
    System.out.println(toLowerCase("KNSDKJCNKJDSBCJ"));
    System.out.println(isMultiple(6,30));
    System.out.println(randomNumber(6,15));
    prettyInteger(5);

  }
  public static int calculateSquare(int n){
    int k=Math.multiplyExact(n,n);
    return k;

  }
  public static double calculateSquareRoot(int n){
    double k=Math.sqrt(n);

    return k;


  }
  public static String toLowerCase(String word){
    String lowerCase=" ";
    lowerCase=word.toLowerCase();
     return lowerCase;
  }
  public static boolean isMultiple(int a, int b){
    if(b%a==0){
      return true;
    }
    else {
      return false;
    }
    
  }
  public static void prettyInteger(int n){
    String astra="";
    for (int i = 0; i < n; i++) {
      astra=astra+ "*";
    }
    System.out.println(astra + " " + n + " " + astra);
  }
  public static int randomNumber(int a,int b){
    int j= (int) (Math.random()*b + a);
    return j;
  }
}
