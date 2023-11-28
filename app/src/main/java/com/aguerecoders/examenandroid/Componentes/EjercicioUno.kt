package com.aguerecoders.examenandroid.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.aguerecoders.examenandroid.Rutas.Rutas

@Composable
fun EjercicioUno(navController: NavHostController) {

    var fondoOptions = listOf("Negro", "Verde", "Rojo")
    var letraOptions = listOf("Azul", "Amarillo", "Gris")

    var activadoTexto by remember {
        mutableStateOf(false)
    }

    var colorFondo by remember {
        mutableStateOf(Color.White)
    }

    var colorLetras by remember {
        mutableStateOf(Color.Gray);
    }

    var seleccionUno by remember {
        mutableStateOf(fondoOptions[0])
    }

    var seleccionDos by remember {
        mutableStateOf(letraOptions[0])
    }



    Column {

        Text(
            text = "CAMALEON",
            textAlign = TextAlign.Center,
            fontSize = 50.sp,
            color = if (activadoTexto) colorLetras else Color.Gray,
            modifier = Modifier
                .background(if (activadoTexto) colorFondo else Color.White)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Column(Modifier.selectableGroup()) {
            fondoOptions.forEach() {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .border(1.dp, Color.Black)
                ) {
                    RadioButton(selected = it.equals(seleccionUno), onClick = {
                        seleccionUno = it
                        colorFondo = when (seleccionUno) {
                            "Negro" -> Color.Black
                            "Verde" -> Color.Green
                            "Rojo" -> Color.Red
                            else -> Color.White
                        }
                    })
                    Text(text = it, fontSize = 24.sp)
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(Modifier.selectableGroup()) {
            letraOptions.forEach() {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .border(1.dp, Color.Black)
                ) {
                    RadioButton(selected = it.equals(seleccionDos), onClick = {
                        seleccionDos = it
                        colorLetras = when (seleccionDos) {
                            "Azul" -> Color.Blue
                            "Amarillo" -> Color.Yellow
                            "Gris" -> Color.Gray
                            else -> Color.White
                        }
                    })
                    Text(text = it, fontSize = 24.sp)
                }
            }
        }
        Row {
            Checkbox(checked = activadoTexto, onCheckedChange = {
                activadoTexto = !activadoTexto
            })
            Text(text = "Mostrar Texto", fontSize = 24.sp)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
            Button(onClick = { navController?.navigate(Rutas.Menu.ruta) }) {
                Text(text = "Volver", fontSize = 24.sp)
            }
        }

    }
}