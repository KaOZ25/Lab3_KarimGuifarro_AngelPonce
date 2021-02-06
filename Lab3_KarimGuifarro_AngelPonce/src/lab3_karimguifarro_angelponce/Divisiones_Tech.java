/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_karimguifarro_angelponce;


public class Divisiones_Tech {
    private String nombre,campo,tech_desarrollada;
    private int año_creacion;
    private Corporaciones corporacion;

    public Divisiones_Tech() {
    }

    public Divisiones_Tech(String nombre, String campo, String tech_desarrollada, int año_creacion, Corporaciones corporacion) {
        this.nombre = nombre;
        this.campo = campo;
        this.tech_desarrollada = tech_desarrollada;
        this.año_creacion = año_creacion;
        this.corporacion = corporacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getTech_desarrollada() {
        return tech_desarrollada;
    }

    public void setTech_desarrollada(String tech_desarrollada) {
        this.tech_desarrollada = tech_desarrollada;
    }

    public int getAño_creacion() {
        return año_creacion;
    }

    public void setAño_creacion(int año_creacion) {
        this.año_creacion = año_creacion;
    }

    public Corporaciones getCorporacion() {
        return corporacion;
    }

    public void setCorporacion(Corporaciones corporacion) {
        this.corporacion = corporacion;
    }

    @Override
    public String toString() {
        return "Divisiones_Tech{" + "nombre=" + nombre + ", campo=" + campo + ", tech_desarrollada=" + tech_desarrollada + ", año_creacion=" + año_creacion + ", corporacion=" + corporacion + '}';
    }
    
 
}