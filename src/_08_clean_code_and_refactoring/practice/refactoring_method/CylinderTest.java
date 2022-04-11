package _08_clean_code_and_refactoring.practice.refactoring_method;

public class CylinderTest {

    public static void testGetVolume0And0() {
        int radius = 0;
        int height = 0;
        double expected = 0;

        System.out.println(Cylinder.getVolume(radius, height));
    }

    public static void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        System.out.println(Cylinder.getVolume(radius, height));
    }

    public static void main(String[] args) {
        testGetVolume0And0();
        testGetVolume1And2();
    }
}
