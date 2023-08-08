package com.alisoncbv.fundamentoskotlin.retoI

class Telefono {
}

fun main() {

    var m: Int = 0

    var op: String = "si"

    while (op.equals("si")) {
        println("En este momento la persona a la que esta llamando no puede contestar, intente más tarde.")
        println("...")

        println("¿Desea llamarla de nuevo?")
        op = readLine()!!.toString().lowercase()

        if (op.equals("si")) {
            m = m + 1
        } else {

        }
    }

    println("¿Desea conocer el historial de su teléfono?")
    var resp: String = readLine()!!.toString().lowercase()

    if (resp.equals("si")) {

        println("Buzón")

        if (m == 0) {
            println("No tiene notificaciones")

        } else if (m < 100) {
            println("En total tiene $m notificaciones")

        } else {
            println("99+ notificaciones")
        }
    } else {
        println("saliendo...")
    }
}