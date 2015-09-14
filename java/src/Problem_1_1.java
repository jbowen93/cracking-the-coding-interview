import java.util.Scanner;

public class Problem_1_1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    hasUniqueChars(input);

  }

  public static boolean hasUniqueChars(String str) {

    boolean[] char_set = new boolean[256];
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (char_set[c]) {
        System.out.println("False");
        return false;
      }
      char_set[c] = true;
    }
    System.out.println("True");
    return true;
  }
}
