package entidad;

//b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
//modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).

public class Auto {

    private String marca, modelo, color, tipo;
    private Integer anio, numMotor, chasis;

    public Auto() {
    }

    public Auto(String marca, String modelo, String color, String tipo, Integer anio, Integer numMotor, Integer chasis) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.anio = anio;
        this.numMotor = numMotor;
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(Integer numMotor) {
        this.numMotor = numMotor;
    }

    public Integer getChasis() {
        return chasis;
    }

    public void setChasis(Integer chasis) {
        this.chasis = chasis;
    }
    
    
}
