package ptkmodulv;

public class Operasipembagian extends Operasibilanganabs{
    
    @Override
    protected void setA(double a){
        this.a = a;
        }
    @Override
        protected void setB(double b){
            this.b =b;
            }
    @Override
            protected void setC(){
                this.c = a/b;
                }
    @Override
                protected double getA(){
                    return a;
                    }
    @Override
                    protected double getB(){
                        return b;
                        }
    @Override
                        protected double getC(){
                            return c;
                        }
    @Override
    protected void tampil(){
        System.out.println("Output proses pembagian");
        System.out.println(getA()+" : "+getB()+" = "+getC());
    }
}
