// Nama : Faudiah Anwar
// Stambuk : 13020210145
public class TestErr20145 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int tot = 0;
        int j = 0;
        for (int i = 0; i < 10; i++) {
            tot += i;
            if (i < j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        }
        do {
            j++;
        } while (j < 10); // tambahkan titik koma pada akhir statement do-while
        while (j < 10) { // hapus titik koma pada akhir while loop
            j++;
        }
    }
}
