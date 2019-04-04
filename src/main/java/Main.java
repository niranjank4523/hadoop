import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("test\\*test","*");
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}
