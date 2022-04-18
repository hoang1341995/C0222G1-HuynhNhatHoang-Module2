package case_study_module2.models;

public abstract class Person {
    private int id;
    private int age;
    private int idCard;
    private String phoneNumber;
    private String name;
    private String email;
    private boolean gender;

    public Person() {
    }

    public Person(int id, int age, int idCard, String phoneNumber, String name, String email, boolean gender) {
        this.id = id;
        this.age = age;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", age='" + age + '\'' +
                ", idCard=" + idCard +
                ", phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'';
    }
}
