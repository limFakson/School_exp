public class Main {
  public static void main(String[] args) {
    char c = 'y';
    int n = 3;
    long l = 120;
    double g = 3.2;

    String exchange = addString("People");

    System.out.println( exchange + " " + c + " " + n + " " + l+ " " + g + " " + "we done!");
  }

  public static String addString(String s){
    return s.toUpperCase();
  }
}