package quanlykho;

public class Model {
    private String idSanPham;
    private String tenSanPham;
    private String tinhTrang;
    private int sl;
    public Model(){

    }

    public Model(String idSanPham, String tenSanPham, String tinhTrang, int sl) {
        this.idSanPham = idSanPham;
        this.tenSanPham = tenSanPham;
        this.tinhTrang = tinhTrang;
        this.sl = sl;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    @Override
    public String toString() {
        return "Model{" +
                "idSanPham='" + idSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", tinhTrang='" + tinhTrang + '\'' +
                ", sl=" + sl +
                '}';
    }
}
