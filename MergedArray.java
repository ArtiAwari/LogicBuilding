import java.util.Scanner;
import java.util.Arrays;
public class MergedArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array:");
        int size1=sc.nextInt();
        System.out.print("Enter size of second array:");
        int size2=sc.nextInt();
        int []arr1=new int[size1];
        int []arr2=new int[size2];
        System.out.print("Enter elements of first array:");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter elements of second array:");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }

        int []merged=new int[size1+size2];
        for(int i=0;i<size1;i++){
            merged[i]=arr1[i];
        }
        for(int i=0;i<size2;i++){
            merged[size1+i]=arr2[i];
        }
        Arrays.sort(merged);
        System.out.print("Merged Array:");
        for(int k=0;k<merged.length;k++){
            System.out.print(merged[k]+" ");
        }
        sc.close();
    }
    
}
