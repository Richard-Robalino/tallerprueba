public class Evento extends Reserva  {
    private String tipoevento;
    private Double Costoevento;

    public Evento(int id ,String cliente,int fechareserva,String tipoevento,double costoevento)
    {
        super(id,cliente,fechareserva);
        this.tipoevento=tipoevento;
        this.Costoevento=costoevento;
    }

    public String getTipoevento() {
        return tipoevento;
    }

    public Double getCostoevento() {
        return Costoevento;
    }

    @Override
    public void mostradatos() {
        super.mostradatos();
        System.out.println("Tipo de vento:"+getTipoevento()+"Costo Vento"+getCostoevento());
    }
    public abstract double calcuulardatos();
}
