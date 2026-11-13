import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ABC(104));
        System.out.println(Arrays.toString(Cifrado(scanner.nextLine(), scanner.nextInt())));
    }
    public static String[] Cifrado(String texto, int clave){
        texto.toLowerCase();
        int[] tCifradoNum = new int[texto.length()];
        for (int i = 0; i< tCifradoNum.length; i++){
            tCifradoNum[i]=(texto.charAt(i))+clave;
        }
        String[] tCifrado = new String[texto.length()];
        for (int i = 0; i<tCifrado.length;i++){
            tCifrado[i]=ABC(tCifradoNum[i]);
        }
        return tCifrado;
    }
    public static String ABC(int a) {
        String pendiente = "";
        if (a>=0 && a<=26) {
            switch (a) {
                case 0:
                    pendiente = "A";
                    break;
                case 1:
                    pendiente = "B";
                    break;
                case 2:
                    pendiente = "C";
                    break;
                case 3:
                    pendiente = "D";
                    break;
                case 4:
                    pendiente = "E";
                    break;
                case 5:
                    pendiente = "F";
                    break;
                case 6:
                    pendiente = "G";
                    break;
                case 7:
                    pendiente = "H";
                    break;
                case 8:
                    pendiente = "I";
                    break;
                case 9:
                    pendiente = "J";
                    break;
                case 10:
                    pendiente = "K";
                    break;
                case 11:
                    pendiente = "L";
                    break;
                case 12:
                    pendiente = "M";
                    break;
                case 13:
                    pendiente = "N";
                    break;
                case 14:
                    pendiente = "O";
                    break;
                case 15:
                    pendiente = "P";
                    break;
                case 16:
                    pendiente = "Q";
                    break;
                case 17:
                    pendiente = "R";
                    break;
                case 18:
                    pendiente = "S";
                    break;
                case 19:
                    pendiente = "T";
                    break;
                case 20:
                    pendiente = "U";
                    break;
                case 21:
                    pendiente = "V";
                    break;
                case 22:
                    pendiente = "W";
                    break;
                case 23:
                    pendiente = "X";
                    break;
                case 24:
                    pendiente = "Y";
                    break;
                case 25:
                    pendiente = "Z";
                    break;
            }
        } else{
            pendiente = ABC((a%26)) + (a/26);
        }
        return pendiente;
    }
}