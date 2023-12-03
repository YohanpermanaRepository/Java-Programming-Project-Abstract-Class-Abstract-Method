package ptkmodulv;
import java.util.Scanner;
    final public class Operasibilanganabscetak {
    private static void cetakSemua(Operasibilanganabs[] OB, double a, double b){
        OB[0] = new Operasipenjumlahan();
            OB[1] = new Operasipengurangan();
                OB[2] = new Operasiperkalian();
                    OB[3] = new Operasipembagian();
                    
        for (int i = 0; i < OB.length; i++){
            OB[i].setA(a);
                OB[i].setB(b);
                    OB[i].setC();
                        OB[i].tampil();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
        System.out.println("Program operasi bilangan (+,-,x,:)");
            System.out.print("Input angka pertama (a) : ");
                double a = input.nextDouble();
                    System.out.print("Input angka kedua (b) : ");
                        double b = input.nextDouble();
                        Operasibilanganabs[] arr1 = new Operasibilanganabs[4];
                        cetakSemua(arr1, a, b);
    }
}

