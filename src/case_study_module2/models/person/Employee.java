package case_study_module2.models.person;

public class Employee extends Person {
    private String level;
    private String position;
    private int salary;

    public Employee() {

    }

    public Employee(int id,
                    String name,
                    String birthDay,
                    String gender,
                    String idCard,
                    String phoneNumber,
                    String email,
                    String level,
                    String position,
                    int salary) {
        super(id, name, birthDay,gender, idCard, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getBirthDay() {
        return super.getBirthDay();
    }

    @Override
    public void setBirthDay(String birthDay) {
        super.setBirthDay(birthDay);
    }

    @Override
    public String getIdCard() {
        return super.getIdCard();
    }

    @Override
    public void setIdCard(String idCard) {
        super.setIdCard(idCard);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
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
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                " level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
    public String toFile() {
        return super.toFile()+
                ","+getLevel()+
                ","+getPosition()+
                ","+getSalary();
    }
}
