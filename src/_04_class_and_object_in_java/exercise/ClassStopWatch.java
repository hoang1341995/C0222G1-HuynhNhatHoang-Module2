package _04_class_and_object_in_java.exercise;

import java.util.Date;
import java.util.Scanner;

public class ClassStopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch watch = new StopWatch();
        while (true){
            System.out.println("1. Start\n2. Stop\n0. Exit");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("Start time: "+watch.Start());
                    break;
                case 2:
                    System.out.println("End time: "+watch.Stop());
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Enter again");
            }
        }
    }

    static class StopWatch {
        private long startTime, endTime;
        public long Start(){
            return this.startTime = System.currentTimeMillis();
        }
        public long Stop(){
            return this.endTime = System.currentTimeMillis();
        }
    }
}
