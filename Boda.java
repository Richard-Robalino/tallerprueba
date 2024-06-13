public class Boda extends Evento {
    private boolean decoracionFloral;
    private boolean musicaEnVivo;

    public Boda(int id ,String cliente,int fechareserva,String tipoEvento,double Costoevento, boolean decoracionFloral, boolean musicaEnVivo) {
        super(id, cliente, fechareserva, tipoEvento, Costoevento);
        this.decoracionFloral = decoracionFloral;
        this.musicaEnVivo = musicaEnVivo;
    }

    public boolean isDecoracionFloral() {
        return decoracionFloral;
    }

    public boolean isMusicaEnVivo() {
        return musicaEnVivo;
    }

    @Override
    public double calcularCosto() {
        double costo = getCostoevento();
        if (decoracionFloral) {
            costo += 500;
        }
        if (musicaEnVivo) {
            costo += 300;
        }
        return costo;
    }
}
