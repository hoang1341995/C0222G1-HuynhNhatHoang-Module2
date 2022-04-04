package _04_class_and_object_in_java.exercise;


import java.util.Scanner;

public class SolveQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "r1 = " + quadraticEquation.getRoot1() + " và r2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép: "
                    + "r1 = r2 = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

    static class  QuadraticEquation {
        private double a, b, c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        public double getRoot1() {
            float r1 = (float) ((-b + Math.sqrt(getDiscriminant())) / (2 * a));
            return r1;
        }

        public double getRoot2() {
            float r2 = (float) ((-b - Math.sqrt(getDiscriminant())) / (2 * a));
            return r2;
        }



    }

}
