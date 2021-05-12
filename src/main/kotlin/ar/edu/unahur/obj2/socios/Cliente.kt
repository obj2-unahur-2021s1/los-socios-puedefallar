package ar.edu.unahur.obj2.socios

class Pedido(val valor : Double) { }

class Cliente(var animo : Animo, var plataBolsillo: Double, var direccion: Direccion) {

    fun cambiarEstadoDeAnimo(animo :Animo){
        this.animo = animo
    }
    fun cambiarPlataBolsillo(plata : Double){
        this.plataBolsillo = plata
    }
    fun cambiarDireccion(direccion: Direccion){
        this.direccion = direccion
    }
    fun propinaSegunAnimo(pedido : Pedido): Double {
        return this.animo.afectarPropinaSegunAnimo(this, pedido)
    }
    fun propinaQueDejaPara(pedido : Pedido): Double {
        return direccion.afectarPropinaSegunDireccion(this, pedido)
    }

}



