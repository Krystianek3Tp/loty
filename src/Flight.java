import java.util.Date;

public class Flight {
    private String MiejsceDocelowe;
    private String MiejsceWylotu;
    private String DataWylotu;
    private String CzasTrwaniaLotu;
    private int LiczbaDostepnychMiejsc;

    public Flight(String miejsceDocelowe, String miejsceWylotu, String dataWylotu, String czasTrwaniaLotu, int liczbaDostepnychMiejsc) {
        MiejsceDocelowe = miejsceDocelowe;
        MiejsceWylotu = miejsceWylotu;
        DataWylotu = dataWylotu;
        CzasTrwaniaLotu = czasTrwaniaLotu;
        LiczbaDostepnychMiejsc = liczbaDostepnychMiejsc;
    }

    public String getMiejsceDocelowe() {
        return MiejsceDocelowe;
    }

    public void setMiejsceDocelowe(String miejsceDocelowe) {
        MiejsceDocelowe = miejsceDocelowe;
    }

    public String getMiejsceWylotu() {
        return MiejsceWylotu;
    }

    public void setMiejsceWylotu(String miejsceWylotu) {
        MiejsceWylotu = miejsceWylotu;
    }

    public String getDataWylotu() {
        return DataWylotu;
    }

    public void setDataWylotu(String dataWylotu) {
        DataWylotu = dataWylotu;
    }

    public String getCzasTrwaniaLotu() {
        return CzasTrwaniaLotu;
    }

    public void setCzasTrwaniaLotu(String czasTrwaniaLotu) {
        CzasTrwaniaLotu = czasTrwaniaLotu;
    }

    public int getLiczbaDostepnychMiejsc() {
        return LiczbaDostepnychMiejsc;
    }

    public void setLiczbaDostepnychMiejsc(int liczbaDostepnychMiejsc) {
        LiczbaDostepnychMiejsc = liczbaDostepnychMiejsc;
    }
}
