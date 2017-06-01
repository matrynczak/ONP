import java.util.Scanner;
import java.util.Stack;

/**
 * Created by mateusz on 31.05.17.
 */
public class CalculatingONP {

    public static void main(String[] args) {

        Stack<Double> stos = new Stack<>();
        String token = getToken();

        Integer tokenCharLength = token.length();

        double a;
        double b;
        Integer result;

        for (int i = 0; i < tokenCharLength; i++) {
            Character tokenElement = token.charAt(i);

               if( tokenElement == '+') {
                   stos.push(stos.pop() + stos.pop());
               }
               else if(tokenElement == '-') {
                    Double x = stos.pop();
                    Double y = stos.pop();
                    stos.push(y - x);
                }
               else if (tokenElement == '*') {
                    stos.push(stos.pop() * stos.pop());
                }
                else if (tokenElement == '/') {
                    Double xx = stos.pop();
                    Double yy = stos.pop();
                    stos.push(yy / xx);
                }
                else if (tokenElement>='0' && tokenElement<='9') {
                    String numer = tokenElement.toString();
                    stos.push(Double.valueOf(numer));
                    System.out.print(numer);
                }
                System.out.print(stos+"\n");
            }
        System.out.print(stos);
        }

        public static String getToken () {
            System.out.print("Podaj ciag liczb wg odwrotnej notacji polskiej. Dozwolone znaki +,-,*,/:\n");
            Scanner s = new Scanner(System.in);
            String token = s.next();
            return token;
        }


    }
