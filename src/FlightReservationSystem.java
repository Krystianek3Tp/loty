import java.util.ArrayList;
import java.util.List;


public interface FlightReservationSystem {
    void rezerwujLot(Flight nazwaLotu, String imiePasazera, String nazwiskoPasazera, double cenaBiletu);
    void anulujRezerwacje(Reservation rezerwacja);
    ArrayList<Flight> wyszukajLot(String miejsceDocelowe, String dataWylotu);
    void dostepneLoty();
}
