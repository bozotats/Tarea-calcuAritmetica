import java.util.StringTokenizer;

public class calc {
    public static void main(String[] args){
        StringTokenizer tkizer = new StringTokenizer(args[0], "+-*/()^", true);
        boolean numflag = true;

        while (tkizer.hasMoreTokens()){
            switch (tkizer.nextToken()){
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
                    if (tkizer.nextToken().matches("[0-9]+")) {
                        
                    } else {

                    }
                    break;
            }
        }
    }
}