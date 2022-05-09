package test_mobile.services.implement;

import test_mobile.models.ChinhHang;
import test_mobile.models.XachTay;
import test_mobile.services.PhoneService;
import test_mobile.utils.ReadAndWrite;

import static test_mobile.controllers.DisplayMainMenu.scanner;


public class PhoneImpl implements PhoneService {
    @Override
    public void display() {

    }

    @Override
    public void addNew(int number) {
        System.out.println("Nhập ID");
        String id = scanner.nextLine();
        System.out.println("Nhập tên điện thoại");
        String tenDienThoai = scanner.nextLine();
        System.out.println("Nhập giá");
        int giaBan = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất");
        String nhaSanXuat = scanner.nextLine();
        if (number == 1){
            System.out.println("Nhập thời gian bảo hành");
            String gioiGianBH = scanner.nextLine();
            System.out.println("Nhập phạm vi bảo hành");
            String phamViBH = scanner.nextLine();
            ChinhHang chinhHang = new ChinhHang(id,
                    tenDienThoai,
                    giaBan,
                    soLuong,
                    nhaSanXuat,
                    gioiGianBH,
                    phamViBH);
            ReadAndWrite.write(chinhHang.toFile());
            System.out.println("Thêm mới thành công");
        }else{
            System.out.println("Nhập quốc gia xách tay");
            String quocGiaXachTay = scanner.nextLine();
            System.out.println("Nhập trạng thái");
            String trangThai = scanner.nextLine();
            XachTay xachTay = new XachTay(id,
                    tenDienThoai,
                    giaBan,
                    soLuong,
                    nhaSanXuat,
                    quocGiaXachTay,
                    trangThai);
            ReadAndWrite.write(xachTay.toFile());
            System.out.println("Thêm mới thành công");

        }
        
    }

    @Override
    public void search() {

    }

    @Override
    public void delete() {

    }


    /*
        public static List<Subject> getSubjectList(){
        List<Subject> subjects = new ArrayList<>();
        List<String[]> list = ReadAndWrite.read(SUBJECT_PATH);
        for (String[] lists : list){
            subjects.add(new Subject(lists[0],
                    lists[1],
                    Double.parseDouble(lists[2]),
                    lists[3],Integer.parseInt(lists[4])));
        }
        return subjects;
    }
     */



}
