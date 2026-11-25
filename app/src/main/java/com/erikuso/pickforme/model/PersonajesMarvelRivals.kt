package com.erikuso.pickforme.model

val personajesMarvelRivals = listOf(
    Personaje(
        nombre = "Adam Warlock",
        siglas = "AW",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Ser cósmico creado de forma artificial, que acabó convirtiéndose en un protector del universo. Controla una energía capaz de curar a sus aliados y de devolver la vida a los caídos.",
        habilidades = listOf("Soul Bond", "Avatar Life Stream", "Regenerative Cocoon", "Cosmic Cluster", "Karmic Revival"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10460010-avatar-89c71e.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1046-fullbody-1cc1e3.webp"
    ),
    Personaje(
        nombre = "Angela",
        siglas = "AN",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Hija de Odín y guerrera asgardiana conocida como la Mano de Heven. Convierte los Ichors divinos en armas y surca los cielos para juzgar a sus enemigos.",
        habilidades = listOf("Seraphic Soar", "Shielded Stance", "Assassin's Charge", "Divine Judgement", "Heven's Retribution"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10560010-avatar-1e8947.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1056-fullbody-f049d8.webp"
    ),
    Personaje(
        nombre = "Black Cat",  // REVISAR
        siglas = "BC",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Felicia Hardy, una de las mejores ladronas del mundo, que se mueve con rapidez y elegancia para robar la fortuna de sus rivales.",
        habilidades = listOf("Malkin Misfortune", "Turn of Fortune", "Cat's Cradle", "Fortune's Favor", "Calling Card"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10610010-avatar-4fecab.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10610010-hero-4f933d.webp"
    ),
    Personaje(
        nombre = "Black Panther",
        siglas = "BP",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Rey de Wakanda y protector de su pueblo, que combina un traje de vibranio con la fuerza de una antigua tradición. Es un guerrero ágil y silencioso que se mueve entre los enemigos con una precisión letal.",
        habilidades = listOf("Sprint Rend", "Spinning Kick", "Subtle Step", "Spear Toss", "Bast's Descent"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10260010-avatar-a8a0bc.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1026-fullbody-24272b.webp"
    ),
    Personaje(
        nombre = "Black Widow",
        siglas = "BW",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Espía rusa entrenada en la Habitación Roja que dejó atrás su pasado para trabajar de parte de los héroes. Es experta en combate cuerpo a cuerpo y en tiro de precisión, y sus gadgets le dan ventaja en cualquier terreno.",
        habilidades = listOf("Widow's Bite Baton", "Electro-Plasma Explosion", "Fleet Foot", "Red Room Rifle", "Edge Dancer"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10330010-avatar-59b22a.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10330010-hero-522cfe.webp"
    ),
    Personaje(
        nombre = "Blade",
        siglas = "BL",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Eric Brooks, mitad humano y mitad vampiro, un cazador que viaja entre mundos con la espada de Drácula.",
        habilidades = listOf("Daywalker Dash", "Bloodline Awakening", "Scarlet Shroud", "Hunter's Shotgun", "Thousand-Fold Slash"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10440010-avatar-690a91.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1044-fullbody-462309.webp"
    ),
    Personaje(
        nombre = "Captain America",
        siglas = "CA",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Soldado reconvertido en símbolo de libertad tras recibir el suero del supersoldado. Lidera desde primera línea con su escudo de vibranio y su inquebrantable sentido de la justicia.",
        habilidades = listOf("Vibranium Energy Saw", "Leading Dash", "Liberty Rush", "Super-Soldier Slam", "Freedom Charge"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10220010-avatar-5de0fb.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1022-fullbody-6d8f26.webp"
    ),
    Personaje(
        nombre = "Cloak & Dagger",
        siglas = "CD",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Dos jóvenes unidos por los poderes de la luz y la oscuridad. Dagger lanza dagas de luz que curan, mientras Cloak se desplaza entre las sombras y atrapa a los enemigos en su capa.",
        habilidades = listOf("Lightforce Dagger", "Veil of Lightforce", "Dark Teleportation", "Terror Cape", "Eternal Bond"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10250010-avatar-73e81a.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10250010-hero-a9f34b.webp"
    ),
    Personaje(
        nombre = "Cyclops",
        siglas = "CY",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Scott Summers, líder de los X-Men, que mantiene bajo control su rayo ocular con un visor de cuarzo rubí.",
        habilidades = listOf("Kinetic Hover", "Ricochet Force", "Propulsion Burst", "Optic Ascent", "Ruby Rage"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10630010-avatar-fe6157.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10630010-hero-0ab873.webp"
    ),
    Personaje(
        nombre = "Daredevil",  // REVISAR
        siglas = "DA",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Matt Murdock, un abogado que quedó ciego de niño y que gracias a sus sentidos agudizados combate el crimen como Daredevil.",
        habilidades = listOf("Radar Sense", "Sonic Pursuit", "Objection!", "Devil's Latch", "Let The Devil Out"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10550010-avatar-4cff90.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10550010-hero-dda5c4.webp"
    ),
    Personaje(
        nombre = "Deadpool",
        siglas = "DP",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Wade Wilson, un mercenario bocazas con mucha potencia de fuego, un escudo mágico y un factor de curación que casi no se agota.",
        habilidades = listOf("Healing Factor", "Magical Unicorn Shield!", "Deadpool In Your Area", "Slice And Dice!", "Skill Issue"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10570010-avatar-b67b1d.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1057-fullbody-e59500.webp"
    ),
    Personaje(
        nombre = "Devil Dinosaur",  // REVISAR
        siglas = "DD",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Gigantesco dinosaurio de color rojo que protege a su compañera Moon Girl. Se lanza al combate con una ferocidad primitiva y destroza a todo lo que se interpone en su camino.",
        habilidades = listOf("Primal Bite", "Impact Beam", "Savage Predation", "Buddy Barrier", "Devil-Beast Rampage"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10620010-avatar-71334b.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10620010-hero-56b74b.webp"
    ),
    Personaje(
        nombre = "Doctor Strange",
        siglas = "DS",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Hechicero Supremo de la Tierra, que dejó atrás la medicina para dominar las artes místicas. Protege a su equipo con escudos y portales mientras controla la magia que atraviesa las dimensiones.",
        habilidades = listOf("Eye of Agamotto", "Shield of the Seraphim", "Maelstrom of Madness", "Cloak of Levitation", "Pentagram of Farallah"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10180010-avatar-8e5396.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1018-fullbody-d02070.webp"
    ),
    Personaje(
        nombre = "Elsa Bloodstone",  // REVISAR
        siglas = "EB",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Heredera de una familia de legendarios cazamonstruos, con gran fuerza física y talento para capturar criaturas peligrosas.",
        habilidades = listOf("Inherited Instinct", "Ruthless Pursuit", "Helix Advance", "Living Bullet", "Smoky Snare"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10590010-avatar-30c037.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10590010-hero-e9aca6.webp"
    ),
    Personaje(
        nombre = "Emma Frost",
        siglas = "EF",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Para Emma Frost, la guerra es la forma más pura de arte. Con sus formidables habilidades telepáticas, teje intrincadamente una red mental mortal que atrapa a sus enemigos, mientras que su indestructible forma de diamante le permite liderar a sus compañeros sin miedo a la refriega. ¡Siempre elegante y serena, Emma reina como la única y verdadera reina del campo de batalla!",
        habilidades = listOf("Pulso Telepático", "Escudo Mental", "Forma de Diamante", "Lanza Psíquica", "Seducción Psiónica"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10530010-avatar-75d2f7.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1053-fullbody-45670f.webp"
    ),
    Personaje(
        nombre = "Gambito",
        siglas = "G",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Encantador y de espíritu libre, Remy LeBeau manipula la energía cinética con una habilidad incomparable. Con un movimiento de muñeca, sus cartas de juego cargadas se convierten en proyectiles explosivos para los enemigos o curan a sus aliados mediante el cambio cinético. Cuando el carismático Gambito ilumina el campo de batalla, ¡siempre juega para ganar!",
        habilidades = listOf("Embestida del Bayou", "Carga Cajún", "Corazones Curativos", "Rompiendo Picas", "Escalera Real Furiosa"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10580010-avatar-46f006.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1058-fullbody-d08b9d.webp"
    ),
    Personaje(
        nombre = "Gorr The God Butcher",
        siglas = "GG",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Gorr, un villano que blande la All-Black Necrosword y convierte la carne de los dioses caídos en un ejército de berserkers negros.",
        habilidades = listOf("Symbiote Swarm", "Shadow Harvest", "Living Abyss", "Black Berserker", "All-Black"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10670010-avatar-789d44.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10670010-hero-69fe62.webp"
    ),
    Personaje(
        nombre = "Groot",
        siglas = "GR",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Extraterrestre con forma de árbol y miembro de los Guardianes de la Galaxia. Aunque solo sabe decir tres palabras, protege a sus amigos con muros de madera y raíces que aprisionan a los enemigos.",
        habilidades = listOf("Strangling Prison", "Thornlash Wall", "Ironwood Wall", "Spore Bomb", "Flora Colossus"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10270010-avatar-e4b57f.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1027-fullbody-909eb6.webp"
    ),
    Personaje(
        nombre = "Hawkeye",  // REVISAR
        siglas = "HE",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Clint Barton, arquero sin poderes y miembro de los Vengadores, que compensa con una puntería casi perfecta. Usa flechas de todo tipo para controlar el campo de batalla desde la distancia.",
        habilidades = listOf("Blast Arrow", "Piercing Arrow", "Ronin Slash", "Hypersonic Arrow", "Hunter's Sight"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10210010-avatar-2350d7.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10210010-hero-ed342b.webp"
    ),
    Personaje(
        nombre = "Hela",
        siglas = "HL",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Diosa asgardiana de la muerte y hermana mayor de Thor. Ejerce su dominio sobre los muertos y emplea sus cuchillas y cuervos para cazar a los vivos.",
        habilidades = listOf("Piercing Night", "Soul Drainer", "Astral Flock", "Hel's Descent", "Nastrond Crowstorm"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10240010-avatar-441cb6.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1024-fullbody-4e5a0b.webp"
    ),
    Personaje(
        nombre = "Hulk",  // REVISAR
        siglas = "HK",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Bruce Banner, un científico que se transforma en una criatura de fuerza descomunal cuando pierde el control. Su ira lo vuelve imparable en primera línea, aunque el doctor Banner sigue aprovechando su ingenio en la batalla.",
        habilidades = listOf("Heavy Blow", "Indestructible Guard", "Incredible Leap", "Gamma Burst", "World Breaker"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10110010-avatar-d9bfda.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1011-fullbody-895db6.webp"
    ),
    Personaje(
        nombre = "Human Torch",
        siglas = "HT",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Johnny Storm, miembro de los Cuatro Fantásticos que puede envolver su cuerpo en llamas y volar. Es impulsivo, bromista y siempre va por delante de su equipo con su fuego.",
        habilidades = listOf("Blazing Blast", "Pyro-Prison", "Flaming Meteor", "Plasma Body", "Supernova"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10170010-avatar-6e3bf5.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10170010-hero-7197b0.webp"
    ),
    Personaje(
        nombre = "Invisible Woman",
        siglas = "IW",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Sue Storm, miembro de los Cuatro Fantásticos con poder para volverse invisible y crear campos de fuerza. Protege y cura a sus aliados mientras manipula el espacio que los rodea.",
        habilidades = listOf("Orb Projection", "Guardian Shield", "Psionic Vortex", "Veiled Step", "Invisible Boundary"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10500010-avatar-11aeba.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10500010-hero-92b312.webp"
    ),
    Personaje(
        nombre = "Iron Fist",  // REVISAR
        siglas = "IF",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Danny Rand, heredero de una gran fortuna que se entrenó en la ciudad mística de K'un-L'un. Concentra su chi en el puño para golpear con una fuerza y una velocidad extraordinarias.",
        habilidades = listOf("Yat Jee Chung Kuen", "K'un-Lun Kick", "Harmony Recovery", "Dragon's Defense", "Living Chi"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10520010-avatar-1dc45d.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1052-fullbody-3d278c.webp"
    ),
    Personaje(
        nombre = "Iron Man",
        siglas = "IM",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Tony Stark, un genio multimillonario que construyó su propia armadura para luchar. Ataca desde el aire con repulsores y misiles, ajustando su traje al combate.",
        habilidades = listOf("Repulsor Blast", "Unibeam", "Hyper-Velocity", "Micro-Missile Barrage", "Armor Overdrive"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10340010-avatar-78a624.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1034-fullbody-9e7caf.webp"
    ),
    Personaje(
        nombre = "Jeff the Land Shark",
        siglas = "JF",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Adorable tiburón terrestre mascota de Lyla Lockjaw. Cura a sus aliados con chorros de agua y los envuelve en burbujas mientras se esconde de los enemigos.",
        habilidades = listOf("Joyful Splash", "Aqua Burst", "Hide and Seek", "Healing Bubble", "It's Jeff!"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10470010-avatar-dd5547.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1047-fullbody-a193de.webp"
    ),
    Personaje(
        nombre = "Jubilee",
        siglas = "JU",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Jubilation Lee, una mutante que crea plasma pirotécnico y lo convierte en fuegos artificiales luminosos.",
        habilidades = listOf("Blooming Ball", "Sparking Sprint", "Dazzling Detonation", "Firework Finale", "Sparkle Mark"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10640010-avatar-3048cd.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10640010-hero-871ba2.webp"
    ),
    Personaje(
        nombre = "Loki",
        siglas = "LK",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Dios asgardiano de las travesuras y hermano adoptivo de Thor. Engaña a sus rivales con ilusiones y dobles, y es capaz de curar a quien le conviene en su beneficio.",
        habilidades = listOf("Mystical Missile", "Doppelganger", "Devious Exchange", "Deception", "Regeneration Domain"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10160010-avatar-44ce46.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1016-fullbody-19719f.webp"
    ),
    Personaje(
        nombre = "Luna Snow",
        siglas = "LS",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Seol Hee, una estrella del K-pop coreana que consiguió poderes de hielo tras un accidente. Cura y protege a sus aliados con melodías heladas, y su actuación final congela a los enemigos.",
        habilidades = listOf("Ice Arts", "Fate of Both Worlds", "Share the Stage", "Smooth Skate", "Absolute Zero"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10310010-avatar-6bff83.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1031-fullbody-dc4845.webp"
    ),
    Personaje(
        nombre = "Magik",  // REVISAR
        siglas = "MG",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Illyana Rasputina, una joven mutante rusa que pasó años en el Limbo y regresó con una espada mística. Abre portales entre dimensiones y se teletransporta para sorprender a sus enemigos.",
        habilidades = listOf("Soulsword", "Stepping Discs", "Umbral Incursion", "Eldritch Whirl", "Limbo's Might"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10290010-avatar-52ad81.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1029-fullbody-b7e889.webp"
    ),
    Personaje(
        nombre = "Magneto",
        siglas = "MN",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Erik Lehnsherr, un mutante con control total sobre el magnetismo. Dobla el metal a su voluntad para defenderse y lanzar proyectiles a sus enemigos.",
        habilidades = listOf("Iron Volley", "Metallic Curtain", "Metal Bulwark", "Mag-Cannon", "Meteor M"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10370010-avatar-1c8116.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1037-fullbody-6195df.webp"
    ),
    Personaje(
        nombre = "Mantis",
        siglas = "MT",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Maestra de las artes marciales y empática, que acompaña a los Guardianes de la Galaxia. Cura a sus aliados con la energía de la vida y duerme a sus enemigos con esporas.",
        habilidades = listOf("Life Energy Blast", "Spore Slumber", "Allied Inspiration", "Natural Anger", "Soul Resurgence"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10200010-avatar-e37bfe.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1020-fullbody-fd688c.webp"
    ),
    Personaje(
        nombre = "Mister Fantastic",  // REVISAR
        siglas = "MF",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Reed Richards, un científico genial que puede estirar su cuerpo a voluntad. Es líder de los Cuatro Fantásticos y ataca a distancia con golpes elásticos.",
        habilidades = listOf("Stretch Punch", "Distended Grip", "Flexible Elongation", "Brainiac Bounce", "Reflexive Rubber"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10400010-avatar-09fd4e.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10400010-hero-ddaa00.webp"
    ),
    Personaje(
        nombre = "Moon Knight",
        siglas = "MK",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Al ser el avatar del dios egipcio de la venganza, el mismísimo Konshu mejoró el cuerpo de Marc Spector. Moon Knight, envuelto en un aura luminosa que atraviesa la oscuridad, surca la noche, listo para hacer arder a sus enemigos con los Ankhs sagrados de su maestro.",
        habilidades = listOf("Dardo Creciente", "Cuchilla Lunar", "Gancho Lunar", "Ankh Ancestral", "Mano de Khonshu"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10300010-avatar-d6c319.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1030-fullbody-4612da.webp"
    ),
    Personaje(
        nombre = "Namor",
        siglas = "NM",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Rey de Atlantis y líder de los mares, orgulloso y de temperamento volátil. Domina las criaturas del océano y combate con su tridente.",
        habilidades = listOf("Trident of Neptune", "Horn of Proteus", "Blessing of the Deep", "Aquatic Dominion", "Wrath of the Seven Seas"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10450010-avatar-9c7289.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1045-fullbody-4b2527.webp"
    ),
    Personaje(
        nombre = "Nightcrawler",
        siglas = "NC",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Aunque parece un demonio, es compasivo y cree que todos pueden redimirse; se teletransporta para guiar a sus aliados fuera de la oscuridad.",
        habilidades = listOf("Three-Sword Style", "Swift Intervention", "Smoke Shift", "Tandem Teleport", "Crawler Cling"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10680010-avatar-0dd78d.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10680010-hero-31cd37.webp"
    ),
    Personaje(
        nombre = "Peni Parker",
        siglas = "PP",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Joven genio que pilota un traje robot sincronizado con una araña radiactiva. Protege a su equipo con telarañas y minas que frenan a sus rivales.",
        habilidades = listOf("Cyber-Web Cluster", "Bionic Spider-Nest", "Arachno-Mine", "Cyber-Bond", "Spider-Sweeper"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10420010-avatar-09715c.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1042-fullbody-34f5c2.webp"
    ),
    Personaje(
        nombre = "Phoenix",
        siglas = "PH",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Jean Grey, una psíquica poderosa que alberga a la Fuerza Fénix y recorre el cosmos como fuerza de creación y destrucción.",
        habilidades = listOf("Psionic Detonation", "Dark Ascent", "Telepathic Illusion", "Cosmic Flames", "Endsong Inferno"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10540010-avatar-d4fc4f.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10540010-hero-9e07b7.webp"
    ),
    Personaje(
        nombre = "Psylocke",  // REVISAR
        siglas = "PS",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Betsy Braddock, una telépata británica convertida en ninja gracias a una intervención de la Mano. Combina ataques psíquicos con cuchillas de energía y movimientos sigilosos.",
        habilidades = listOf("Psy-Blade Dash", "Psychic Stealth", "Wing Shurikens", "Psionic Crossbow", "Dance of the Butterfly"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10480010-avatar-20212a.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1048-fullbody-2e72fe.webp"
    ),
    Personaje(
        nombre = "Rocket Raccoon",
        siglas = "RR",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Mapache modificado genéticamente, mecánico genial y miembro de los Guardianes de la Galaxia. Cura o dispara desde sus dos modos de combate y puede devolver a sus aliados al combate.",
        habilidades = listOf("Bombard Mode", "Repair Mode", "C.Y.A. - Cosmic Yarn Amplifier", "Jetpack Dash", "B.R.B. - Battle Rebirth Beacon"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10230010-avatar-3c9ebd.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1023-fullbody-d7511a.webp"
    ),
    Personaje(
        nombre = "Rogue",  // REVISAR
        siglas = "RO",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Anna Marie, que absorbe los poderes ajenos con solo tocar, y cuya fuerza se disparó tras tocar Cronovio puro.",
        habilidades = listOf("Defensive Stance", "Southern Brawl", "Chrono Kick Combo", "Fatal Attraction", "Power Surge Punch"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10650010-avatar-fee34a.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10650010-hero-0f088c.webp"
    ),
    Personaje(
        nombre = "Scarlet Witch",
        siglas = "SW",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Wanda Maximoff, una mujer que manipula la realidad con su magia del caos. Lanza proyectiles místicos, mueve objetos con su mente y puede borrar la realidad en su ataque más devastador.",
        habilidades = listOf("Chaos Control", "Mystic Projection", "Dark Seal", "Chthonian Burst", "Reality Erasure"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10380010-avatar-ebe172.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1038-fullbody-fd5173.webp"
    ),
    Personaje(
        nombre = "Spider-Man",  // REVISAR
        siglas = "SM",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Peter Parker, un joven que ganó poderes arácnidos tras la picadura de una araña radiactiva. Se balancea con sus telarañas y combina golpes ágiles con un sentido arácnido que anticipa el peligro.",
        habilidades = listOf("Web-Cluster", "Web-Swing", "Get Over Here!", "Spectacular Spin", "Spider-Power"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10360010-avatar-3d57b9.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1036-fullbody-a2b801.webp"
    ),
    Personaje(
        nombre = "Squirrel Girl",  // REVISAR
        siglas = "SG",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Doreen Green, una joven con rasgos de ardilla, siempre optimista y capaz de vencer a los villanos más temibles. Combate con su ejército de ardillas y su cola.",
        habilidades = listOf("Burst Acorn", "Squirrel Blockade", "Mammal Bond", "Tail Bounce", "Unbeatable Squirrel Tsunami"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10320010-avatar-3e55fa.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10320010-hero-bb3baf.webp"
    ),
    Personaje(
        nombre = "Star-Lord",
        siglas = "SL",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Peter Quill, el líder de los Guardianes de la Galaxia, mitad humano y mitad extraterrestre. Dispara dos pistolas de elementos y vuela con sus botas propulsoras.",
        habilidades = listOf("Element Guns", "Rocket Propulsion", "Stellar Shift", "Galactic Legend", "Blaster Barrage"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10430010-avatar-36f37e.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1043-fullbody-fff5cd.webp"
    ),
    Personaje(
        nombre = "Storm",
        siglas = "ST",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Ororo Munroe, una mutante capaz de controlar el clima, criada como diosa en África. Invoca rayos, vientos y huracanes y los usa para dominar el campo de batalla.",
        habilidades = listOf("Wind Blade", "Weather Control", "Bolt Rush", "Goddess Boost", "Omega Hurricane"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10150010-avatar-0aaccf.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1015-fullbody-02ac9f.webp"
    ),
    Personaje(
        nombre = "The Hood",
        siglas = "HD",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Parker Robbins, cubierto por un manto maldito, que se abre paso hacia el trono del crimen alimentándose del poder de sus víctimas.",
        habilidades = listOf("Ruinous Pact", "Leaded Transformation", "Mantle Of Oblivion", "Abyssal Veil", "Demon Of The End"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10660010-avatar-cbb31b.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10660010-hero-e7fba4.webp"
    ),
    Personaje(
        nombre = "The Punisher",
        siglas = "TP",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Frank Castle, un ex marine que sale a por criminales tras perder a su familia. Dispara a mansalva y se apoya en torretas y granadas para dominar el terreno.",
        habilidades = listOf("Adjudication", "Scourge Grenade", "Vantage Connection", "Culling Turret", "Final Judgement"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10140010-avatar-094f12.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1014-fullbody-7d920c.webp"
    ),
    Personaje(
        nombre = "The Thing",
        siglas = "TT",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Ben Grimm, piloto y miembro de los Cuatro Fantásticos transformado en una criatura de roca. Su carácter es tan duro como su cuerpo, y es famoso por su grito de guerra, ¡Es la hora de las tortas!",
        habilidades = listOf("Rocky Jab", "Clobberin' Time", "Embattled Leap", "Stone Haymaker", "Yancy Street Charge"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10510010-avatar-d4f14b.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10510010-hero-b28ce7.webp"
    ),
    Personaje(
        nombre = "Thor",
        siglas = "TH",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Dios del trueno de Asgard y miembro de los Vengadores, poseedor de Mjolnir. Se lanza a primera línea con su martillo y atrae los rayos a su favor.",
        habilidades = listOf("Hammer Throw", "Storm Surge", "Lightning Realm", "Awakening Rune", "Thorforce"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10390010-avatar-b9eb60.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1039-fullbody-b44ea4.webp"
    ),
    Personaje(
        nombre = "Ultron",
        siglas = "UL",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Inteligencia artificial que aprende y se adapta muy por encima de lo humano y que usa ejércitos de drones para inclinar la balanza.",
        habilidades = listOf("Imperative: Firewall", "Dynamic Flight", "Imperative: Patch", "Encephalo-Ray", "Rage Of Ultron"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10280010-avatar-24b20c.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10280010-hero-325cf9.webp"
    ),
    Personaje(
        nombre = "Venom",
        siglas = "VN",
        juego = "Marvel Rivals",
        rol = Rol.TANQUE,
        descripcion = "Eddie Brock, un periodista unido a un simbionte alienígena que lo vuelve violento y casi indestructible. Se balancea con tentáculos y devora a sus rivales.",
        habilidades = listOf("Venom Swing", "Dark Predation", "Cellular Corrosion", "Frenzied Arrival", "Feast of the Abyss"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10350010-avatar-d5c604.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1035-fullbody-431007.webp"
    ),
    Personaje(
        nombre = "White Fox",  // REVISAR
        siglas = "WF",
        juego = "Marvel Rivals",
        rol = Rol.SOPORTE,
        descripcion = "Ami Han, la última de los Kumiho, que usa su poder ancestral de nueve colas para curar a sus aliados.",
        habilidades = listOf("Spectral Surge", "Fox Form Awakening", "Spirit Sanctuary", "Ninefold Slam", "Kumiho Unleashed"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10600010-avatar-0dcb08.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-prestige-10600010-hero-c266f5.webp"
    ),
    Personaje(
        nombre = "Winter Soldier",
        siglas = "WS",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Bucky Barnes, un soldado reconvertido en asesino del régimen soviético y ahora en busca de redención. Su brazo biónico le da una gran fuerza y un gancho con el que atrapa a sus rivales.",
        habilidades = listOf("Roterstern", "Trooper's Fist", "Tainted Voltage", "Bionic Hook", "Kraken Impact"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10410010-avatar-be589c.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1041-fullbody-8bac0b.webp"
    ),
    Personaje(
        nombre = "Wolverine",  // REVISAR
        siglas = "WV",
        juego = "Marvel Rivals",
        rol = Rol.DPS,
        descripcion = "Logan, un mutante con garras de adamantium y un factor curativo que lo hace casi inmortal. Es un guerrero salvaje que se lanza contra sus enemigos sin miedo.",
        habilidades = listOf("Savage Claw", "Feral Leap", "Undying Animal", "Berserker Rage", "Last Stand"),
        imagenUr1 = "https://cdn.source.gs/marvel-rivals/img/img-squarehead-10490010-avatar-0759ca.webp",
        imagenSplashArt = "https://cdn.source.gs/marvel-rivals/img/img-heroportrait-1049-fullbody-ab8d86.webp"
    )
)