public class ObjCliente {

    private int IdLlamada;
    private int IdCliente;
    private String NombreCliente;
    private String MotivoLlamada;
    private String HoraLlamada;
    private String Prioridad;
    private int Estado;

    
    public ObjCliente(int idLlamada, int idCliente, String nombreCliente, String motivoLlamada, String horaLlamada,
            String prioridad, int estado) {
        IdLlamada = idLlamada;
        IdCliente = idCliente;
        NombreCliente = nombreCliente;
        MotivoLlamada = motivoLlamada;
        HoraLlamada = horaLlamada;
        Prioridad = prioridad;
        Estado = estado;
    }


    public ObjCliente() {
    }


    public int getIdLlamada() {
        return IdLlamada;
    }


    public void setIdLlamada(int idLlamada) {
        IdLlamada = idLlamada;
    }


    public int getIdCliente() {
        return IdCliente;
    }


    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }


    public String getNombreCliente() {
        return NombreCliente;
    }


    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }


    public String getMotivoLlamada() {
        return MotivoLlamada;
    }


    public void setMotivoLlamada(String motivoLlamada) {
        MotivoLlamada = motivoLlamada;
    }


    public String getHoraLlamada() {
        return HoraLlamada;
    }


    public void setHoraLlamada(String horaLlamada) {
        HoraLlamada = horaLlamada;
    }


    public String getPrioridad() {
        return Prioridad;
    }


    public void setPrioridad(String prioridad) {
        Prioridad = prioridad;
    }


    public int getEstado() {
        return Estado;
    }


    public void setEstado(int estado) {
        Estado = estado;
    }

}
    