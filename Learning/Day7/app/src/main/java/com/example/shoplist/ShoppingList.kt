package com.example.shoplist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class ShoppingItem(val id : Int,var name: String,var quantity : Int,var isEditing : Boolean = false){

}


@Composable
fun ShopListApp(){
    var sItems by remember{ ( mutableStateOf(listOf<ShoppingItem>()))}
    var showDialog by remember { mutableStateOf(false) }
    var itemName by remember { mutableStateOf("") }
    var itemQuantity by remember { mutableStateOf("1")}
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement =  Arrangement.Center
    ) {

        Button(
            onClick = { showDialog = true },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(50.dp)
        ) {
            Text(text = "Add Item")
        }
        Text(text = "Shopping List", modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(15.dp),
            style = MaterialTheme.typography.headlineLarge
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),

            ) {
            items(sItems){
                
            }
        }
        if(showDialog){
            AlertDialog(onDismissRequest = { showDialog = false }, confirmButton = {

            },
                title = { Text(text = "Add Shopping List", modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(15.dp))},
                text = {
                    Column {
                       OutlinedTextField(value = itemName, onValueChange = {itemName = it}, singleLine = true, modifier = Modifier
                           .fillMaxWidth()
                           .padding(15.dp))
                        OutlinedTextField(value = itemQuantity, onValueChange = {itemQuantity = it},singleLine = true, modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp))

                        Button(onClick = {
                            if (itemName.isNotEmpty()){
                                val newItem = ShoppingItem(sItems.size+1, name = itemName, quantity = itemQuantity.toInt())
                                sItems = sItems + newItem
                                showDialog  = false
                                itemName = ""
                                itemQuantity = "1"
                            }
                        }, modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(15.dp)) {
                            Text(text = "Add")
                        }
                    }
                }
                )
        }
    }
}