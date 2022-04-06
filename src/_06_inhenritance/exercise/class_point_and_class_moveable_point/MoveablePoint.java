package _06_inhenritance.exercise.class_point_and_class_moveable_point;

public class MoveablePoint extends Point {
    private float xSpeed, ySpeed;

    public MoveablePoint() {
        this(0.0f,0.0f,0.0f,0.0f);
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public float[] getSpeed(){
        float[] array = {getxSpeed(),getySpeed()};
        return array;
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

    public MoveablePoint move(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                " x=" + getX() +
                " y=" + getY() +
                " xSpeed=" + getxSpeed() +
                ", ySpeed=" + getySpeed() +
                '}';
    }

}
