package com.alisoncbv.fundamentoskotlin.retoIII
import kotlin.collections.List

class Subasta {
}

fun main(){

    val subasta= mutableListOf<MutableList<Any>>()

    println("Bienvenido a la subasta")

    do{
        println("¿Que deseas subastar?")
        var cosa:String= readLine()!!.toString().lowercase()

        println("¿Cuál es el precio base?")
        var precio:Int= readLine()!!.toInt()

        println("¡Inicia la subasta por un ${cosa}! ¿Quien ofrece más de ${precio}?")
        var resp1:String= readLine().toString()

        if(resp1.equals("yo")){
            do {
                println("Cuanto desea ofertar?")
                var oferta:Int= readLine()!!.toInt()

                if(oferta>precio){
                    subasta.add(mutableListOf(oferta))
                }

                println("¿Quien ofrece más?")
                var resp2= readLine()!!.toString()

            }while (resp2.equals("yo"))

            println("Ofertas: ${subasta}")
            println("El articulo es vendido por ${subasta.maxByOrNull{ it[0] as Int }}")

        }else{
            println("El artículo es vendido a la casa de subasta")
        }

        subasta.clear()

        println("¿Desea subastar otro articulo?")
        var resp:String= readLine()!!.toString().lowercase()

    }while(resp.equals("si"))

    println("Gracias por venir, te esperamos en una proxima subasta")



}