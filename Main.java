// import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    float g = 33.2676767f;
    byte e = 127;
    char c = 'y';
    int n = 3;
    long l = 120_8922389_38982l;
 

    System.out.println(e);

    String Exchange = addString("People");

    System.out.println( Exchange + " " + c + " " + n + " " + l+ " " + g + " " + "we done!");
    
    Car mycar = new Car();
    Car mycar2 = mycar;

    System.out.println(mycar.make);
    System.out.println(mycar2.model);

  }

  public static String addString(String s){
    return s.toUpperCase();
  }
}
