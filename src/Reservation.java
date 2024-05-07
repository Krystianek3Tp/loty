public class Reservation {
    private Flight NazwaLotu;
    private String ImiePasazera;
    private String NazwiskoPasazera;
    private double CenaBiletu;

    public Reservation(Flight nazwaLotu, String imiePasazera, String nazwiskoPasazera, double cenaBiletu) {
        NazwaLotu = nazwaLotu;
        ImiePasazera = imiePasazera;
        NazwiskoPasazera = nazwiskoPasazera;
        CenaBiletu = cenaBiletu;
        nazwaLotu.setLiczbaDostepnychMiejsc(nazwaLotu.getLiczbaDostepnychMiejsc()-1);
    }


}
