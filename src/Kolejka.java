public class Kolejka {

    private Element pierwszy;
    private Element ostatni;

    public Kolejka() {
        pierwszy = null;
        ostatni = null;

    }

    public Kolejka(Element jakisElement){
        pierwszy = jakisElement;
    }

    public void add(int wartosc){
        //Tu dodamy kod który doda nowy element na koniec koleki
        Element nowyElement = new Element(wartosc);
        if (isEmpty()){
            pierwszy = ostatni = nowyElement;
        } else {
            ostatni.setNastępny(nowyElement);
            ostatni = nowyElement;
        }
    }
    public void show(){
        Element indexElement = pierwszy;
        while (indexElement != null){
            System.out.print(indexElement.getWartosc()+" ");
            indexElement = indexElement.getNastępny();

        }
        System.out.println();
    }

    public boolean isEmpty(){
        if (ostatni == null) return true;
        else return false;
    }
    }
