# Prefinal Rauch 04/07/2025 — progreso

Enunciado: `Prefinal 2025 - Rauch.pdf` (una página). Tema: wallpapers, usuarios, colecciones y carpetas. El usuario trabaja el ejercicio en Java y pide una revisión crítica sin que se le implemente la solución.

## Primera parte revisada

- `Elemento` abstracta comparte título y cantidad de descargas, y declara operaciones para buscar wallpapers, listar palabras clave, contar wallpapers y sumar descargas.
- `Wallpaper` referencia a `Usuario`, guarda año y palabras clave `String`, devuelve una copia de su lista y ordena por nombre de usuario y luego email mediante `Comparable<Wallpaper>`.
- `Colecciones` representa colecciones y carpetas con una lista de `Elemento`. Agrega elementos, devuelve una copia de su lista, busca y cuenta recursivamente, une palabras clave sin repetidos y suma descargas de sus hijos más las propias.
- `Condicion` evalúa `Wallpaper`. Hay condiciones de año, cantidad de descargas, usuario por nombre, palabra clave, AND, OR y NOT.
- Las fuentes compilaron con `javac`. Un caso temporal de ejecución verificó búsqueda por palabra clave ordenada, condición combinada, palabras sin repetidos, conteo y descargas totales en una colección anidada. `App.java` continúa como ejemplo inicial.
- Evaluación de la primera parte: correcta para lo revisado. No es una evaluación final del examen completo.

## Segunda parte: estado y decisión del usuario

- El usuario leyó el requisito de colecciones o carpetas con publicidad. El enunciado exige agregar primero un wallpaper publicitado aunque no cumpla la condición, pero no especifica cómo se elige o identifica ese wallpaper.
- Se discutió como alternativa de diseño que el agrupador con publicidad reciba y guarde una referencia al wallpaper elegido. El usuario considera forzado ese supuesto. También se explicó que `List.add(0, wallpaper)` lo inserta al principio de un listado ya construido.
- **Decisión actual del usuario: no implementar el punto de publicidad.** Respetar esa decisión; no darlo por resuelto ni insistir en implementarlo.
- `WallpaperUniversal` sobrescribe `contienePalabra(String)` y responde `true` a cualquier palabra sin alterar la lista real ni las demás condiciones. `CondicionPalabra` llama ahora a esa operación polimórfica. Se comprobó una búsqueda por palabra ausente y que una condición de año no coincidente lo excluye.
- `MinimalismoPatrocinado` extiende `Colecciones`, recibe un wallpaper patrocinado, lo agrega a cada búsqueda y ordena el resultado. Se comprobó con una búsqueda por año no coincidente. El recorrido de hijos está duplicado respecto de `Colecciones.listar`; puede simplificarse usando `super.listar(c)`. El constructor no garantiza que el wallpaper recibido se titule “Minimal White Background”; esa elección queda a cargo de quien lo construye.

## Decisiones y ambigüedades

- Una sola clase `Colecciones` representa colecciones y carpetas. El ejemplo del enunciado incluye carpetas dentro de una colección, aunque la descripción inicial de colecciones solo menciona wallpapers y otras colecciones.
- El orden general de las búsquedas puede entrar en tensión con colocar un wallpaper publicitado al inicio, especialmente en agrupadores anidados; queda pendiente solo si se retoma publicidad.
- No se establecieron reglas adicionales para empates completos, elementos repetidos o ciclos en la estructura.

El seguimiento de exámenes anteriores no forma parte de este repositorio; no debe confundirse con Rauch.
