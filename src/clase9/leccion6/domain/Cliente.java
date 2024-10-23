package clase9.leccion6.domain;
//primero creamosla clase cliente que hereda de la clase padre Persona
//luego creamos los atributos
//luego importamos la clase Date
//luego creamos los contructors

import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro; //imprtamos la clase Date
    private boolean vip;
    private static int contadorCliente; //tipo estatico

    //ahora los constructores
    public Cliente(Date fechaRegistro, boolean vip, String nombre,
                   char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;

    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}