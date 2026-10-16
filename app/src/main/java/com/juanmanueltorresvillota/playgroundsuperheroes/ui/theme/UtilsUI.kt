package com.juanmanueltorresvillota.playgroundsuperheroes.ui.theme

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.juanmanueltorresvillota.playgroundsuperheroes.Nombres
import com.juanmanueltorresvillota.playgroundsuperheroes.Villano
import org.w3c.dom.Text

@Composable
fun HeroImage(
    imageUrl: String,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    AsyncImage(
        model = imageUrl,
        contentDescription = contentDescription,
        modifier = modifier
            .fillMaxWidth()
            .height(220.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun HeroInfo(
    hero: Nombres,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "ID: ${hero.id}",
            style = MaterialTheme.typography.labelMedium
        )
        Text(
            text = hero.nombre,
            style = MaterialTheme.typography.displayMedium,
            modifier = modifier.padding(top = 4.dp)
        )
        Text(
            text = hero.descripcion,
            style = MaterialTheme.typography.bodyMedium,
            modifier = modifier.padding(top = 8.dp)
        )
        Text(
            text = "Superpoderes: ${hero.superPoderes.joinToString()}",
            style = MaterialTheme.typography.bodySmall,
            modifier = modifier.padding(top = 8.dp)
        )
    }
}

private fun heroProfile(superPoderes: List<String>): String = when {
    superPoderes.any { it.contains("Inteligencia", ignoreCase = true) } &&
            superPoderes.any { it.contains("Combate", ignoreCase = true) } -> "Estratega"

    superPoderes.any { it.contains("Energia", ignoreCase = true) } -> "Cosmico"
    superPoderes.any { it.contains("Velocidad", ignoreCase = true) } -> "Velocista"
    else -> "Titan"
}

@Composable
fun HeroInfoDetail(
    hero: Nombres,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Bloque principal destacado
        Surface(
            shape = MaterialTheme.shapes.large,
            color = MaterialTheme.colorScheme.primaryContainer
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(56.dp)
                        .background(MaterialTheme.colorScheme.primary, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = hero.nombre.first().uppercase(),
                        color = MaterialTheme.colorScheme.onPrimary,
                        style = MaterialTheme.typography.titleLarge
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "ID: ${hero.id}",
                        style = MaterialTheme.typography.labelMedium
                    )
                    Text(
                        text = hero.nombre,
                        style = MaterialTheme.typography.headlineMedium
                    )
                }
            }
        }

        //Descripcion amplia
        Text(
            text = hero.descripcion,
            style = MaterialTheme.typography.bodyLarge
        )

        //Chips de superpoderes
        Text(
            text = "Superpoderes",
            style = MaterialTheme.typography.titleMedium
        )
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            hero.superPoderes.forEach { poder ->
                AssistChip(
                    onClick = { },
                    label = { Text(poder) }
                )
            }
        }
    }
}

@Composable
fun HeroCard(
    hero: Nombres,
    onClick: (() -> Unit)? = null,
    option: Int = 0,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .then(
                if (onClick != null) {
                    Modifier.clickable { onClick() }
                } else {
                    Modifier
                }
            )
    ) {
        HeroImage(
            imageUrl = hero.imagenUrl,
            contentDescription = hero.nombre
        )
        if (option == 0) {
            HeroInfo(hero = hero)
        } else {
            HeroInfoDetail(hero = hero)
        }
    }
}

@OptIn(ExperimentalLayoutApi::class, ExperimentalMaterial3Api::class)
@Composable
fun VillanoCard(
    villano: Villano,
    modifier: Modifier = Modifier
) {
    Card(modifier = Modifier.fillMaxWidth()) {
        HeroImage(
            imageUrl = villano.imagenUrl,
            contentDescription = villano.nombre
        )
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "VILLANO",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.error
            )
            Text(
                text = villano.nombre,
                style = MaterialTheme.typography.headlineMedium
            )
            Text(
                text = villano.descripcion,
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "Poderes",
                style = MaterialTheme.typography.titleMedium
            )
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                villano.superPoderes.forEach { poder ->
                    AssistChip(onClick = { }, label = { Text(poder) })
                }
            }
        }
    }
}