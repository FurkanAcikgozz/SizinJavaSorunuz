
package sizinjavasorunuz;

import java.util.Scanner;

public class SizinJavaSorunuz {

    public static String substringyapma(String deger,int x,int y){
        String sonuc="";
        if (y==-1) {
            y=deger.length();
        }
        int i=x;
        while (i<y) {            
            sonuc=sonuc+deger.charAt(i);
            i++;
        }
        System.out.println(sonuc);
        return sonuc;
    }
     public static int faktoriyel2(int x)
    {
        int sonuc=1;
        for (int i = 1; i <= x; i++) {
            sonuc=sonuc*i;
            
        }
        System.out.println(sonuc);
        return sonuc;
    }
    public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
        System.out.println("metin gir");
    String m=klavye.nextLine();
        System.out.println("alt deger gir");
    int x=klavye.nextInt();
        System.out.println("üst deger gir");
    int y=klavye.nextInt();
    
       substringyapma(m, x, y);
    }
    
}
