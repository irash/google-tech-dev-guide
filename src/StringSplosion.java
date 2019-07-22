public class StringSplosion {
  private StringSplosion() {}

  private String stringSplosion(String str) {
    String output = "";
    for (int i=0; i < str.length(); i++) {
      output += str.substring(0, i+1);
    }
    return output;
  }

  public static void main(String[] args) {
    StringSplosion splosion = new StringSplosion();
    System.out.println(splosion.stringSplosion("Code"));
    System.out.println(splosion.stringSplosion("abc"));
    System.out.println(splosion.stringSplosion("ab"));
    System.out.println(splosion.stringSplosion("x"));
    System.out.println(splosion.stringSplosion("fade"));
    System.out.println(splosion.stringSplosion("There"));
    System.out.println(splosion.stringSplosion("Kitten"));
    System.out.println(splosion.stringSplosion("Bye"));
    System.out.println(splosion.stringSplosion("Good"));
    System.out.println(splosion.stringSplosion("Bad"));
  }
}
