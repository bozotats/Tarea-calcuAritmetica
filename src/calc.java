import java.util.StringTokenizer;
import java.util.Scanner;
// recibir entrada por scanner 
public class calc {
  public static void main(String[] args) throws Exception {
    StringTokenizer tkizer = new StringTokenizer(args[0], "+-*/()^", true);
    boolean numflag = true;
    String tempNumToken = "";
    String tempToken = "";

    while (tkizer.hasMoreTokens()){
      tempToken = tkizer.nextToken();
      switch (tempToken){
        case "+":
          break;
        case "-":
          break;
        case "*":
          break;
        case "/":
          break;
        case "(":
          break;
        case ")":
          break;
        case "^":
          break;
        default:
          if (tempToken.matches("[0-9]+")) {
       
          } else {
       
          }
          break;
      }
    }
  }
}

