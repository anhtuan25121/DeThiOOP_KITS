
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class DanhSachVatPham {
    private static final int FLAG_CHIECBUATHAN = 1;
    private static final int FLAG_BAOTYASAMSET = 2;
    private static final int FLAG_HONDAKICHNO = 3;
    private static final int FLAG_CAYRIUPHEPTHUAT = 4;
    private static final int FLAG_CAYGYACHIENTHANH = 5;
    private List<VatPham> arr;

    public DanhSachVatPham() {
        this.arr=new ArrayList<>();
    }

    //Cau 1
    public void nhap(){
        VatPham arr1 = new ChiecBuaThan();
        this.arr.add(arr1);
        VatPham arr2 = new BaoTaySamSet();
        this.arr.add(arr2);
        VatPham arr3 = new HonDaKichNo();
        this.arr.add(arr3);
        VatPham arr4 = new CayRiuPhepThuat();
        this.arr.add(arr4);
        VatPham arr5 = new CayGayChienThan();
        this.arr.add(arr5);

    }

    //Cau 2
    public void xuat(){
        System.out.println("-------- Danh sách thông tin các vật phẩm mà Spon cần thu hoạch --------\n");
        for(VatPham x: this.arr){

            x.xuat();
            System.out.println("---------------------------------");
        }
    }

    //cau 3
    public void cau3(){
        double max = 0;
        for(VatPham x : this.arr){
            if(x.tinhSoVangQuyDoi() > max){
                max = x.tinhSoVangQuyDoi();
            }
        }

        System.out.println("\n-------- Thông tin vật phẩm tốn nhiều xu vàng nhất --------\n");
        for(VatPham x: this.arr){
            if(x.tinhSoVangQuyDoi() == max){

                x.xuat();
                System.out.println("---------------------------------");

            }
        }
    }

    //Cau 4
    public void cau4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nHãy nhập vào số vàng mà Spon thu thập được: ");
        double sovang = scanner.nextInt();

        double tongsovanggiaicuu = 0;
        for (VatPham x : this.arr){
            tongsovanggiaicuu += x.tinhSoVangQuyDoi();
        }

        if(sovang >= tongsovanggiaicuu){
            System.out.println("Spon giải cứu thành công đồng đội! ^^ yeah yeah");
        }else{
            System.out.println("Số xu vàng cần để giải cứu là: "+tongsovanggiaicuu);
            System.out.println("Thật đáng tiếc! Spon không đủ số xu vàng để giải cứu thành công đồng đội. == huhu");
        }
        System.out.println("---------------------------------------------------");
    }
}