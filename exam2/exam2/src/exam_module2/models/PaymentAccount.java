package exam_module2.models;

public class PaymentAccount extends Bank{
    private int numberAccount;
    private int moneyInAccount;

    public PaymentAccount() {

    }

    public PaymentAccount(int idAccount,
                          String codeAccount,
                          String nameAccount,
                          String startDay,
                          int numberAccount,
                          int moneyInAccount) {
        super(idAccount, codeAccount, nameAccount, startDay);
        this.numberAccount = numberAccount;
        this.moneyInAccount = moneyInAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getMoneyInAccount() {
        return moneyInAccount;
    }

    public void setMoneyInAccount(int moneyInAccount) {
        this.moneyInAccount = moneyInAccount;
    }

    @Override
    public int getIdAccount() {
        return super.getIdAccount();
    }

    @Override
    public void setIdAccount(int idAccount) {
        super.setIdAccount(idAccount);
    }

    @Override
    public String getCodeAccount() {
        return super.getCodeAccount();
    }

    @Override
    public void setCodeAccount(String codeAccount) {
        super.setCodeAccount(codeAccount);
    }

    @Override
    public String getNameAccount() {
        return super.getNameAccount();
    }

    @Override
    public void setNameAccount(String nameAccount) {
        super.setNameAccount(nameAccount);
    }

    @Override
    public String getStartDay() {
        return super.getStartDay();
    }

    @Override
    public void setStartDay(String startDay) {
        super.setStartDay(startDay);
    }

    @Override
    public String toString() {
        return "TK thanh toán{" +
                super.toString()+
                " [Số thẻ]='" + numberAccount + '\'' +
                ", [Tiền trong tài khoản]=" + moneyInAccount +
                '}';
    }

    public String toFile(){
        return super.toFile()+","+
                numberAccount+","+
                moneyInAccount;
    }
}
