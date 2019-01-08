package lista_clases;

import java.util.Date;

public class Vuelo {
    private int numero_vuelo;
    private String hora_salida;
    private String hora_llegada;
    private String lugar_origen;
    private String lugar_destino;
    private Date fecha_salida;
    private Date fecha_regreso;
    private String tipo_vuelo;

    // 
    
    public Vuelo(int numero_vuelo, String hora_salida, String hora_llegada, String lugar_origen, String lugar_destino, Date fecha_salida, Date fecha_regreso, String tipo_vuelo) {
        this.numero_vuelo = numero_vuelo;
        this.hora_salida = hora_salida;
        this.hora_llegada = hora_llegada;
        this.lugar_origen = lugar_origen;
        this.lugar_destino = lugar_destino;
        this.fecha_salida = fecha_salida;
        this.fecha_regreso = fecha_regreso;
        this.tipo_vuelo = tipo_vuelo;
    }
    
    public int getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(int numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public String getLugar_origen() {
        return lugar_origen;
    }

    public void setLugar_origen(String lugar_origen) {
        this.lugar_origen = lugar_origen;
    }

    public String getLugar_destino() {
        return lugar_destino;
    }

    public void setLugar_destino(String lugar_destino) {
        this.lugar_destino = lugar_destino;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_regreso() {
        return fecha_regreso;
    }

    public void setFecha_regreso(Date fecha_regreso) {
        this.fecha_regreso = fecha_regreso;
    }

    public String getTipo_vuelo() {
        return tipo_vuelo;
    }

    public void setTipo_vuelo(String tipo_vuelo) {
        this.tipo_vuelo = tipo_vuelo;
    }
    
    public void reservar(){
        
    }
    public void modificar(){
        
    }
    public void eliminar(){
        
    }
    public Vuelo buscar(){
        return null;
    }
    
}
