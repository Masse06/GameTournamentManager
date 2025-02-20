# Gestión de un Torneo de Videojuegos 🎮

## Descripción
Este proyecto implementa un sistema para gestionar un torneo de videojuegos utilizando Programación Orientada a Objetos (POO) en Java. Se crea una estructura que permite manejar jugadores, sus puntos y niveles, así como realizar enfrentamientos entre ellos.

## Requisitos
1. **Clase Jugador**
   - **Atributos privados:**
     - `nombre` (String)
     - `nivel` (int, de 1 a 100)
     - `puntos` (int, empieza en 0)

   - **Métodos:**
     - `Jugador(String nombre, int nivel)`: Constructor para inicializar los atributos.
     - `ganarPuntos(int cantidad)`: Suma puntos al jugador.
     - `subirNivel()`: Aumenta el nivel en 1 si el jugador tiene más de 100 puntos.
     - `mostrarInfo()`: Muestra el nombre, nivel y puntos del jugador.

2. **Clase Torneo**
   - **Atributos:**
     - `ArrayList<Jugador> jugadores`: Lista para almacenar los jugadores.

   - **Métodos:**
     - `agregarJugador(Jugador jugador)`: Añade un jugador al torneo.
     - `enfrentarJugadores(String nombre1, String nombre2)`: Busca los jugadores por nombre y asigna 10 puntos extra al jugador con mayor nivel. Si los niveles son iguales, se elige un ganador aleatorio.
     - `mostrarRanking()`: Muestra la lista de jugadores ordenados por puntos.

3. **Clase Main**
   - Crea un torneo.
   - Agrega al menos 3 jugadores.
   - Enfrenta a dos jugadores y observa cómo cambian sus puntos.
   - Muestra el ranking antes y después de los enfrentamientos.

## Reto Extra
Implementa un sistema de premios donde el jugador con más puntos gana un trofeo.

## Cómo ejecutar el programa
1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE favorito.
3. Compila y ejecuta la clase `Main` para iniciar el torneo.

## Tecnologías utilizadas
- Java
- Programación Orientada a Objetos (POO)
