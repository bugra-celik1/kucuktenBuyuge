import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  int n1,n2,n3;



  Scanner inp = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz:" );
        n1 = inp.nextInt();
        System.out.print("2. sayıyı giriniz:" );
        n2 = inp.nextInt();
        System.out.print("3. sayıyı giriniz:" );
        n3 = inp.nextInt();



        if(n1 < n2 && n1 < n3){
            if(n2 < n3){
                System.out.println(  n1 + "<" + n2 + "<"+ n3);
            }else{
                System.out.println(n1 + "<" + n3 + " <" + n2);
            }

        }
        else if(n2 < n1 && n2 < n3){
            if(n1 < n3){
                System.out.println(  n2 + "<" + n1 + "<"+ n3);
            }
            else{
                System.out.println(n2 + "<"  + n3 + "<" +n1);
            }

        }
        else {
            if(n2 < n1){
                System.out.println( n3 + "<" + n2 + "<"+ n1);
            }
            else{
                System.out.println(n3 + "<" + n1 + "<" + n2);
            }

        }




    }
}