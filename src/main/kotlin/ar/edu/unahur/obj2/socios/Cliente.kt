package ar.edu.unahur.obj2.socios

import java.util.*

class Pedido(val valor : Float) { }

class Cliente(var animo : Animo, val plataBolsillo: Float, var direccion: Direccion) {

    fun cambiarEstadoDeAnimo(animo :Animo){
        this.animo = animo
    }
    fun cambiarDireccion(direccion: Direccion){
        this.direccion = direccion
    }
    fun propinaSegunAnimo(pedido : Pedido): Float {
        return this.animo.afectarPropinaSegunAnimo(this, pedido)
    }


}



