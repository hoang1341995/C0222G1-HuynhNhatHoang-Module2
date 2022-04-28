package case_study_module2.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] array = {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(solution(array)));


    }
    static int[] solution(int[] a) {
        int[] b = a.clone();
        Arrays.sort(a);
        List<Integer> l = new ArrayList<>();
        for(int n: a){
            if(n != -1)l.add(n);
        }
        for(int i = 0, j=0; i<b.length; i++){
            if(b[i] != -1){
                b[i] = l.get(j);
                j++;
            }
        }return b;
    }


}
