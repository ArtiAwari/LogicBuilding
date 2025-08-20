public class RemoveExtraSpaces {
    public static void main(String args[]){
        String s="   Welcome   to   Sanjivani";
        String output=s.trim().replaceAll("\\s+"," ");
        System.out.println("Input:" +s);
        System.out.println("Output:"+output);
    }
    
}
