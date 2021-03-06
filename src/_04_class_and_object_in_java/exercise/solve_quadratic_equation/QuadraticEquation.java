package _04_class_and_object_in_java.exercise.solve_quadratic_equation;

 class  QuadraticEquation {
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