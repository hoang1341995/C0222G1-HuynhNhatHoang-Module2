package _02_loop_in_java.exercise.HienThiCacLoaiHinh;

public class HinhChuNhat {
    public static void main(String[] args) {
        char chr = '*';
        int x = 3;
        int y = 7;
        for (int i = 0; i < x; i++) {
            String str1 = "";
            for (int j = 0; j < y; j++) {
                str1 += chr;
            }
            System.out.println(str1);
        }
    }
}
