package com.mycompany.feb_23_ora;

public class Feb_23_ora {
public static void main(String[] args) {
    int osszeg = elso10szamOszege();
    String kimenet = "Az első 10 szám összege:" + osszeg + "\n";
    kiir(kimenet);
    int szam1 = 7, szam2 = 4;
    kiir("%d + %d = %d".formatted(szam1,szam2, a+b));
}

    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }

    private static int elso10szamOszege() {
        int osszeg = 0;
        for ( int i= 0; i<10; i++){
            osszeg +=1;
        }
        return osszeg;
    }       
    
    private static int osszead(int a, int b){
        return a+b;
    }
    
