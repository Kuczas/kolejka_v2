public class Element {
    private int wartosc;
    private Element następny;

    public Element(int wartosc){
        this.wartosc = wartosc;
        następny = null;
    }

    public int getWartosc() {
        return wartosc;

    }

    public void setNastępny(Element następny) {
        this.następny = następny;

    }

    public Element getNastępny() {
        return następny;
    }
}
