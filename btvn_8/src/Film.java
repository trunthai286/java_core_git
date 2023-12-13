public class Film {
    private int id;
    private String tieuDe;
    private String theLoai;
    private String daoDien;
    private String ngayCongChieu;

    public Film(int id, String tieuDe, String theLoai, String daoDien, String ngayCongChieu) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.theLoai = theLoai;
        this.daoDien = daoDien;
        this.ngayCongChieu = ngayCongChieu;
    }

    public int getId() {
        return id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public String getNgayCongChieu() {
        return ngayCongChieu;

    }

    @Override
    public String toString() {
        return "Film: (" +
                "id: " + id +
                ", tieuDe: " + tieuDe +
                ", theLoai: " + theLoai +
                ", daoDien: " + daoDien +
                ", ngayCongChieu: " + ngayCongChieu +
                ")";
    }

}
