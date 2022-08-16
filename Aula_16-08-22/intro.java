public class intro{
    public static void main(String[] args){
        System.out.printf("%.2f %d %s", 3.1415169, 100,"Nicky");
    }
}
// Criando Classes
public class intro{
    public static void main(String[] args){
        int a = 100;
        double b = 3.1415169;
        float c = 5.75f;
        String nome = "Nicky";

        System.out.printf("%.2f %d %s %1.f", b, a,nome,c);
    }
}
// Entrada de Dados
import java.util.Scanner;
public class  intro {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero ");
        x = sc.nextInt();

        System.out.printf("O numero Digitado: %d", x);
    }
}