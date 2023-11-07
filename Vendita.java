public class Vendita {
    private Cliente cliente;
    private Giocattolo giocattolo;
    private int quantita;
    private double prezzoUnitario;

    public Vendita(Cliente cliente, Giocattolo giocattolo, int quantita, double prezzoUnitario) {
        this.cliente = cliente;
        this.giocattolo = giocattolo;
        this.quantita = quantita;
        this.prezzoUnitario = prezzoUnitario;
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
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(double prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }
}
