package com.aguerecoders.examenandroid.Componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.aguerecoders.examenandroid.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EjercicioDos(navController: NavController?) {

    var operadorUno by remember {
        mutableStateOf("")
    }

    var operadorDos by remember {
        mutableStateOf("")
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            TextField(
                value = operadorUno,
                onValueChange = { operadorUno = it },
                placeholder = { Text(text = "Operador Uno") },
                modifier = Modifier.weight(1f),
            )
            TextField(
                value = operadorDos,
                onValueChange = { operadorDos = it },
                placeholder = { Text(text = "Operador Dos") },
                modifier = Modifier.weight(1f),
            )
        }

        Image(
            painter = painterResource(id = R.drawable.calculator),
            contentDescription = "saionara babi",
            modifier = Modifier.size(500.dp)
        )

        Row {
            Button(onClick = {
                navController?.navigate("calculoEjercicioDos/${operadorUno.toInt() + operadorDos.toInt()}/+")
            }, Modifier.weight(1f)) {
                Text(text = "+")
            }
            Button(onClick = {
                navController?.navigate("calculoEjercicioDos/${operadorUno.toInt() - operadorDos.toInt()}/-")
            }, Modifier.weight(1f)) {
                Text(text = "-")
            }
            Button(onClick = {
                navController?.navigate("calculoEjercicioDos/${operadorUno.toInt() * operadorDos.toInt()}/*")
            }, Modifier.weight(1f)) {
                Text(text = "x")
            }
            Button(onClick = {
                navController?.navigate("calculoEjercicioDos/${operadorUno.toInt() / operadorDos.toInt()}/div")
            }, Modifier.weight(1f)) {
                Text(text = "/")

            }
        }

        Text(text = operadorUno)
        Text(text = operadorDos)

    }

}