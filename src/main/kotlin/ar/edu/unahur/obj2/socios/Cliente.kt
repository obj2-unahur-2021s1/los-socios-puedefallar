package ar.edu.unahur.obj2.socios

class Pedido(val valor : Float) { }

class Cliente(val animo : Object, val plataBolsillo : Float, val direccion: Object) {

    fun propinaQueDejaPara(pedido : Pedido): Float {
       val propinaHumor : Float = when {
           animo.equals(enojado) -> 0F
           animo.equals(feliz) -> (pedido.valor * 0.25).toFloat()
           animo.equals(indiferente) -> plataBolsillo
           else -> pedido.valor

       }
        return propinaHumor
   }

}

object enojado {}
object feliz {}
object indiferente {}
object resfriado {}
