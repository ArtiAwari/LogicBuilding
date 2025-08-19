import java.util.Scanner;
public class MoveZeroLast {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter number of elements:");
        n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("Enter array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Move non-zero elements forward
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }

        //Palce zero's at last
        while(index<arr.length){
            arr[index]=0;
            index++;
        }

        //print
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1)//if we didn't mention this condition then it will print like[12,45,6,0,0,0,]   extra ","
            System.out.print(",");
        }
        System.out.print("]");
        sc.close();
    }
}
