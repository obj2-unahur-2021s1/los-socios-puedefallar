package ar.edu.unahur.obj2.socios

interface Direccion {
    fun afectarPropinaSegunDireccion(cliente: Cliente, pedido: Pedido) : Double
}

object LasRosas : Direccion {
    override fun afectarPropinaSegunDireccion(cliente: Cliente, pedido: Pedido) : Double {
        return cliente.propinaSegunAnimo(pedido) + 50
    }
}
object LasLauchas : Direccion{
    override fun afectarPropinaSegunDireccion(cliente: Cliente, pedido: Pedido) : Double {
        return cliente.propinaSegunAnimo(pedido) / 2
    }
}
object BarrioVerde : Direccion {
    override fun afectarPropinaSegunDireccion(cliente: Cliente, pedido: Pedido) : Double {
        return maxOf(cliente.propinaSegunAnimo(pedido), 200.0)
    }
}
object LasTorres : Direccion {
    override fun afectarPropinaSegunDireccion(cliente: Cliente, pedido: Pedido) : Double {
        return cliente.propinaSegunAnimo(pedido)
    }
}