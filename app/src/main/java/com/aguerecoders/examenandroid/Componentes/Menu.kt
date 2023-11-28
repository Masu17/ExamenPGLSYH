package com.aguerecoders.examenandroid.Componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.aguerecoders.examenandroid.R
import com.aguerecoders.examenandroid.Rutas.Rutas


@Composable
fun Menu(navController: NavController?) {

    Column {
        Text(text = "Me copie del chatgepeteese meperdonas?¿!")
        Image(
            painter = painterResource(id = R.drawable.meperdonas),
            contentDescription = "El meme de meperdonas",
            modifier = Modifier.size(500.dp)
        )
        Column (Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { navController?.navigate(Rutas.EjercicioUno.ruta) }) {
                Text(text = "Ejercicio Uno")
            }
            Button(onClick = { navController?.navigate(Rutas.EjercicioDos.ruta) }) {
                Text(text = "Ejercicio Dos")
            }
        }
        Spacer(modifier = Modifier.size(100.dp))
        Text(text = "Esvromanomekopie")
    }

}