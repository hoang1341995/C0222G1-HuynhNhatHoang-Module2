package _06_inhenritance.exercise.ClassPoint2dAndClassPoint3d;

public class Point3d extends Point2d {
    private float z;

    public Point3d() {
        this(0.0f, 0.0f, 0.0f);
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public float getX() {
        return super.getX();
    }

    @Override
    public void setX(float x) {
        super.setX(x);
    }

    @Override
    public float getY() {
        return super.getY();
    }

    @Override
    public void setY(float y) {
        super.setY(y);
    }
    public float[] getXYZ(){
        float[] array = {getX(),getY(),getZ()};
        return array;

    }
    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
              setZ(z);
    }

    @Override
    public String toString() {
        return "Point3d{" +
                " x=" + getX() +
                " y=" + getY() +
                " z=" + getZ() +
                '}';
    }
}
