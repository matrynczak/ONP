import java.util.Scanner;
import java.util.Stack;

/**
 * Created by mateusz on 31.05.17.
 */
public class CalculatingONP {

    public static void main(String[] args) {

        Stack<Double> stos = new Stack<>();
        String token = "start";

        System.out.print("Podaj ciag liczb wg odwrotnej notacji polskiej. Dozwolone znaki to liczby oraz +,-,*,/:\n " +
                "Wpisanie znaku = spowoduje zakończenie i wypisanie zawartości stosu.\n");

        while(!token.equals("=")) {

            token = getToken();

            if (token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")||token.equals("=")) {
                if (token.equals("+")) {
                    stos.push(stos.pop() + stos.pop());
                    System.out.print(stos + "\n");
                }
                else if (token.equals("-")) {
                    Double x = stos.pop();
                    Double y = stos.pop();
                    stos.push(y - x);
                    System.out.print(stos + "\n");
                }
                else if (token.equals("*")) {
                    stos.push(stos.pop() * stos.pop());
                    System.out.print(stos + "\n");
                }
                else if (token.equals("/")) {
                    Double xx = stos.pop();
                    Double yy = stos.pop();
                    stos.push(yy / xx);
                    System.out.print(stos + "\n");
                }
            }
            else {
                    stos.push(Double.valueOf(token));
                    System.out.print(stos + "\n");

                 }
            }
        System.out.print(stos);
        }

        public static String getToken () {
            Scanner s = new Scanner(System.in);
            String token = s.next();
            return token;
        }
}
