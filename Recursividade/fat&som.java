public class Inteiro{
    public int fatorialR(int n){
        if(n > 1){
            return fatorialR(n-1) * n;
        }
        return 1;
    }

    public int soma(int n){
        if(n > 1){
            return soma(n-1) + n;
        }
        return n;
    }

    public double soma2(int n){
        if(n >= 2){
            return soma2(n/2) + 1.0/n;
        }
        return 0;
    }
    // outra forma de fazer o soma2
    public double soma3(int n){
        if(n < 2)
            return 0;
        return soma3(n/2) + 1.0/n;
    }
}

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Inteiro inteiro = new Inteiro();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n = sc.nextInt();

        int ft = inteiro.fatorialR(n);
        int sm = inteiro.soma(n);
        double sm2 = inteiro.soma2(n);
        double sm3 = inteiro.soma3(n);
        
        System.out.printf("%d! = %d \nSomatória = %d \nSomatória 2º = %.2f \nSomatória 3º = %.2f",n,ft,sm,sm2,sm3);
    }
}