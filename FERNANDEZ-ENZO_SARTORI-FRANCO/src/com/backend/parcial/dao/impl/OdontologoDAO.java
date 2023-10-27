package com.backend.parcial;
import java.util.ArrayList;
import java.util.List;

//Use un arrayList para almacenar los odontologos y
// use guardarOdontologo para agregar un odontologo a la lista y
// listarOdontologos para obtener una lista de todos los odontologos guardados ene l array



public class Odontologo{
    private int numeroMatricula;
    private String nombre;
    private String apellido;

    public Odontologo(int numeroMatricula, String nombre, String apellido) {
        this.numeroMatricula = numeroMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public int getNumeroMatricula(){
        return numeroMatricula;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }

    public void add(Odontologo odontologo) {
    }
}

public class OdontologoDAO {
    private List<Odontologo> odontologos = new ArrayList<>();

    public void guardarOdontologo(Odontologo odontologo){
        odontologo.add(odontologo);
    }
    public List<Odontologo> listarOdontologos(){
        return odontologos;
    }
}

