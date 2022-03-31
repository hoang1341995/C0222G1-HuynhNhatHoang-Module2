package _02_loop_in_java.exercise.HienThiCacLoaiHinh;

public class TamGiacVuongNguoc {
    public static void main(String[] args) {
        char chr = '*';
        int x = 5;
        int y = x;
        for (int i = 0; i < x; i++) {
            String str1 = "";
            for (int j = 0; j < y; j++) {
                str1 += chr;
            }
            System.out.println(str1);
            y--;
        }
    }
}
