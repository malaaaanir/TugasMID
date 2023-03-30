// Nirmala 13020210242
public class Test0242 {
    public static void main(String args[]) {
        Balok b1 = new Balok();
        Balok b2 = new Balok(5, 10, 15);
        b1.info();
        b2.info();
    }
}
//class Balok
    class Balok extends PersegiPanjang{
        int t;
        public Balok() {
        super(30, 20);
        this.t = 15;    
        //(h) berisi nilai panjang & lebar 
        //yang diperoleh dari konstruktor 
        //superclass persegi panjang serta tinggi=15
        }
        public Balok(int p, int l, int t) {
        //(i) berisi nilai pada saat runtime p p, l=l dari konstruktor superclass persegi panjang t t;
        super(p, l);
        this.t = t;
        }
        //(j) buat getter setter class balok
        public int volume(){
            //(k) fungsi untuk menghitung volume balok : p x l x t
            return super.luas() * t;
        }
        public void info(){
        //(l)fungsi untuk tampil nilai panjang, lebar, tinggi,Luas, dan volume balok
            System.out.println("Tinggi = " + t);
            System.out.println("Luas = " + super.luas());
            System.out.println("Volume = " + volume());
        }
    }
    // class Persegi Panjang
    class PersegiPanjang{
        int p, l;
        public PersegiPanjang() {
            //(m) berisi nilai panjang=30 & lebar=20
            this.p = 30;
            this.l = 20;
        }
        public PersegiPanjang(int p, int l) {
            //(n) berisi nilai pada saat runtime p p, l=l
            this.p = p;
            this.l = l;
        }
            //(o) buat getter setter class Persegi Panjang
        public int luas(){
            //(q) fungsi untuk menghitung luas persegi panjang : p x l
            return p * l;
        }
        public int keliling(){
            //(r) fungsi untuk menghitung keliling persegi panjang : 2x (p+l)
             return 2 * (p + l);
        }
}   
