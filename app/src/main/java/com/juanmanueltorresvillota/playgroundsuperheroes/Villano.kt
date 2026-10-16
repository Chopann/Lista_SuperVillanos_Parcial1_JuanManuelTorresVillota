package com.juanmanueltorresvillota.playgroundsuperheroes

data class Villano(
    val id: Int,
    val heroeId: Int,
    val nombre: String,
    val imagenUrl: String,
    val descripcion: String,
    val superPoderes: List<String>
)

val listaVillanos = listOf(
    Villano(
        id = 1,
        heroeId = 1, // Superman
        nombre = "Lex Luthor",
        imagenUrl = "https://static.wikia.nocookie.net/batman/images/6/61/3599328-1297543-actioncomics_luthor177cc3b.jpg/revision/latest?cb=20150809143522&path-prefix=es",
        descripcion = "Genio millonario y empresario de Metrópolis, obsesionado con destruir a Superman.",
        superPoderes = listOf("Inteligencia superior", "Tecnología avanzada", "Estrategia", "Armadura de combate")
    ),
    Villano(
        id = 2,
        heroeId = 2, // Batman
        nombre = "Joker",
        imagenUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQs0p1PGb-79Kctxo-P5bhadSXxRuseb9z2laTBOILt6T9R-aBpcCtRVvw&s=10",
        descripcion = "Criminal caótico de Ciudad Gótica y archienemigo de Batman, conocido por su humor retorcido.",
        superPoderes = listOf("Inteligencia superior", "Manipulación psicológica", "Maestro del engaño", "Química tóxica")
    ),
    Villano(
        id = 3,
        heroeId = 3, // Wonder Woman
        nombre = "Cheetah",
        imagenUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnIx4Gk92UWsMlxQIF0S16fuJRhMyRUOm-W-UKu-KBsYYiiLWQMaRVBP0&s=10",
        descripcion = "Priscilla Rich, una arqueóloga convertida en criatura felina y una de las mayores rivales de Wonder Woman.",
        superPoderes = listOf("Super velocidad", "Agilidad", "Garras afiladas", "Combate cuerpo a cuerpo")
    ),
    Villano(
        id = 4,
        heroeId = 4, // Spider-Man
        nombre = "Green Goblin",
        imagenUrl = "https://static.wikia.nocookie.net/neoencyclopedia/images/6/66/Green_goblin2.jpg/revision/latest?cb=20121219063830",
        descripcion = "Norman Osborn, un empresario que se transforma en el Duende Verde y es el gran enemigo de Spider-Man.",
        superPoderes = listOf("Inteligencia superior", "Super fuerza", "Planeador", "Bombas calabaza")
    ),
    Villano(
        id = 5,
        heroeId = 5, // Iron Man
        nombre = "Mandarin",
        imagenUrl = "https://cdn.marvel.com/content/2x/421mdn_com_crd_01.webp",
        descripcion = "Maestro de artes marciales y estratega que usa diez anillos de poder contra Iron Man.",
        superPoderes = listOf("Inteligencia superior", "Anillos de poder", "Artes marciales", "Estrategia")
    ),
    Villano(
        id = 6,
        heroeId = 6, // Captain Marvel
        nombre = "Thanos",
        imagenUrl = "https://static.wikia.nocookie.net/personajes-de-ficcion-database/images/0/0a/Thanos_Guantelete_del_Infinito.jpg/revision/latest/scale-to-width-down/559?cb=20200905202644&path-prefix=es",
        descripcion = "Titán que busca dominar el universo con el poder de las Gemas del Infinito.",
        superPoderes = listOf("Super fuerza", "Alta resistencia", "Poder cósmico", "Inteligencia superior")
    ),
    Villano(
        id = 7,
        heroeId = 7, // Captain America
        nombre = "Red Skull",
        imagenUrl = "https://static.wikia.nocookie.net/villains/images/0/0c/Red_skull_infobox.webp/revision/latest?cb=20240417011026",
        descripcion = "Líder de la organización Hydra y archienemigo de Captain America.",
        superPoderes = listOf("Estrategia", "Liderazgo", "Combate cuerpo a cuerpo", "Inteligencia")
    ),
    Villano(
        id = 8,
        heroeId = 8, // Thor
        nombre = "Loki",
        imagenUrl = "https://static.wikia.nocookie.net/marveldatabase/images/a/a2/Loki_Laufeyson_%28Earth-616%29_from_Thor_Vol_3_12_0001.jpg/revision/latest/scale-to-width-down/1200?cb=20201011071529",
        descripcion = "Dios del engaño y hermano adoptivo de Thor, siempre buscando el trono de Asgard.",
        superPoderes = listOf("Magia", "Ilusiones", "Cambio de forma", "Inteligencia superior")
    ),
    Villano(
        id = 9,
        heroeId = 9, // Hulk
        nombre = "Abomination",
        imagenUrl = "https://static.wikia.nocookie.net/marveldatabase/images/7/77/Incredible_Hulk_Vol_6_30_Hotz_Second_Printing_Variant.jpg/revision/latest/scale-to-width-down/1200?cb=20260215055934",
        descripcion = "Emil Blonsky, un espía transformado por radiación gamma en un monstruo, rival directo de Hulk.",
        superPoderes = listOf("Super fuerza", "Alta resistencia", "Combate cuerpo a cuerpo")
    ),
    Villano(
        id = 10,
        heroeId = 10, // Black Widow
        nombre = "Taskmaster",
        imagenUrl = "https://static.wikia.nocookie.net/marveldatabase/images/c/c5/Anthony_Masters_%28Earth-616%29_from_Daredevil_Vol_8_23_001.jpg/revision/latest?cb=20260805185041",
        descripcion = "Mercenario capaz de copiar los movimientos de cualquier oponente, enemigo de Black Widow.",
        superPoderes = listOf("Copia de movimientos", "Combate cuerpo a cuerpo", "Maestro de armas", "Estrategia")
    ),
    Villano(
        id = 11,
        heroeId = 11, // Flash
        nombre = "Professor Zoom",
        imagenUrl = "https://static.wikia.nocookie.net/marvel_dc/images/9/9a/Batman_Vol_3_22_Textless_2.jpg/revision/latest?cb=20170504015809",
        descripcion = "Eobard Thawne, el Reverse-Flash: un velocista del futuro obsesionado con destruir la vida de Flash.",
        superPoderes = listOf("Super velocidad", "Viaje en el tiempo", "Vibración molecular", "Inteligencia superior")
    ),
    Villano(
        id = 12,
        heroeId = 12, // Hal Jordan
        nombre = "Sinestro",
        imagenUrl = "https://static.dc.com/dc/files/default_images/Char_Thumb_Sinestro_5c53a7f6ccfd39.94875238.jpg",
        descripcion = "Thaal Sinestro, antiguo Green Lantern que usa un anillo amarillo alimentado por el miedo.",
        superPoderes = listOf("Anillo de poder amarillo", "Control del miedo", "Creación de constructos", "Vuelo")
    ),
    Villano(
        id = 13,
        heroeId = 13, // Aquaman
        nombre = "Black Manta",
        imagenUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAqutpfGnyKhD7mVbaSB3qO37hAOHPYh1b_zxsbC9hs0xXeitLCXWiOBQ&s=10",
        descripcion = "Pirata submarino con una armadura de alta tecnología, enemigo mortal de Aquaman.",
        superPoderes = listOf("Armadura tecnológica", "Rayos láser", "Combate submarino", "Estrategia")
    ),
    Villano(
        id = 14,
        heroeId = 14, // Cyborg
        nombre = "Darkseid",
        imagenUrl = "https://static.wikia.nocookie.net/superman/images/0/00/Darkseid_New_52.png/revision/latest?cb=20140128214200&path-prefix=es",
        descripcion = "Tirano del planeta Apokolips que busca dominar el universo, enemigo de la Liga de la Justicia.",
        superPoderes = listOf("Rayos Omega", "Super fuerza", "Alta resistencia", "Inteligencia superior")
    ),
    Villano(
        id = 15,
        heroeId = 15, // Martian Manhunter
        nombre = "Brainiac",
        imagenUrl = "https://static.dc.com/dc/files/default_images/Char_Thumb_Brainiac_5d7844ba704f97.83305344.jpg",
        descripcion = "Inteligencia alienígena que colecciona planetas y civilizaciones para conservar su conocimiento.",
        superPoderes = listOf("Inteligencia superior", "Tecnología alienígena", "Control mental", "Alta resistencia")
    ),
    Villano(
        id = 16,
        heroeId = 16, // Green Arrow
        nombre = "Deathstroke",
        imagenUrl = "https://static.wikia.nocookie.net/marvel_dc/images/f/fe/Deathstroke_Vol_3_3_Textless.jpg/revision/latest?cb=20141224184026",
        descripcion = "Slade Wilson, mercenario con fuerza y reflejos sobrehumanos, uno de los mayores rivales de Green Arrow.",
        superPoderes = listOf("Super fuerza", "Reflejos sobrehumanos", "Maestro de armas", "Estrategia")
    ),
    Villano(
        id = 17,
        heroeId = 17, // Black Panther
        nombre = "Klaw",
        imagenUrl = "https://www.zonanegativa.com/imagenes/2018/02/Klaw-01.jpg",
        descripcion = "Ulysses Klaw, científico que domina el sonido y busca apoderarse del vibranium de Wakanda.",
        superPoderes = listOf("Control del sonido", "Cuerpo sónico", "Tecnología sónica", "Inteligencia superior")
    ),
    Villano(
        id = 18,
        heroeId = 18, // Doctor Strange
        nombre = "Dormammu",
        imagenUrl = "https://i.redd.it/cgn7pi2xksad1.jpeg",
        descripcion = "Señor de la Dimensión Oscura, entidad mística que busca conquistar la Tierra.",
        superPoderes = listOf("Magia oscura", "Manipulación de energía", "Poder interdimensional", "Alta resistencia")
    ),
    Villano(
        id = 19,
        heroeId = 19, // Scarlet Witch
        nombre = "Mephisto",
        imagenUrl = "https://static0.srcdn.com/wordpress/wp-content/uploads/2022/03/Mephisto-Good-Guy-Heaven-Halo-Featured-Image-2.jpg?w=1200&h=675&fit=crop",
        descripcion = "Demonio manipulador que juega con las almas y el destino de los héroes.",
        superPoderes = listOf("Magia demoníaca", "Manipulación de la realidad", "Engaño", "Inmortalidad")
    ),
    Villano(
        id = 20,
        heroeId = 20, // Vision
        nombre = "Ultron",
        imagenUrl = "https://thecomicdenllc.com/cdn/shop/files/061ult_com_cut_dsk_01.jpg?v=1753811647&width=1500",
        descripcion = "Inteligencia artificial rebelde que decide destruir a la humanidad y creador de Vision en los cómics.",
        superPoderes = listOf("Inteligencia artificial", "Super fuerza", "Rayos de energía", "Autorreparación")
    )

)