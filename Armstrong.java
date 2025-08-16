import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter any number:");
    int num=s.nextInt();
    int original=num;
    int sum=0;
    int digits=String.valueOf(num).length();//Convert number into string and then count no. of digits into number
    while(num>0){
        int digit=num%10;
        sum=sum+(int)Math.pow(digit,digits);//Math.pow(digit, digits) in Java returns a double, but your variable sum is of type int.
        num=num/10;
    }
    if(sum==original){
        System.out.println("The number "+original+" is Armstrong.");
    }
    else{
        System.out.println("The number "+original+" is not Armstrong.");
    }
    s.close();
    }
}
