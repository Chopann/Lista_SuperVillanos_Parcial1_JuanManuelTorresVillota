package com.juanmanueltorresvillota.playgroundsuperheroes

object Utils {
    object Rutas {
        const val LISTA = "lista"

        const val  VILLANO = "villano/{heroeId}"
        fun villano(heroeId: Int) = "villano/$heroeId"

        const val DETALLE = "detalle/{id}"

        fun detalle(id: Int) = "detalle/$id"
    }
}