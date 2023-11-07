public class Vendita {
    private Cliente cliente;
    private Giocattolo giocattolo;
    private int quantità;
    private double prezzo;

    public Vendita(Cliente cliente, Giocattolo giocattolo, int quantità, double prezzo) {
        this.cliente = cliente;
        this.giocattolo = giocattolo;
        this.quantità = quantità;
        this.prezzo = prezzo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Giocattolo getGiocattolo() {
        return giocattolo;
    }

    public void setGiocattolo(Giocattolo giocattolo) {
        this.giocattolo = giocattolo;
    }

    public int getQuantita() {
        return quantità;
    }

    public void setQuantita(int quantita) {
        this.quantità = quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
