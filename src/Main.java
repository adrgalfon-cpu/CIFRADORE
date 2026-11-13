import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(Cifrado(scanner.nextLine(), scanner.nextInt())));
    }
    public static String[] Cifrado(String texto, int clave){
        texto.toLowerCase();
        int[] tCifradoNum = new int[texto.length()];
        for (int i = 0; i< tCifradoNum.length; i++){
            tCifradoNum[i]=texto.charAt(i);
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
                case 1:
                    pendiente = "A";
                    break;
                case 2:
                    pendiente = "B";
                    break;
                case 3:
                    pendiente = "C";
                    break;
                case 4:
                    pendiente = "D";
                    break;
                case 5:
                    pendiente = "E";
                    break;
                case 6:
                    pendiente = "F";
                    break;
                case 7:
                    pendiente = "G";
                    break;
                case 8:
                    pendiente = "H";
                    break;
                case 9:
                    pendiente = "I";
                    break;
                case 10:
                    pendiente = "J";
                    break;
                case 11:
                    pendiente = "K";
                    break;
                case 12:
                    pendiente = "L";
                    break;
                case 13:
                    pendiente = "M";
                    break;
                case 14:
                    pendiente = "N";
                    break;
                case 15:
                    pendiente = "O";
                    break;
                case 16:
                    pendiente = "P";
                    break;
                case 17:
                    pendiente = "Q";
                    break;
                case 18:
                    pendiente = "R";
                    break;
                case 19:
                    pendiente = "S";
                    break;
                case 20:
                    pendiente = "T";
                    break;
                case 21:
                    pendiente = "U";
                    break;
                case 22:
                    pendiente = "V";
                    break;
                case 23:
                    pendiente = "W";
                    break;
                case 24:
                    pendiente = "X";
                    break;
                case 25:
                    pendiente = "Y";
                    break;
                case 26:
                    pendiente = "Z";
                    break;
            }
        } else{
            pendiente = ABC(a%26) + (a/26);
        }
        return pendiente;
    }
}