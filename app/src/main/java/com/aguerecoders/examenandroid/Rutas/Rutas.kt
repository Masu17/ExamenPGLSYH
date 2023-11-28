package com.aguerecoders.examenandroid.Rutas

sealed class Rutas(val ruta: String) {
    object Menu : Rutas("menu")
    object EjercicioUno : Rutas("ejercicioUno")
    object EjercicioDos : Rutas("ejercicioDos")
    object CalculoEjercicioDos: Rutas("calculoEjercicioDos")
}
