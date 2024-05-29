package com.example.firstapp

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imeNestedScroll
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstapp.ui.theme.FirstAppTheme
import androidx.compose.ui .platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalLayoutApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize().imeNestedScroll()) { innerPadding ->
                    UnitConverterApp()
                }


            }
        }
    }
}
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun UnitConverterApp() {
    // Add your UI components here stacked here
    var inputtedValue by remember { mutableStateOf("") }
    var outputtedValue by remember { mutableStateOf("") }
    var inputtedUnit  by remember { mutableStateOf("Centimeter (cm)") }
    var outputtedUnit  by remember { mutableStateOf("Meters (m)") }
    var iExpanded  by remember { mutableStateOf(false) }
    var oExpanded  by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Unit Convertor",
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,

            )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField( value = inputtedValue, onValueChange = {
            inputtedValue = it
        },keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done), )
        if (inputtedValue.isEmpty()){
            outputtedValue = "0"
        }
        else if (inputtedValue.toDoubleOrNull() == null  ){
//            Toast.makeText(LocalContext.current, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            outputtedValue = "Enter a valid number"
        }
        else{
           outputtedValue = convertUnit(inputtedValue, inputtedUnit, outputtedUnit)
        }
        Spacer(modifier = Modifier.height(20.dp))

        Row {
           Box{
                Button(onClick = {
                    iExpanded = !iExpanded

                }) {
                    Text(text = inputtedUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "ArrowDropDown")
                }
               DropdownMenu(expanded = iExpanded, onDismissRequest = { iExpanded = false}) {
                    DropdownMenuItem(text = { Text(text = "Centimeter (cm)")}, onClick = { inputtedUnit = "Centimeter (cm)"
                        iExpanded = false
                    })
                    DropdownMenuItem(text = { Text(text = "Meters (m)")}, onClick = { inputtedUnit = "Meters (m)"
                        iExpanded = false
                    })
                    DropdownMenuItem(text = { Text(text = "Feets (ft)")}, onClick = { inputtedUnit = "Feets (ft)"
                        iExpanded = false
                    })
                    DropdownMenuItem(text = { Text(text = "Millimeters (mm)")}, onClick = { inputtedUnit = "Millimeters (mm)"
                        iExpanded = false
                    })
               }
           }
            Spacer(modifier = Modifier.width(10.dp))
            Box{
                Button(onClick = { oExpanded = !oExpanded },) {
                    Text(text = outputtedUnit)

                    Icon(Icons.Default.ArrowDropDown, contentDescription = "ArrowDropDown")
                }
                DropdownMenu(expanded = oExpanded, onDismissRequest = { oExpanded = false}) {
                    DropdownMenuItem(text = { Text(text = "Centimeter (cm)")}, onClick = { outputtedUnit = "Centimeter (cm)"
                        oExpanded = false
                    })
                    DropdownMenuItem(text = { Text(text = "Meters (m)")}, onClick = { outputtedUnit = "Meters (m)"
                        oExpanded = false
                    })
                    DropdownMenuItem(text = { Text(text = "Feets (ft)")}, onClick = { outputtedUnit = "Feets (ft)"
                        oExpanded = false
                    })
                    DropdownMenuItem(text = { Text(text = "Millimeters (mm)")}, onClick = { outputtedUnit = "Millimeters (mm)"
                        oExpanded = false
                    })
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Result")
        Row {
            Text(text = outputtedValue.toString())
            Spacer(modifier = Modifier.width(10.dp))
            if (outputtedValue != "Enter a valid number"){
            Text(text = outputtedUnit)}
        }

    }

}
fun convertUnit(inputtedValue: String, inputtedUnit: String, outputtedUnit: String): String{
    // Considering Base Unit to meters

    val db = mutableMapOf(
        "Centimeter (cm)" to 0.01,
        "Meters (m)" to 1.0,
        "Feets (ft)" to 0.3048,
        "Millimeters (mm)" to 0.001
    )
    val convertedValue = (inputtedValue.toDouble() * db[inputtedUnit]!!) / db[outputtedUnit]!!
    return convertedValue.toString()
}
@Preview
@Composable
fun UnitConverterAppPreview() {
    UnitConverterApp()
}