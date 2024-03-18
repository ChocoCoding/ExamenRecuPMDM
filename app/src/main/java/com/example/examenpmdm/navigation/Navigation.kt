package com.example.examenpmdm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.examenpmdm.navigation.screens.ExamenPruebaConEstado
import com.example.examenpmdm.navigation.screens.ExamenViewModel
import com.example.examenpmdm.navigation.screens.Menu
import com.example.examenpmdm.navigation.screens.PantallaPrueba2
import com.example.examenpmdm.navigation.screens.Screens

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.Menu.route){
        composable(route=Screens.Menu.route){ Menu(navController = navController) }
        composable(route= Screens.Ejercicio1.route){
            ExamenPruebaConEstado() //Nombre de la funcion a ejecutar
        }
        composable(route= Screens.Ejercicio2.route){
            PantallaPrueba2(viewModel = ExamenViewModel())//Nombre de la funcion a ejecutar
        }
    }

}