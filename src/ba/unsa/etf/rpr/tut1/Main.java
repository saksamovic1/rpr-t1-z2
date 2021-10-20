package ba.unsa.etf.rpr.tut1;

import java.util.Scanner;

public class Main {
    static Boolean sumaCifara (int broj) {
        int suma = 0;
        int pom = broj;
        while (pom !=0 ) {
            suma = suma + pom%10;
            pom = pom/10;
        }
        if (broj % suma != 0) return false;
        else {
            return true;
        }
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println("Unesite cijeli broj n:");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for (int i = 0; i < n; i++) {
            int broj = ulaz.nextInt();
            if (sumaCifara(broj)) System.out.println("Broj " + broj + " je djeljiv sa sumom svojih cifara");
        }
    }
}
