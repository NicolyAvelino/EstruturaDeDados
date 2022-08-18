import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int m1[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < m1.length; i++){
            for (int c = 0; c < m1[i].length; c++){
                m1[i][c] = sc.nextInt();

            }
        }
        for (int i = 0; i < m1.length; i++){
            for (int c = 0; c < m1[i].length; c++){
                System.out.print(m1[i][c] + "\t");

            }
        System.out.println("");    
        }
        
    }
}