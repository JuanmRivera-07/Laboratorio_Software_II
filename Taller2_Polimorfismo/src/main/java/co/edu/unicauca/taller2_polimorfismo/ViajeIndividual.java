/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.taller2_polimorfismo;


import java.util.Date;

/**
 *
 * @author Rivera
 */
public class ViajeIndividual extends Viaje {
    // Constructor

    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
    
    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
    //No se sobreescribe cualquierMetodo2()
}
