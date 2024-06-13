public class Concierto extends Evento {
    private boolean seguridadAdicional;
    private boolean standDeComida;

    public Concierto(int id ,String cliente,int fechareserva,String tipoEvento,double costoevento, boolean seguridadAdicional, boolean standDeComida) {
        super(id, cliente, fechareserva, tipoEvento, costoevento);
        this.seguridadAdicional = seguridadAdicional;
        this.standDeComida = standDeComida;
    }

    public boolean isSeguridadAdicional() {
        return seguridadAdicional;
    }

    public boolean isStandDeComida() {
        return standDeComida;
    }

    @Override
    public double calcularCosto() {
        double costo = getCostoevento();
        if (seguridadAdicional) {
            costo += 400;
        }
        if (standDeComida) {
            costo += 150;
        }
        return costo;
    }
}