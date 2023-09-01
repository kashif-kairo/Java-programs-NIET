import java.util.Scanner;
public class Transpose {
    
    public static void main(String[] args){
        int r ;
        Scanner sc = new Scanner(System.in);
        r=sc.nextInt();
        // c=sc.nextInt();
        System.out.println("enter the elements of arrays ");
        int arr[][]=new int[r][r];
        for(int i =1; i<=r; i++){
            for(int j =1; j<=r;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int trans[][]=new int[r][r];
        for(int it =1; it<=r; it++){
            for(int jt =1; jt<r;jt++){
                trans[it][jt]=arr[jt][it];
            }
        }
        for(int a =1; a<=r; a++){
            for(int b=1; b<=r;b++){
                System.out.print(trans[a][b]+" ");
            }
            System.out.println("");
        }
                sc.close();



    }
}
