import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Inteiro inteiro = new Inteiro();
        int t = 5;
        int vet = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n = sc.nextInt();

        int ft = inteiro.fatorialR(n);
        int sm = inteiro.soma(n);
        double sm2 = inteiro.soma2(n);
        double sm3 = inteiro.soma3(n);

        // mdc
        int mdc = inteiro.mdc(250,150);

        // fibonacci
        int fb = inteiro.fibonacci(n);
        int fbV = inteiro.fibonacciV(vet,t);
        
        System.out.printf("%d! = %d \nSomatória = %d \nSomatória 2º = %.2f \nSomatória 3º = %.2f \nMDC = %d \nFibonacci = %d \nFibonacci Com Vetor = %d",n,ft,sm,sm2,sm3,mdc,fb,fbV);
    }
}