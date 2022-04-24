package case_study_module2.models.person;

public class Customer extends Person {
    private String typeCustumer;
    private String address;

    public Customer() {
    }

    public Customer(int id,
                    String name,
                    String age,
                    String gender,
                    String idCard,
                    String phoneNumber,
                    String email,
                    String typeCustumer,
                    String address) {
        super(id, name, age, gender, idCard, phoneNumber, email);
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
        return "Customer{" +
                super.toString() +
                " typeCustumer='" + typeCustumer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String toFile() {
        return super.toFile()+
                ","+getTypeCustumer()+
                ","+getAddress();
    }
}
