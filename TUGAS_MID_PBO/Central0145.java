// Nama : Faudiah Anwar
// Stambuk : 13020210145

interface A {
    public void ade();
}

interface B extends A {

}

class Central0145 implements B {
    public void ade() {
        System.out.println("ade");
    }

    public static void main(String arg[]) {
        System.out.println("main");
        Central0145 obj = new Central0145();
        obj.ade();
    }
}
