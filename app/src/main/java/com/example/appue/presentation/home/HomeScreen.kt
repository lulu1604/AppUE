package com.example.appue.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.appue.data.model.CountryModel


val mockCountries = listOf(
    CountryModel(name= "Colombia", ranking=8 , imageUrl= "https://flagcdn.com/w320/co.png"),
    CountryModel(name= "Argentina", ranking=9 , imageUrl= "https://flagcdn.com/w320/ar.png"),
    CountryModel(name= "Francia", ranking=1 , imageUrl= "https://flagcdn.com/w320/fr.png"),
    CountryModel(name= "Brasil", ranking=10 , imageUrl= "https://flagcdn.com/w320/br.png"),
    CountryModel(name= "Peru", ranking=12 , imageUrl= "https://flagcdn.com/w320/pe.png"),
    CountryModel(name= "Uruguay", ranking=13 , imageUrl= "https://flagcdn.com/w320/uy.png"),

    )

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier.fillMaxSize().padding(all = 16.dp),
        verticalArrangement = Arrangement.Center,                 // *
        horizontalAlignment = Alignment.CenterHorizontally          //* SOLO POR LA CLASE
        /*    */
    ){
        //Spacer(modifier = Modifier.height(32.dp))
        //Spacer(modifier = Modifier.weight(weight = 1f))//para tener una separacion con la cabecera del celular
        Text(text= "Raking FIFA 2025")
        //Spacer(modifier = Modifier.weight(weight = 1f))
        Spacer(modifier = Modifier.height(height = 8.dp))

        LazyColumn {
            items(items = mockCountries) { country ->
                Text(text = "Country; ${country.name}")
            }

        }


    }

}