import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FlightBookingSystem rezerwacja = new FlightBookingSystem();
        Flight lotBerlin = new Flight("Berlin", "Wrocław","06.07.2024" , "4h", 12);
        Flight lotRzym = new Flight("Rzym", "Kraków","11.04.2024" , "2h", 3);

        rezerwacja.dostepneLoty.add(lotBerlin);
        rezerwacja.dostepneLoty.add(lotRzym);

        rezerwacja.rezerwujLot(lotBerlin, "Jan", "Jankowski", 450);
        rezerwacja.rezerwujLot(lotRzym, "Lucyna", "Mlecz", 120);

        rezerwacja.dostepneLoty();

        Reservation rezerwacja1 = new Reservation(lotBerlin, "Tadeusz", "Sznuk", 2);
        rezerwacja.anulujRezerwacje(rezerwacja1);

        rezerwacja.dostepneLoty();

        ArrayList<Flight> znalezioneLoty = rezerwacja.wyszukajLot("Berlin", "06.07.2024");
        for(Flight lot : znalezioneLoty){
            System.out.println("Lot znaleziony. Miejsce docelowe: " + lot.getMiejsceDocelowe()
                    + " z " + lot.getMiejsceWylotu()
                    + " w dniu: " + lot.getDataWylotu());
        }


    }

}