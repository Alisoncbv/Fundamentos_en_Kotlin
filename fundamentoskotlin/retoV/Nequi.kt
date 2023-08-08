package com.alisoncbv.fundamentoskotlin.retoV

import kotlin.random.Random

class Nequi {
}

fun main(){

    println("Para acceder a la aplicación es necesario crear una cuenta")
    println("Por favor ingrese su número de teléfono")
    var telefono:Int= readLine()!!.toInt()
    println("Escriba una contraseña de cuatro números")
    var contraseña:Int= readLine()!!.toInt()

    for(i in 1..3){
        println("Inicio de sesión")
        println("Teléfono")
        var telefono1:Int= readLine()!!.toInt()
        println("Contreseña")
        var contraseña1:Int= readLine()!!.toInt()

        if(telefono1==telefono && contraseña1==contraseña){
            println("Bienvenido al sistema")
            break

        }else{
            println("!Upps¡, parece que tus datos de acceso son incorrectos, tienes tres intentos más")
        }
    }

    var saldo:Int=4500

    println("Tu saldo es de ${saldo}")

    do{
        println("¿Qué opción deseas ejecutar?" +
                "\n1. Sacar plata" +
                "\n2. Enviar plata" +
                "\n3. Recargar Nequi" +
                "\n4. Salir")
        var op:Int= readLine()!!.toInt()

        when(op){

            1->{
                println("Sacar plata")
                println("¿Quieres retirar dinero en un: " +
                        "\n1. Punto fisico" +
                        "\n2. Cajero")
                var sacar:Int= readLine()!!.toInt()

                if(saldo<2000){
                    println("No te alcanza")

                }else{
                    println("¿Cuanto dinero deseas retirar?")
                    var dinero:Int= readLine()!!.toInt()

                    var codigo= Random.nextInt(1234,8907)

                    println("Tu código para retirar el dinero es ${codigo}")

                    saldo=saldo-dinero
                }
                println("Saldo: ${saldo}")
            }

            2->{
                println("Enviar plata")
                println("Número teléfonico al que desea enviar el dinero")
                var numero:Int= readLine()!!.toInt()
                println("¿Cuanto dinero deseas enviar?")
                var enviarD:Int= readLine()!!.toInt()

                if(enviarD<saldo){
                    println("Envio exitoso")
                    saldo=saldo-enviarD

                }else{
                    println("El monto que deseas enviar sobrepasa tu saldo")
                }

                println("Saldo: ${saldo}")

            }

            3->{
                println("Recargar Nequi")
                println("¿Cuanto dinero deseas recargar?")
                var recargaD:Int= readLine()!!.toInt()

                println("¿Esta seguro de realizar la recarga?")
                var res:String= readLine()!!.toString().lowercase()

                if(res.equals("si")){
                    saldo=saldo+recargaD
                    println("Recarga exitosa")

                }else{
                    println("Recarga cancelada")
                }

                println("Saldo: ${saldo}")

            }

            4->{
                println("Saliendo..")
            }
        }

        println("¿Deseas ejecutar otra opción?")
        var r:String= readLine()!!.toString().lowercase()

    }while(r.equals("si"))

    println("Gracias por utilizar Nequi")




}