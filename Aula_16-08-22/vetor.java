import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("%s\n", args[0]);
    }
}
// Declarar vetores
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int vetA[]={1,2,3,4,5};
        System.out.printf("%s\n", vetA[0]);
    }
}
// Usando For
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int vetA[]={1,2,3,4,5};
        for(int i=0; i < vetA.length; i++){
             System.out.printf("%d\n", vetA[i]);
        }
    }
}

// Usando while
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int vetA[]= new int[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.printf("Entrada de Dados \n");
        while(i<vetA.length){
            vetA[i++] = sc.nextInt(); 
            // pós incremento [i++], quando concluida add 1
            // pré incremento [++i] , primeiro soma 1 e depois aplica na instrução
        }
        System.out.printf("Saida de Dados \n");
        for(i=0; i < vetA.length; i++){
             System.out.printf("%d\n", vetA[i]);
        }
       
    }
}

// Ordem inversa
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int vetA[]= new int[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.printf("Entrada de Dados \n");
        while(i<vetA.length){
            vetA[i++] = sc.nextInt(); 
        }
        System.out.printf("Saida de Dados \n");
        for(i= vetA.length - 1; i >= 0; i--){
             System.out.printf("%d\n", vetA[i]);
        }
       
    }
}

// Mostrando somente os pares
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int vetA[]= new int[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.printf("Entrada de Dados \n");
        while(i<vetA.length){
            vetA[i++] = sc.nextInt(); 
        }
        System.out.printf("Saida de Dados \n");
        for(i = 0; i < vetA.length; i++){
            if(vetA[i] % 2 == 0){
                System.out.printf("Esse par: %d\n", vetA[i]);
            }
        }
    }
}