package ar.edu.unahur.obj2.socios


interface Animo {
    fun afectarPropinaSegunAnimo(cliente: Cliente, pedido: Pedido) : Float
}
object Enojado : Animo{
    override fun afectarPropinaSegunAnimo(cliente: Cliente, pedido: Pedido): Float {
        return 0F
    }
}
object Feliz : Animo {
    override fun afectarPropinaSegunAnimo(cliente: Cliente, pedido: Pedido): Float {
        return (pedido.valor * 0.25).toFloat()
    }
}
object Indiferente : Animo{
    override fun afectarPropinaSegunAnimo(cliente: Cliente, pedido: Pedido): Float {
        return cliente.plataBolsillo
    }
}
object Resfriado : Animo{
    override fun afectarPropinaSegunAnimo(cliente: Cliente, pedido: Pedido): Float {
        return pedido.valor
    }
}