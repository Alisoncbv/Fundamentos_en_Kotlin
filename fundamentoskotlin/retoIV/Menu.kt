package com.alisoncbv.fundamentoskotlin.retoIV

class Menu {
}

fun main(){

    var entrada = mutableListOf<MutableList<Any>>()
    var pFuerte = mutableListOf<MutableList<Any>>()
    var postre = mutableListOf<MutableList<Any>>()
    var bebida = mutableListOf<MutableList<Any>>()

    println("Bienvenido al restaurante Pollitos")

    do{
        println("Para crear el menú es necesario que elijas una categoría" +
                "\n1.Entradas" +
                "\n2.Platos fuertes" +
                "\n3.Postres" +
                "\n4.Bedidas")

        var menuOp:Int= readLine()!!.toInt()

        when(menuOp){

            //Menú entradas
            1->{
                println("¿Qué acción desea ejecutar?")
                println("1. Agregar entrada" +
                        "\n2. Mostrar entradas" +
                        "\n3. Mostrar entrada según el código" +
                        "\n4. Modificar todas las entradas" +
                        "\n5. Modificar un entrada del menú" +
                        "\n6. Eliminar una entrada del menú")
                var op:Int= readLine()!!.toInt()

                when(op){
                    1->{
                        //Agregar platos
                        println("Opción 1")
                        println("Ingrese el código de la entrada")
                        var codigoE:Int= readLine()!!.toInt()
                        println("¿Cuál es el nombre del plato?")
                        var nombreE:String= readLine()!!.toString()
                        println("Ingrese una descripción del plato")
                        var descripE:String= readLine()!!.toString()
                        println("Ingrese el precio del plato")
                        var precioE:Int= readLine()!!.toInt()

                        entrada.add((mutableListOf(codigoE,nombreE, descripE, precioE)))

                        println("El plato fue agregado correctamente")
                    }

                    2->{
                        //Mostrar platos
                        println("Opción 2")
                        println("Menú de entradas")
                        println(entrada)
                    }

                    3->{
                        //Mostrar entrada según codigo
                        println("Opción 3")
                        println("Ingrese el código de la entrada que desea visualizar")
                        var cod:Int= readLine()!!.toInt()

                        var presente=false

                        for(entradas in entrada.indices){
                            if(cod==entradas){
                                println("Menú entrada: ${entrada[entradas]}")
                                presente=true

                                break
                            }
                        }

                        if(presente==false){
                            println("Código incorrecto")
                        }
                    }

                    4->{
                        //Modificar todas las entradas
                        println("Opción 4")
                        entrada.clear()

                        println("Ingrese el código de la entrada")
                        var codigoE:Int= readLine()!!.toInt()
                        println("¿Cuál es el nombre del plato?")
                        var nombreE:String= readLine()!!.toString()
                        println("Ingrese una descripción del plato")
                        var descripE:String= readLine()!!.toString()
                        println("Ingrese el precio del plato")
                        var precioE:Int= readLine()!!.toInt()

                        entrada.add((mutableListOf(codigoE,nombreE, descripE, precioE)))


                    }

                    5->{
                        //Modificar una entrada del menú
                        println("Opción 5")
                        println("Ingrese el código de la entrada que desea modificar")
                        var nuevaE:Int= readLine()!!.toInt()

                        println("Ingrese el código de la entrada")
                        var codigoE:Int= readLine()!!.toInt()
                        println("¿Cuál es el nombre del plato?")
                        var nombreE:String= readLine()!!.toString()
                        println("Ingrese una descripción del plato")
                        var descripE:String= readLine()!!.toString()
                        println("Ingrese el precio del plato")
                        var precioE:Int= readLine()!!.toInt()

                        var nuevaEntrada=mutableListOf(codigoE, nombreE, descripE, precioE)

                        if(nuevaE>=0){
                            entrada[nuevaE]=nuevaEntrada.toMutableList()
                            println("Se modificó correctamente la entrada")

                        }else{
                            println("Código incorrecto")
                        }
                    }

                    6->{
                        //Eliminar una entrada del menú
                        println("Opción 6")
                        println("Ingrese el código de la entrada que desea eliminar?")
                        var cog:Int= readLine()!!.toInt()

                        entrada.removeAt(cog)
                        println("Se eliminó correctamente la entrada")
                    }
                }
            }

            //Menú platos fuerte
            2->{
                println("¿Qué acción desea ejecutar?")
                println("1. Agregar plato fuerte" +
                        "\n2. Mostrar platos fuerte" +
                        "\n3. Mostrar plato fuerte según el código" +
                        "\n4. Modificar todos los platos fuerte"+
                        "\n5. Modificar un plato fuerte del menú" +
                        "\n6. Eliminar un plato fuerte del menú")
                var op:Int= readLine()!!.toInt()

                when(op){
                    1->{
                        //Agregar platos
                        println("Opción 1")
                        println("Ingrese el código del plato fuerte")
                        var codigoP:Int= readLine()!!.toInt()
                        println("¿Cuál es el nombre del plato fuerte?")
                        var nombreP:String= readLine()!!.toString()
                        println("Ingrese una descripción del plato fuerte")
                        var descripP:String= readLine()!!.toString()
                        println("Ingrese el precio del plato fuerte")
                        var precioP:Int= readLine()!!.toInt()

                        pFuerte.add((mutableListOf(codigoP, nombreP, descripP, precioP)))

                        println("El plato fue agregado correctamente")
                    }

                    2->{
                        //Mostrar platos
                        println("Opción 2")
                        println("Menú de platos fuertes")
                        println(pFuerte)
                    }

                    3->{
                        //Mostrar plato fuerte según código
                        println("Opción 3")
                        println("Ingrese el código del plato fuerte que desea visualizar")
                        var cod:Int= readLine()!!.toInt()

                        var presente=false

                        for(platos in pFuerte.indices){
                            if(cod==platos){
                                println("Menú entrada: ${pFuerte[platos]}")
                                presente=true

                                break
                            }
                        }

                        if(presente==false){
                            println("Código incorrecto")
                        }
                    }

                    4->{
                        //Modificar todos los platos fuertes del menú
                        println("Opción 4")
                        pFuerte.clear()

                        println("Ingrese el código del plato fuerte")
                        var codigoP:Int= readLine()!!.toInt()
                        println("¿Cuál es el nombre del plato fuerte?")
                        var nombreP:String= readLine()!!.toString()
                        println("Ingrese una descripción del plato fuerte")
                        var descripP:String= readLine()!!.toString()
                        println("Ingrese el precio del plato fuerte")
                        var precioP:Int= readLine()!!.toInt()

                        pFuerte.add((mutableListOf(codigoP, nombreP, descripP, precioP)))


                    }

                    5->{
                        //Modificar una entrada del menú
                        println("Opción 5")
                        println("Ingrese el código del plato fuerte que desea modificar")
                        var nuevaP:Int= readLine()!!.toInt()

                        println("Ingrese el código del plato fuerte")
                        var codigoP:Int= readLine()!!.toInt()
                        println("¿Cuál es el nombre del plato fuerte?")
                        var nombreP:String= readLine()!!.toString()
                        println("Ingrese una descripción del plato fuerte")
                        var descripP:String= readLine()!!.toString()
                        println("Ingrese el precio del plato fuerte")
                        var precioP:Int= readLine()!!.toInt()

                        var nuevaPlato=mutableListOf(codigoP, nombreP, descripP, precioP)

                        if(nuevaP>=0){
                            pFuerte[nuevaP]=nuevaPlato.toMutableList()
                            println("Se modificó correctamente el plato fuerte")

                        }else{
                            println("Código incorrecto")
                        }


                    }

                    6->{
                        //Eliminar una entrada del menú
                        println("Opción 6")
                        println("Ingrese el código del plato fuerte que desea eliminar?")
                        var cog:Int= readLine()!!.toInt()

                        pFuerte.removeAt(cog)
                        println("Se eliminó correctamente el plato fuerte")
                    }
                }
            }

            //Menú postres
            3->{
                println("¿Qué acción desea ejecutar?")
                println("1. Agregar postre" +
                        "\n2. Mostrar postres" +
                        "\n3. Mostrar postre según el código" +
                        "\n4. Modificar todos los postres"+
                        "\n5. Modificar un postre del menú" +
                        "\n6. Eliminar un postre del menú")
                var op:Int= readLine()!!.toInt()

                when(op){
                    1->{
                        //Agregar platos
                        println("Opción 1")
                        println("Ingrese el código del postre")
                        var codigoT:Int= readLine()!!.toInt()
                        println("¿Cuál es el nombre del postre?")
                        var nombreT:String= readLine()!!.toString()
                        println("Ingrese una descripción del postre")
                        var descripT:String= readLine()!!.toString()
                        println("Ingrese el precio del postre")
                        var precioT:Int= readLine()!!.toInt()

                        postre.add((mutableListOf(codigoT, nombreT, descripT, precioT)))

                        println("El postre se agregó correctamente")
                    }

                    2->{
                        //Mostrar postres
                        println("Opción 2")
                        println("Menú de postres")
                        println(postre)
                    }

                    3->{
                        //Mostrar postre según código
                        println("Opción 3")
                        println("Ingrese el código del postre que desea visualizar")
                        var cod:Int= readLine()!!.toInt()

                        var presente=false

                        for(postres in postre.indices){
                            if(cod==postres){
                                println("Menú entrada: ${postre[postres]}")
                                presente=true

                                break
                            }
                        }

                        if(presente==false){
                            println("Código incorrecto")
                        }
                    }

                    4->{
                        //Modificar todos los postres del menú
                        println("Opción 4")
                        postre.clear()

                        println("Ingrese el código del postre")
                        var codigoT:Int= readLine()!!.toInt()
                        println("¿Cuál es el nombre del postre?")
                        var nombreT:String= readLine()!!.toString()
                        println("Ingrese una descripción del postre")
                        var descripT:String= readLine()!!.toString()
                        println("Ingrese el precio del postre")
                        var precioT:Int= readLine()!!.toInt()

                        pFuerte.add((mutableListOf(codigoT, nombreT, descripT, precioT)))


                    }

                    5->{
                        //Modificar una entrada del menú
                        println("Opción 5")
                        println("Ingrese el código del postre que desea modificar")
                        var nuevaT:Int= readLine()!!.toInt()

                        println("Ingrese el código del postre")
                        var codigoT:Int= readLine()!!.toInt()
                        println("¿Cuál es el nombre del postre?")
                        var nombreT:String= readLine()!!.toString()
                        println("Ingrese una descripción del postre")
                        var descripT:String= readLine()!!.toString()
                        println("Ingrese el precio del postre")
                        var precioT:Int= readLine()!!.toInt()

                        var nuevaPostre=mutableListOf(codigoT, nombreT, descripT, precioT)

                        if(nuevaT>=0){
                            postre[nuevaT]=nuevaPostre.toMutableList()
                            println("Se modificó correctamente el postre")

                        }else{
                            println("Código incorrecto")
                        }


                    }

                    6->{
                        //Eliminar un postre del menú
                        println("Opción 6")
                        println("Ingrese el código del postre que desea eliminar?")
                        var cog:Int= readLine()!!.toInt()

                        postre.removeAt(cog)
                        println("Se eliminó correctamente el postre")
                    }
                }

            }

            //Menú bebidas
            4->{
                println("¿Qué acción desea ejecutar?")
                println("1. Agregar bebida" +
                        "\n2. Mostrar bebida" +
                        "\n3. Mostrar bebida según el código" +
                        "\n4. Modificar todas las bebidas"+
                        "\n5. Modificar una bebida del menú" +
                        "\n6. Eliminar una bebida del menú")
                var op:Int= readLine()!!.toInt()

                when(op){
                    1->{
                        //Agregar platos
                        println("Opción 1")
                        println("Ingrese el código de la bebida")
                        var codigoB:Int= readLine()!!.toInt()
                        println("¿Cuál es el nombre de la bebida?")
                        var nombreB:String= readLine()!!.toString()
                        println("Ingrese una descripción de la bebida")
                        var descripB:String= readLine()!!.toString()
                        println("Ingrese el precio de la bebida")
                        var precioB:Int= readLine()!!.toInt()

                        postre.add((mutableListOf(codigoB, nombreB, descripB, precioB)))

                        println("La bebida se agregó correctamente")
                    }

                    2->{
                        //Mostrar bebidas
                        println("Opción 2")
                        println("Menú de bebidas")
                        println(bebida)
                    }

                    3->{
                        //Mostrar bebida según código
                        println("Opción 3")
                        println("Ingrese el código de la bebida que desea visualizar")
                        var cod:Int= readLine()!!.toInt()

                        var presente=false

                        for(bebidas in bebida.indices){
                            if(cod==bebidas){
                                println("Menú entrada: ${bebida[bebidas]}")
                                presente=true

                                break
                            }
                        }

                        if(presente==false){
                            println("Código incorrecto")
                        }
                    }

                    4->{
                        //Modificar todas las bebidas del menú
                        println("Opción 4")
                        bebida.clear()

                        println("Ingrese el código de la bebida")
                        var codigoB:Int= readLine()!!.toInt()
                        println("¿Cuál es el nombre de la bebida?")
                        var nombreB:String= readLine()!!.toString()
                        println("Ingrese una descripción de la bebida")
                        var descripB:String= readLine()!!.toString()
                        println("Ingrese el precio de la bebida")
                        var precioB:Int= readLine()!!.toInt()

                        pFuerte.add((mutableListOf(codigoB, nombreB, descripB, precioB)))


                    }

                    5->{
                        //Modificar una bebida del menú
                        println("Opción 5")
                        println("Ingrese el código de la bebida que desea modificar")
                        var nuevaB:Int= readLine()!!.toInt()

                        println("Ingrese el código de la bebida")
                        var codigoB:Int= readLine()!!.toInt()
                        println("¿Cuál es el nombre de la bebida?")
                        var nombreB:String= readLine()!!.toString()
                        println("Ingrese una descripción de la bebida")
                        var descripB:String= readLine()!!.toString()
                        println("Ingrese el precio de la bebida")
                        var precioB:Int= readLine()!!.toInt()

                        var nuevaBebida=mutableListOf(codigoB, nombreB, descripB, precioB)

                        if(nuevaB>=0){
                            postre[nuevaB]=nuevaBebida.toMutableList()
                            println("Se modificó correctamente la bebida")

                        }else{
                            println("Código incorrecto")
                        }


                    }

                    6->{
                        //Eliminar una bebida del menú
                        println("Opción 6")
                        println("Ingrese el código de la bebida que desea eliminar?")
                        var cog:Int= readLine()!!.toInt()

                        bebida.removeAt(cog)
                        println("Se eliminó correctamente la bebida")
                    }
                }
            }
        }

        println("¿Deseas elegir otra categoría?")
        var categoria:String= readLine()!!.toString().lowercase()

        }while(categoria.equals("si"))

    println("Saliendo...")

}