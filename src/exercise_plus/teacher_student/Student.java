package exercise_plus.teacher_student;

public class Student extends Person{
    private int point;

    public Student() {
    }

    public Student( String name, int age, boolean gender, int point) {
        super( name, age, gender);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public boolean isGender() {
        return super.isGender();
    }

    @Override
    public void setGender(boolean gender) {
        super.setGender(gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                " point=" + point +
                '}';
    }
}
