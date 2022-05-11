package exam_module2.models;

public class SaverAccount extends Bank {
    private int moneySaver;
    private String saverDay;
    private int interest;
    private int timeLimit;

    public SaverAccount() {

    }

    public SaverAccount(int idAccount, String codeAccount, String nameAccount, String startDay, int moneySaver, String saverDay, int interest, int timeLimit) {
        super(idAccount, codeAccount, nameAccount, startDay);
        this.moneySaver = moneySaver;
        this.saverDay = saverDay;
        this.interest = interest;
        this.timeLimit = timeLimit;
    }

    public int getMoneySaver() {
        return moneySaver;
    }

    public void setMoneySaver(int moneySaver) {
        this.moneySaver = moneySaver;
    }

    public String getSaverDay() {
        return saverDay;
    }

    public void setSaverDay(String saverDay) {
        this.saverDay = saverDay;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
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
        return "TK tiết kiệm{" +
                super.toString()+
                " [Số tiền gửi tiết kiệm]=" + moneySaver +
                ", [Ngày gửi tiết kiệm]='" + saverDay + '\'' +
                ", [Lãi suất]=" + interest +
                ", [Kì hạn]='" + timeLimit + '\'' +
                '}';
    }


    public String toFile(){
        return super.toFile()+","+
                moneySaver +","+
                saverDay+","+
                interest+","+
                timeLimit;
    }
}
