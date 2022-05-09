package test_mobile.models;

public class XachTay extends Phone {
    private String quocGiaXachTay;
    private String trangThai;

    public XachTay() {
    }

    public XachTay(String id, String tenDienThoai, int giaBan, int soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getTenDienThoai() {
        return super.getTenDienThoai();
    }

    @Override
    public void setTenDienThoai(String tenDienThoai) {
        super.setTenDienThoai(tenDienThoai);
    }

    @Override
    public int getGiaBan() {
        return super.getGiaBan();
    }

    @Override
    public void setGiaBan(int giaBan) {
        super.setGiaBan(giaBan);
    }

    @Override
    public int getSoLuong() {
        return super.getSoLuong();
    }

    @Override
    public void setSoLuong(int soLuong) {
        super.setSoLuong(soLuong);
    }

    @Override
    public String getNhaSanXuat() {
        return super.getNhaSanXuat();
    }

    @Override
    public void setNhaSanXuat(String nhaSanXuat) {
        super.setNhaSanXuat(nhaSanXuat);
    }

    @Override
    public String toString() {
        return "XachTay{" +
                super.toString()+
                "quocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
    public String toFile(){
        return super.toFile()+","+
                quocGiaXachTay+","+
                trangThai;
    }
}
