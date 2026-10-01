class Ukol {
    private String nazev;
    private int priorita;

    public Ukol(String nazev, int priorita) {
        this.nazev = nazev;
        this.priorita = priorita;
    }

    public String getNazev() { return nazev; }
    public int getPriorita() { return priorita; }
    public void setNazev(String nazev) { this.nazev = nazev; }
    public void setPriorita(int priorita) { this.priorita = priorita; }

    @Override
    public String toString() {
        return nazev + " (priorita: " + priorita + ")";
    }
}
