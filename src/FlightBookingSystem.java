import java.util.ArrayList;

public class FlightBookingSystem implements FlightReservationSystem{
    ArrayList<Flight> dostepneLoty;
    private ArrayList<Reservation> rezerwacje;
    public FlightBookingSystem() {
        dostepneLoty = new ArrayList<>(); 
        rezerwacje = new ArrayList<>(); 
    }
   
    @Override
    public void rezerwujLot(Flight nazwaLotu, String imiePasazera, String nazwiskoPasazera, double cenaBiletu) {
        Reservation rezerwacja = new Reservation(nazwaLotu, imiePasazera, nazwiskoPasazera, cenaBiletu);
        rezerwacje.add(rezerwacja);
    }
    @Override
    public void anulujRezerwacje(Reservation rezerwacja) {
        rezerwacje.remove(rezerwacja);
    }

    @Override
    public ArrayList<Flight> wyszukajLot(String miejsceDocelowe, String dataWylotu) {
        ArrayList<Flight> wynik = new ArrayList<>();
        for (Flight lot : dostepneLoty) {
            if (lot.getMiejsceDocelowe().equals(miejsceDocelowe) && lot.getDataWylotu().equals(dataWylotu)) {
                wynik.add(lot);
            }
        }
        return wynik;
    }

    @Override
    public void dostepneLoty() {
        for(Flight lot : dostepneLoty){
            System.out.println("Dostępny lot do " + lot.getMiejsceDocelowe()
                    + " w dniu " + lot.getDataWylotu()
                    + " liczba wolnych miejsc: " + lot.getLiczbaDostepnychMiejsc());
        }
    }
}
