package exercise_plus.teacher_student;

public class Teacher extends Person {
    private int salary;

    public Teacher() {

    }

    public Teacher(String name, int age, boolean gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
        return "Teacher{" +
                super.toString() +
                " salary=" + salary +
                '}';
    }
}
