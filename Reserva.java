public class Reserva {
    private int id;
    private String cliente;
    private int fechareserva;

    public Reserva (int id ,String cliente,int fechareserva) {//,int valorreserva,int cantidareserva
        this.id=id;
        this.cliente=cliente;
        this.fechareserva=fechareserva;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public int getFechareserva() {
        return fechareserva;
    }
    public void mostradatos(){
        System.out.println("Id:"+getId()+"Cliente:"+getCliente()+"Fecha Reserva:"+getFechareserva());
    }


}
