// Nama : Faudiah Anwar
// Stambuk 13020210145

public class No30145 {
    public static void main(String[] args) {

        Balok balok1 = new Balok();
        Balok balok2 = new Balok(22, 34, 17);
        Balok balok3 = new Balok();
        balok3.setL(5);
        Balok balok4 = new Balok();
        balok4.setP(25);
        Balok balok5 = new Balok(22, 34, 17);
        balok5.setT(10);
        Balok balok6 = new Balok();
        balok6.info();
        Balok balok7 = new Balok(22, 34, 17);
        balok7.info();

        Kubus kubus1 = new Kubus();
        Kubus kubus2 = new Kubus(10);
        Kubus kubus3 = new Kubus();
        kubus3.setSisi(5);
        Kubus kubus4 = new Kubus(17);
        kubus4.info();
        Kubus kubus5 = new Kubus();
        kubus5.setSisi(22);
        kubus5.info();
    }
}

// Balok
class Balok extends PersegiPanjang {
    int t;

    public Balok() {
        super();
        this.t = 12;
    }

    public Balok(int p, int l, int t) {
        super(p, l);
        this.t = t;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int volume() {
        return this.getP() * this.getL() * this.getT();
    }

    public void info() {
        System.out.println("Balok");
        System.out.println("Panjang: " + this.getP());
        System.out.println("Lebar: " + this.getL());
        System.out.println("Tinggi: " + this.getT());
        System.out.println("Luas: " + this.luas());
        System.out.println("Volume: " + this.volume());
        System.out.println();
    }
}

// Kubus
class Kubus extends PersegiPanjang {
    int sisi;

    public Kubus() {
        super();
        this.sisi = 10;
    }

    public Kubus(int sisi) {
        super(sisi, sisi);
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
        this.setP(sisi);
        this.setL(sisi);
    }

    public int volume() {
        return this.getSisi() * this.getSisi() * this.getSisi();
    }

    public void info() {
        System.out.println("Kubus");
        System.out.println("Sisi : " + this.getSisi());
        System.out.println("Luas : " + this.luas());
        System.out.println("Volume : " + this.volume());
        System.out.println();
    }
}

class PersegiPanjang {
    int p, l;

    public PersegiPanjang() {
        this.p = 34;
        this.l = 22;
    }

    public PersegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int luas() {
        return p * l;
    }

    public int keliling() {
        return 2 * (p + l);
    }
}
