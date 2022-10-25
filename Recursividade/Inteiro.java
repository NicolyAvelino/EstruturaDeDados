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

    // mdc
    public int mdc(int v1, int v2){
        int r = v1 % v2;
        if(r==0)
            return v2;
        return mdc(v2,r);
    }

    // fibonacci
    public int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // fibonacci usando vetor
    public void fibonacciV(int vet[], int n){
        if(n==1){
            vet[n-1] = 1;
        }
        else if(n==2){
            fibonacciV(vet, n-1);
            vet[n-1] = 1;
        }
        else{
            fibonacciV(vet, n-1);
            vet[n-1] = vet[n-2] + vet[n-3];
        }
    }
}