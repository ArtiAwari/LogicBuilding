import java.util.Scanner;
public class Duplicate {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int N=s.nextInt();
        int []A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=s.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(A[i]==A[j]){
                    System.out.println(A[i]);
                    break;
                }
            }
        }
        s.close();
    }
}
