package exam_module2.models;

public abstract class Bank {
    private int idAccount;
    private String codeAccount;
    private String NameAccount;
    private String StartDay;

    public Bank() {
    }

    public Bank(int idAccount, String codeAccount, String nameAccount, String startDay) {
        this.idAccount = idAccount;
        this.codeAccount = codeAccount;
        NameAccount = nameAccount;
        StartDay = startDay;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getCodeAccount() {
        return codeAccount;
    }

    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    public String getNameAccount() {
        return NameAccount;
    }

    public void setNameAccount(String nameAccount) {
        NameAccount = nameAccount;
    }

    public String getStartDay() {
        return StartDay;
    }

    public void setStartDay(String startDay) {
        StartDay = startDay;
    }

    @Override
    public String toString() {
        return "[ID tài khoản]='" + idAccount + '\'' +
                ", [Mã tài khoản]='" + codeAccount + '\'' +
                ", [Tên chủ tài khoản]='" + NameAccount + '\'' +
                ", [Ngày tạo tài khoản]='" + StartDay + '\'';
    }

    public String toFile(){
        return idAccount+","+
                codeAccount+","+
                NameAccount+","+
                StartDay;
    }

}
