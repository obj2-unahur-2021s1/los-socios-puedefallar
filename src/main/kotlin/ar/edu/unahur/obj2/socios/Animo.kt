package ar.edu.unahur.obj2.socios


interface Animo {
    fun afectarPropinaSegunAnimo(cliente: Cliente, pedido: Pedido) : Double
}
object Enojado : Animo{
    override fun afectarPropinaSegunAnimo(cliente: Cliente, pedido: Pedido): Double {
        return 0.0
    }
}
object Feliz : Animo {
    override fun afectarPropinaSegunAnimo(cliente: Cliente, pedido: Pedido): Double {
        return (pedido.valor * 0.25)
    }
}
object Indiferente : Animo{
    override fun afectarPropinaSegunAnimo(cliente: Cliente, pedido: Pedido): Double {
        return cliente.plataBolsillo
    }
}
object Resfriado : Animo{
    override fun afectarPropinaSegunAnimo(cliente: Cliente, pedido: Pedido): Double {
        return pedido.valor
    }
}