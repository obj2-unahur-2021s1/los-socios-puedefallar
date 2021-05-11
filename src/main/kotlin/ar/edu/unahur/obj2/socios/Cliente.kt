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

    fun propinaQueDejaPara(pedido : Pedido): Float {
       val propinaHumor : Float = when {
           animo.equals(Enojado) -> 0F
           animo.equals(Feliz) -> (pedido.valor * 0.25).toFloat()
           animo.equals(Indiferente) -> plataBolsillo
           else -> pedido.valor

       }
        return when {
            direccion.equals(LasRosas) -> propinaHumor + 50
            direccion.equals(LasLauchas) -> propinaHumor / 2
            // Falta calcular el maximo
            direccion.equals(BarrioVerde) -> 200F
            else -> propinaHumor
        }
   }



}
abstract class Animo {


}
object Enojado : Animo(){}
object Feliz : Animo() {}
object Indiferente : Animo(){}
object Resfriado : Animo(){}

abstract class Direccion(){}

object LasRosas : Direccion() {}
object LasLauchas : Direccion() {}
object BarrioVerde : Direccion() {}
object LasTorres : Direccion() {}
