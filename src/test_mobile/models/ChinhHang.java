package test_mobile.models;

public class ChinhHang extends Phone{
    private String thoiGianBH;
    private String phamViBH;

    public ChinhHang() {

    }

    public ChinhHang(String id,
                     String tenDienThoai,
                     int giaBan,
                     int soLuong,
                     String nhaSanXuat,
                     String thoiGianBH,
                     String phamViBH) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBH = thoiGianBH;
        this.phamViBH = phamViBH;
    }

    public String getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(String thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }

    public String getPhamViBH() {
        return phamViBH;
    }

    public void setPhamViBH(String phamViBH) {
        this.phamViBH = phamViBH;
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
        return "ChinhHang{" +
                super.toString() +
                "thoiGianBH='" + thoiGianBH + '\'' +
                ", phamViBH='" + phamViBH + '\'' +
                '}';
    }
    public String toFile(){
        return super.toFile()+","+
                thoiGianBH+","+
                phamViBH;
    }
}
