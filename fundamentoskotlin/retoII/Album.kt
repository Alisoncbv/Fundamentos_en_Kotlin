package com.alisoncbv.fundamentoskotlin.retoII

class Album {
}

fun main(){

    val album= mutableListOf<MutableList<Any>>()

    println("Bienvenido, para reproducir el álbum es necesario que respondas las siguientes preguntas")

    println("¿Cuantas canciones tiene el álbum?")
    var canciones:Int= readLine()!!.toInt()

    println("¿Cuál es el tipo de musíca del álbum?")
    var tipo:String= readLine()!!.toString().lowercase()

    for(i in 1..canciones){
        println("¿Cual es el título de la canción $i?")
        var titulo:String= readLine()!!.toString().lowercase()
        println("¿Cuál es el nombre del artista?")
        var artista:String= readLine()!!.toString().lowercase()
        println("¿En que año se publicó la canción?")
        var anio:Int= readLine()!!.toInt()
        println("¿Cuantas reproducciones tiene la canción?")
        var reproduccion:Int= readLine()!!.toInt()

        album.add(mutableListOf(titulo, artista, anio, reproduccion))
    }

    for(i in album.indices){
        println("${album[i][0]} interpretada por ${album[i][1]} se lanzó en el año ${album[i][2]} y tiene ${album[i][3]} reproducciones")
    }

    for(i in album.indices) {
        if(album[i][3] as Int >10){
            println("La canción ${album[i][0]} tiene ${album[i][3]} reproducciones, es una canción popular")
        }else{
            println("La canción ${album[i][0]} tiene ${album[i][3]} reproducciones, no es una canción popular")
        }
    }


}