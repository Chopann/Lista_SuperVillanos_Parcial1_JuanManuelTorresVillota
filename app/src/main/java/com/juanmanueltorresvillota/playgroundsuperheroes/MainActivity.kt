package com.juanmanueltorresvillota.playgroundsuperheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.juanmanueltorresvillota.playgroundsuperheroes.ui.theme.HeroCard
import com.juanmanueltorresvillota.playgroundsuperheroes.ui.theme.PlaygroundsuperheroesTheme
import com.juanmanueltorresvillota.playgroundsuperheroes.ui.theme.VillanoCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlaygroundsuperheroesTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun ListaSuperHeroes(
    superheroes: List<Nombres>,
    onVerDetalle: (Int) -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(superheroes, key = { it.id }) { heroe ->
            HeroCard(
                hero = heroe,
                onClick = { onVerDetalle(heroe.id) }
            )
        }
    }
}

@Composable
fun DetalleSuperHeroe(
    hero: Nombres,
    onVolver: () -> Unit,
    onVerVillano: () -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            HeroCard(hero = hero, option = 1)
        }
        item {
            Button(
                onClick = onVerVillano,
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.error
                )
            ) {
                Text("Ver su villano")
            }
        }
        item {
            Button(
                onClick = onVolver,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Volver a la lista")
            }
        }
    }
}

@Composable
fun DetalleVillano(
    villano: Villano,
    onVolver: () -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item { VillanoCard(villano = villano) }
        item {
            Button(
                onClick = onVolver,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Volver al heroe")
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Utils.Rutas.LISTA
    ) {
        composable(Utils.Rutas.LISTA) {
            ListaSuperHeroes(
                superheroes = listaNombres,
                onVerDetalle = { id ->
                    navController.navigate(Utils.Rutas.detalle(id))
                }
            )
        }

        composable(
            route = Utils.Rutas.DETALLE,
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id") ?: return@composable
            val hero = listaNombres.firstOrNull() { it.id == id } ?: return@composable

            DetalleSuperHeroe(
                hero = hero,
                onVolver = { navController.popBackStack() },
                onVerVillano = { navController.navigate(Utils.Rutas.villano(hero.id)) }
            )
        }
        composable (
            route = Utils.Rutas.VILLANO,
            arguments = listOf(navArgument("heroeId") { type = NavType.IntType })
        ) { backStackEntry ->
            val heroeId = backStackEntry.arguments?.getInt("heroeId") ?: return@composable
            val villano = listaVillanos.firstOrNull { it.heroeId == heroeId } ?: return@composable

            DetalleVillano(
                villano = villano,
                onVolver = { navController.popBackStack() }
            )
        }
    }
}

