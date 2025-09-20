package com.example.appue.presentation.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(){         //AQUIIII EL NOMBRE !!!!!!!!!!!!!
    //email y password
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
//composable puede ser una caja de texto
    //dentro de los () va los atributos de la columna
    Column (
        modifier = Modifier.padding(all = 16.dp)
    ){
        Text(text= "Iniciar Sesión", style= MaterialTheme.typography.titleLarge)

        OutlinedTextField(
            value= email,
            onValueChange = {email=it} ,
            label ={Text(text= "Correo Electronico")},
            placeholder = {Text(text= "Correo Electronico")},
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(

            value = password,
            onValueChange = { password = it},
            label = {Text(text= "Contraseña")},
            placeholder = {Text(text= "Contraseña")},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(height = 16.dp))

        Button( onClick = {
            /*TODO*/
        },
        ) {
            Text(text= "Iniciar Sesión")

        }
    }
}



