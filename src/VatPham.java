public class VatPham {
    protected String tenvatpham;
    protected int chisosucmanh;
    protected double hesosucmanh;

    public String getTenvatpham() {
        return tenvatpham;
    }

    public void setTenvatpham(String tenvatpham) {
        this.tenvatpham = tenvatpham;
    }

    protected int sovangquydoi;

    public VatPham() {
    }

    public int getChisosucmanh() {
        return chisosucmanh;
    }

    public void setChisosucmanh(int chisosucmanh) {
        this.chisosucmanh = chisosucmanh;
    }

    public double getHesosucmanh() {
        return hesosucmanh;
    }

    public void setHesosucmanh(float hesosucmanh) {
        this.hesosucmanh = hesosucmanh;
    }

    public int getSovangquydoi() {
        return sovangquydoi;
    }

    public void setSovangquydoi(int sovangquydoi) {
        this.sovangquydoi = sovangquydoi;
    }
    public double tinhSucCongPha(){
        return this.chisosucmanh*this.hesosucmanh;
    }
    public double tinhSoVangQuyDoi(){
        return this.tinhSucCongPha()*this.sovangquydoi;
    }
    public void xuat(){
        System.out.println("Tên vật phẩm: "+this.tenvatpham);
        System.out.println("Sức công phá: "+ this.tinhSucCongPha());
        System.out.println("Số vàng để mua vật phẩm: "+this.tinhSoVangQuyDoi());
    }
}
