public class RepeatFront2 {
  public String repeatFront(String str, int n) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < n;) {
      result.append(str.substring(0, n));
      n--;
    }
    return result.toString();
  }
}
