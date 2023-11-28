package com.aguerecoders.examenandroid.Componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aguerecoders.examenandroid.R

@Composable
fun CalculoEjercicioDos(resultado: String, operador: String, navController: NavController?) {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.be_back),
            contentDescription = "Nos vamos don fernando",
            modifier = Modifier.size(500.dp)
        )
        Text(
            text = "El resultado de la operacion $operador es: $resultado",
            fontSize = 20.sp
        )
        Button(onClick = { navController?.popBackStack() }) {
            Text(text = "Volver")
        }
    }

}