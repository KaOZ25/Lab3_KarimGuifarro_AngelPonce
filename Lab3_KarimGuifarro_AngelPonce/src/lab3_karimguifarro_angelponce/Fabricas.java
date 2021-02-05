/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_karimguifarro_angelponce;

/**
 *
 * @author Karim Ozael
 */
public class Fabricas {
    private String nombre, ubicacion,tipo_carroceria,nombre_marcas;
    private int cantmax_modelos,cant_empleados,cant_autos;

    public Fabricas() {
    }

    public Fabricas(String nombre, String ubicacion, String tipo_carroceria, String nombre_marcas, int cantmax_modelos, int cant_empleados, int cant_autos) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipo_carroceria = tipo_carroceria;
        this.nombre_marcas = nombre_marcas;
        this.cantmax_modelos = cantmax_modelos;
        this.cant_empleados = cant_empleados;
        this.cant_autos = cant_autos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo_carroceria() {
        return tipo_carroceria;
    }

    public void setTipo_carroceria(String tipo_carroceria) {
        this.tipo_carroceria = tipo_carroceria;
    }

    public String getNombre_marcas() {
        return nombre_marcas;
    }

    public void setNombre_marcas(String nombre_marcas) {
        this.nombre_marcas = nombre_marcas;
    }

    public int getCantmax_modelos() {
        return cantmax_modelos;
    }

    public void setCantmax_modelos(int cantmax_modelos) {
        this.cantmax_modelos = cantmax_modelos;
    }

    public int getCant_empleados() {
        return cant_empleados;
    }

    public void setCant_empleados(int cant_empleados) {
        this.cant_empleados = cant_empleados;
    }

    public int getCant_autos() {
        return cant_autos;
    }

    public void setCant_autos(int cant_autos) {
        this.cant_autos = cant_autos;
    }

    @Override
    public String toString() {
        return "Fabricas{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", tipo_carroceria=" + tipo_carroceria + ", nombre_marcas=" + nombre_marcas + ", cantmax_modelos=" + cantmax_modelos + ", cant_empleados=" + cant_empleados + ", cant_autos=" + cant_autos + '}';
    }
    
}
