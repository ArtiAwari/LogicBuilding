/*       
*
***
*****
*******
*********
*/
/*3 ways to print the above pattern*/
public class Pattern1 {
    public void print1(){
    for(int i=1;i<=5;i++){
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
         System.out.println();
    }
    }
    public void print2(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void print3(){
        for(int i=0;i<5;i++){
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void main(String args[]){
        Pattern1 p=new Pattern1();
        p.print1();
        p.print2();
        p.print3();
    }
}

