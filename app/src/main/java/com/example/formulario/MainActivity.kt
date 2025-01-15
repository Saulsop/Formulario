package com.example.formulario

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.formulario.ui.theme.FormularioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FormularioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
   Column {
        Text(text = "Nombre")
       OutlinedTextField(value = "", onValueChange = {})

       Text(text = "Email")
       OutlinedTextField(value = "", onValueChange = {})

       Text(text = "Password")
       OutlinedTextField(value = "",  onValueChange = {})

       Button(onClick = {  /*TODO*/ }) {
           Text(text = "Enviar")
       }
   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FormularioTheme {
        Greeting("Saul")
    }
}