import java.util.Scanner;
public class osoba {
    double wiek;
    String miasto;
    String dzien;
    int discount = 0;

    public osoba(int wiek, String miasto, String dzien) {
        this.wiek = wiek;
        this.miasto = miasto;
        this.dzien = dzien;

    }
    public int znizki() {
        int discount = 0;
        this.wiek = wiek;
        this.miasto = miasto;
        this.dzien = dzien;
        if (miasto.equals("Warszawa")) {
            discount += 10;
        }
        if (wiek <= 10) {
            discount = 100;
        } else if (wiek <= 18) {
            discount += 50;
        }

        if (dzien.equals("Thursday")) {
            discount = 100;
        }
        return discount;
    }
    public double cena(){
        this.discount= discount;
        return  40-(40)*(0.01*discount); }
    public void printData() {
        System.out.println("Data: " + this.miasto + ", " + this.wiek + " years old, " + this.dzien + " Ticket price: " + cena() + " PLN");
        System.out.println("Discount: " + znizki() + "%");
    }
}

