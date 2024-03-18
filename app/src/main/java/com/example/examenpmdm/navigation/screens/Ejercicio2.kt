package com.example.examenpmdm.navigation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PantallaPrueba2( viewModel: ExamenViewModel){


    Scaffold (
        topBar = { TopAppBar (
            title = { Text(text = "Gonzalo Campos Dominguez") },
            actions = {
                if(viewModel.visible){
                    IconButton(onClick =  viewModel.onChangeVis) {
                        Icon(Icons.Default.Refresh,contentDescription = null)
                    }
                    IconButton(onClick = {viewModel.suma()}) {
                        Icon(Icons.Default.Add,contentDescription = null)
                    }
                    IconButton(onClick = {viewModel.resta()}) {
                        Icon(Icons.Default.Delete,contentDescription = null)
                    }
                }

            })
        }
    ){

    }
}