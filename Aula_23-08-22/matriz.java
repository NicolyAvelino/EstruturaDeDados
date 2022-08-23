import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m1[][] = new int[3][];
        for(int i = 0; i <m1.length; i++){
            m1[i] = new int[i+1];
            for(int j=0; j<m1[i].length;j++){
                System.out.printf(m1[i][j] + "\t");
                m1[i][j] = sc.nextInt;
            }
        }
    }
}