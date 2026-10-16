# Playground Superheroes

Aplicación Android desarrollada con **Kotlin** y **Jetpack Compose** que muestra un catálogo de superhéroes con su información, y permite consultar a su respectivo villano.

## Funcionalidades

- Lista de **50 superhéroes** con imagen, nombre y descripción.
- Pantalla de detalle de cada héroe con su descripción completa y sus superpoderes.
- Sección de **villanos**: cada héroe que tiene villano asignado permite ver su información desde su pantalla de detalle.
- Navegación entre pantallas con Navigation Compose.
- Carga de imágenes desde internet con Coil.

## Cómo ver a los villanos

1. Abre la aplicación. Se mostrará la **lista de superhéroes**.
2. Toca la tarjeta del héroe que quieras consultar para abrir su **detalle**.
3. Desplázate hacia abajo y pulsa el botón rojo **"Ver su villano"**.
4. Se abrirá la pantalla del villano, con su imagen, descripción y superpoderes.
5. Pulsa **"Volver al héroe"** para regresar al detalle del héroe, y **"Volver a la lista"** para regresar al listado principal.

### Cobertura de villanos

De los **50 héroes** disponibles en la aplicación, solo se agregó villano a **20** de ellos. Los otros 30 héroes todavía no tienen un villano asignado.

## Cómo funciona la relación héroe - villano

Cada villano guarda el `id` del héroe al que pertenece en el campo `heroeId`:

```kotlin
data class Villano(
    val id: Int,
    val heroeId: Int,        // id del héroe al que pertenece
    val nombre: String,
    val imagenUrl: String,
    val descripcion: String,
    val superPoderes: List<String>
)
```

Al pulsar "Ver su villano", la app navega a la ruta `villano/{heroeId}` y busca en `listaVillanos` el villano cuyo `heroeId` coincida con el del héroe seleccionado.

## Estructura del proyecto

| Archivo | Contenido |
|---------|-----------|
| `Nombres.kt` | Modelo `Nombres` (héroe) y `listaNombres` |
| `Villano.kt` | Modelo `Villano` y `listaVillanos` |
| `Utils.kt` | Objeto `Rutas` con las rutas de navegación (`LISTA`, `DETALLE`, `VILLANO`) |
| `MainActivity.kt` | `ListaSuperHeroes`, `DetalleSuperHeroe`, `DetalleVillano` y `AppNavigation` |
| `ui/theme/UtilsUI.kt` | Componentes reutilizables: `HeroImage`, `HeroInfo`, `HeroInfoDetail`, `HeroCard` y `VillanoCard` |

## Cómo agregar un villano nuevo

1. Abre `Villano.kt`.
2. Agrega un nuevo `Villano(...)` dentro de `listaVillanos`, con un `id` que no se repita.
3. En `heroeId` coloca el `id` del héroe al que pertenece (el mismo que tiene en `listaNombres`).
4. Para la imagen, usa una URL de la API con el formato `.../api/images/lg/ID-nombre.jpg`.



## Autor

Juan Manuel Torres Villota
