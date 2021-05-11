package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  val cliente1 = Cliente(Enojado,500F,LasLauchas)


  val pedido1 = Pedido(1000F)
  describe("Un/a cliente") {
    it ("Cuanto deja si esta enojado"){
      cliente1.propinaQueDejaPara(pedido1).shouldBe(0)
    }
    it ("Cuanto deja si esta feliz"){
      cliente1.cambiarEstadoDeAnimo(Feliz)
      cliente1.cambiarDireccion(LasTorres)
      cliente1.propinaQueDejaPara(pedido1).shouldBe(250.0F)
    }
    it ("Cuanto deja si esta indiferente"){
      cliente1.cambiarEstadoDeAnimo(Indiferente)
      cliente1.cambiarDireccion(LasTorres)
      cliente1.propinaQueDejaPara(pedido1).shouldBe(500)
    }
    it ("Cuanto deja si esta resfriado"){
      cliente1.cambiarEstadoDeAnimo(Resfriado)
      cliente1.cambiarDireccion(LasRosas)
      cliente1.propinaQueDejaPara(pedido1).shouldBe(1050)
    }
  }
})
