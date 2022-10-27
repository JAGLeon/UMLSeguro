package entidad;

//Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
//cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
//domicilio, teléfono.

public class Persona {
    private String nombre, apellido, mail, domicilio;
    private Integer documento, telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String mail, String domicilio, Integer documento, Integer telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
        this.documento = documento;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    
}
