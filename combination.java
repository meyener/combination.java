
import java.util.Scanner;
public class combination {
    public combination() {
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Float val1=1f,val2=1.f,first,sec,c;
        Float a,b;
        System.out.print("lütfen birinci degeri gir : ");
        first=scn.nextFloat();
        System.out.print("lütfen ikinci degeri gir : ");
        sec=scn.nextFloat();

        for (int i = 1; i <=first; i++) {
            val1=val1*i;
        }
        for (int z = 1; z <=sec; z++) {
            val2=val2*z;
        }
        while(first==sec){
            System.out.println("değerler birbirine eşit olamazlar");
            break;
        }
        a=first-sec;
        b=(val2*a);
        c=val1/b;
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



        
        
    }
    
}
