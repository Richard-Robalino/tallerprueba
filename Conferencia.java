public class Conferencia extends Evento {
    private boolean catering;
    private boolean equipoAudiovisuales;

    public Conferencia(int id, String cliente, int fechareserva, String tipoEvento, double costoevento, boolean catering, boolean equipoAudiovisuales) {
        super(id, cliente, fechareserva, tipoEvento, costoevento);
        this.catering = catering;
        this.equipoAudiovisuales = equipoAudiovisuales;
    }

    public boolean isCatering() {
        return catering;
    }

    public boolean isEquipoAudiovisuales() {
        return equipoAudiovisuales;
    }

    @Override
    public double calcularCosto() {
        double costo = getCostoevento();
        if (catering) {
            costo += 200;
        }
        if (equipoAudiovisuales) {
            costo += 100;
        }
        return costo;
    }
}