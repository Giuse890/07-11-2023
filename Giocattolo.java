public class Giocattolo {
    
    String id;
    String nome;
    double prezzo;
    int etàConsigliata;

    public Giocattolo(String id, String nome, double prezzo, int etàConsigliata) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.etàConsigliata = etàConsigliata;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getEtàConsigliata() {
        return etàConsigliata;
    }

    public void setEtàConsigliata(int etàConsigliata) {
        this.etàConsigliata = etàConsigliata;
    }
}
