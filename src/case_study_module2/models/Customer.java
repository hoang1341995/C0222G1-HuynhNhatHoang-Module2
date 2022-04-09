package case_study_module2.models;

public class Customer extends Person {
    private String typeCustumer;
    private String address;

    public Customer() {
    }

    public Customer(int id, String age, int idCard, int phoneNumber, String name, String email, String gender, String typeCustumer, String address) {
        super(id, age, idCard, phoneNumber, name, email, gender);
        this.typeCustumer = typeCustumer;
        this.address = address;
    }

    public String getTypeCustumer() {
        return typeCustumer;
    }

    public void setTypeCustumer(String typeCustumer) {
        this.typeCustumer = typeCustumer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    public String getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(String age) {
        super.setAge(age);
    }

    @Override
    public int getIdCard() {
        return super.getIdCard();
    }

    @Override
    public void setIdCard(int idCard) {
        super.setIdCard(idCard);
    }

    @Override
    public int getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(int phoneNumber) {
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
}
