public class Main {
    public static void main(String[] args) {

        Kolejka kolejka = new Kolejka();

        if (kolejka.isEmpty()) System.out.println("Kolejka jest pusta");

        kolejka.add(7);
        kolejka.add(5);
        kolejka.add(3);

        kolejka.show();
        System.out.println("Pierwszy element w kolejce to: " + kolejka.pop());
        System.out.println("Zdejmujemy element pierwszy");
        kolejka.push();
        kolejka.show();



    }
}
