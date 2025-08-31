public class Kios {
    private String nama;
    private Menu[] menu;

    public Kios(String nama, Menu[] menu) {
        this.nama = nama;
        this.menu = menu;
    }

    public String getNama() {
        return nama;
    }

    public Menu[] getMenu() {
        return menu;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMenu(Menu[] menu) {
        this.menu = menu;
    }
}