import java.util.Scanner;
public class String_rev {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any string:");
        String st=s.nextLine();
        String rev="";
        for(int i=st.length()-1;i>=0;i--){
            rev=rev+st.charAt(i);
        }
        System.out.print(rev);
        s.close();
    }
}
