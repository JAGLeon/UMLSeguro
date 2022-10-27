package entidad;

//d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
//Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
//cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
//etc.).
public class Cuota {

    private Integer numCuota;
    private Double montoTotalCuota;
    private boolean pagada;
    private String fechaVencimiento, formaPago;
    private Poliza polizaCuota;
    
    public Cuota() {
    }

    public Cuota(Integer numCuota, Double montoTotalCuota, boolean pagada, String fechaVencimiento, String formaPago, Poliza polizaCuota) {
        this.numCuota = numCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
        this.polizaCuota = polizaCuota;
    }

    public Integer getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(Integer numCuota) {
        this.numCuota = numCuota;
    }

    public Double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(Double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Poliza getPolizaCuota() {
        return polizaCuota;
    }

    public void setPolizaCuota(Poliza polizaCuota) {
        this.polizaCuota = polizaCuota;
    }

    
}
