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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

//nombre ,correo, contraseña, repetir contraseña

@Composable
fun RegisterScreen(navController: NavController){//se debe agregar una dependencia para usar navController
    var nombre by remember { mutableStateOf(value="") }
    var correo by remember { mutableStateOf(value="") }
    var contraseña by remember { mutableStateOf(value="") }
    var repetirContraseña by remember { mutableStateOf(value="") }


    Column (
        modifier = Modifier.padding(all = 16.dp).fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(height = 16.dp))//para tener una separacion con la cabecera del celular
        Text(text= "Registro", style= MaterialTheme.typography.titleLarge)
        OutlinedTextField(

            value = nombre,
            onValueChange = { nombre= it},
            label = {Text(text= "Nombre")},
            placeholder = {Text(text= "Nombre")},
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value= correo,
            onValueChange = {correo=it} ,
            label ={Text(text= "Correo Electronico")},
            placeholder = {Text(text= "Correo Electronico")},
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(

            value = contraseña,
            onValueChange = { contraseña= it},
            label = {Text(text= "Contraseña")},
            placeholder = {Text(text= "Contraseña")},
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(

            value = repetirContraseña,
            onValueChange = {  repetirContraseña= it},
            label = {Text(text= "Repetir contraseña")},
            placeholder = {Text(text= "Repetir contraseña")},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(height = 16.dp))

        Button( onClick = {
            /*aqui se da la accion al boton*/
            /*TODO*/
            if (correo.isNotBlank() && contraseña.isNotBlank() && repetirContraseña.isNotBlank()){

                navController.navigate("login")

            }
        }, modifier = Modifier.fillMaxWidth()
        ) {
            Text(text= "Registrarse")

        }
    }
}