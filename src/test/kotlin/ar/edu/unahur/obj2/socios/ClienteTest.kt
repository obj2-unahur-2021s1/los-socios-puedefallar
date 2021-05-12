package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({

  val cliente1 = Cliente(Enojado,500.0,LasLauchas)
  val pedido1 = Pedido(1000.0)

  describe("La propina de un cliente varía segun el ánimo") {
    it ("Cuanto deja si esta enojado"){
      cliente1.propinaSegunAnimo(pedido1).shouldBe(0.0)
    }
    it ("Cuanto deja si esta feliz"){
      cliente1.cambiarEstadoDeAnimo(Feliz)
      cliente1.propinaSegunAnimo(pedido1).shouldBe(250.0)
    }
    it ("Cuanto deja si esta indiferente"){
      cliente1.cambiarEstadoDeAnimo(Indiferente)
      cliente1.propinaSegunAnimo(pedido1).shouldBe(500.0)
    }
    it ("Cuanto deja si esta indiferente con menos plata en el bolsillo"){
      cliente1.cambiarEstadoDeAnimo(Indiferente)
      cliente1.cambiarPlataBolsillo(0.5)
      cliente1.propinaSegunAnimo(pedido1).shouldBe(0.5)
    }
    it ("Cuanto deja si esta resfriado"){
      cliente1.cambiarEstadoDeAnimo(Resfriado)
      cliente1.propinaSegunAnimo(pedido1).shouldBe(1000.0)
    }
  }
  describe("La propina de un cliente varía también segun el barrio") {
    val clienteVerde = Cliente(Indiferente, 1200.0, BarrioVerde)
    val pedido2 = Pedido(2000.0)
    it("Cuanto deja un cliente Feliz de Las Lauchas") {
      val clienteLaucha = Cliente(Feliz, 1200.0, LasLauchas)
      clienteLaucha.propinaQueDejaPara(pedido2).shouldBe(250.0)
    }
    it("Cuanto deja un cliente Enojado de Las Torres") {
      val clienteTorres = Cliente(Enojado, 1200.0, LasTorres)
      clienteTorres.propinaQueDejaPara(pedido2).shouldBe(0.0)
    }
    it("Cuanto deja un cliente Resfriado de Las Rosas") {
      val clienteRosas = Cliente(Resfriado, 1200.0, LasRosas)
      clienteRosas.propinaQueDejaPara(pedido2).shouldBe(2050.0)
    }
    it("Cuanto deja un cliente Indiferente de Barrio Verde") {
      clienteVerde.propinaQueDejaPara(pedido2).shouldBe(1200.0)
    }
    it("Cuanto deja un cliente Indiferente de Barrio Verde si se muda a Las Lauchas") {
      clienteVerde.cambiarDireccion(LasLauchas)
      clienteVerde.propinaQueDejaPara(pedido2).shouldBe(600.0)
    }
  }

})
