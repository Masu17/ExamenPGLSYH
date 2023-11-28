package com.aguerecoders.examenandroid.Rutas

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aguerecoders.examenandroid.Componentes.CalculoEjercicioDos
import com.aguerecoders.examenandroid.Componentes.EjercicioDos
import com.aguerecoders.examenandroid.Componentes.EjercicioUno
import com.aguerecoders.examenandroid.Componentes.Menu

@Composable
fun GrafoNavegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Rutas.Menu.ruta) {

        composable(Rutas.Menu.ruta) {
            Menu(navController = navController)
        }

        composable(Rutas.EjercicioUno.ruta) {
            EjercicioUno(navController = navController)
        }

        composable(Rutas.EjercicioDos.ruta) {
            EjercicioDos(navController = navController)
        }

        composable(Rutas.CalculoEjercicioDos.ruta + "/{resultado}/{operador}") {
            CalculoEjercicioDos(
                resultado = it.arguments?.getString("resultado") ?: "",
                operador = it.arguments?.getString("operador") ?: "",
                navController = navController
            )
        }

    }
}