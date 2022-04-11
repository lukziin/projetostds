import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner meuObj = new Scanner(System.in);
        System.out.println("Entre com o primeiro valor:");
        int valora = meuObj.nextInt();
        System.out.println("Entre com o segundo valor:");
        int valorb = meuObj.nextInt();
        if (valora < valorb) {
            while (valora < valorb) {
                System.out.println(valora);
                valora++;
            }
        } else {
            while(valora > valorb){
                System.out.println(valora);
                valora--;
            }
        }
        meuObj.close();
    }
}