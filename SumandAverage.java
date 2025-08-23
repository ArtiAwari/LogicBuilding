import java.util.Scanner;
public class SumandAverage {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of array:");
    int N=sc.nextInt();
    int []arr=new int[N];
    System.out.print("Enter array elements:");
    for(int i=0;i<N;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<N;i++){
        sum+=arr[i];
    }
    int Average=sum/N;
    System.out.println("Sum:"+sum);
    System.out.println("Average:"+Average);
    sc.close();
    }
}
