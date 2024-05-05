# Practica-Final-1
https://github.com/Pizarman13/Practica-Final-1.git
Aplicación para gestionar cultivos de bacterias de Diego Pizarro Garrido

Todo se ejecuta en el Main.

La aplicación se ejecutará en consola, ya que en un inicio empecé haciéndolo con Swing, pero debido a una serie de problemas que me dio, me decanté por esta opción.

He planteado la aplicación únicamente con 3 clases: la clase Experimento y la clase PoblacionBacterias se encuentran dentro del paquete CultivoBacterias y fuera de este paquete se encuentra la clase Main en la que se ejecuta todo.

En la clase Experimento se encuentran casi todos los métodos necesarios para la aplicación. En primer instancia encontramos el método regulacionLinealComida(), al cual debemos introducirle un día; este día actuará como un indicador hasta el cual la comida crecerá linealmente y al llegar a este día la comida disminuirá linealmente hasta el día 30.

El método visualizarComida() muestra la cantidad de comida que se ha proporcionado cada día.

El método añadirPoblacionBacterias() pide un objeto de la clase PoblacionBacterias. Este método crea un array auxiliar de PoblacionBacterias con los atributos del objeto introducido; su longitud es la del array PoblacionBacteriana + 1. Usamos un bucle for para llenar el array auxiliar con los objetos ya existentes y modificamos el valor del atributo poblacionBacteriana por el del array auxiliar.

El método borrarPoblacionBacterias() requiere un nombre. Se compara este nombre con el nombre de las poblaciones. Si este coincide con algún nombre, este método utiliza un array auxiliar donde guardará todos los objetos menos el objeto que tenga ese nombre, sustituyendo el valor de poblacionBacteriana por el del array auxiliar.

El método visualizarNombresPoblaciones() recorre el array poblacionBacteriana devolviendo su nombre.

El método verDetallesPoblacion() pide un nombre. Se compara este nombre con el nombre de las poblaciones. Si coincide, muestra la información de esta.

Métodos de manejo de archivos:
El método para guardarExperimento() primero verifica que el nombre del archivo no sea nulo. Si es nulo, el método termina (Esto está hecho así para que el primer guardado sea un "guardar como"). Si el nombre del archivo no es nulo, se crea un ObjectOutputStream, el cual se utiliza para escribir el objeto especificado por el nombre.

El método guardarExperimentoComo() pide una ruta y se la da al archivo. Tras esto, llama al método guardarExperimento().

El método cargarExperimento() devuelve un experimento y pide un nombre. Se encarga de cargar un objeto Experimento desde un archivo. Para que este método funcione, es necesario implementar Serializable en la clase Experimento.

Main:
En el Main he creado un menú con 3 opciones: Abrir un archivo con un experimento, crear un nuevo experimento y salir. Según la opción que elijas, te pedirá diferentes cosas para que se realice la opción que has elegido. Pero la primera y la segunda opción tienen en común que en cierto punto llamarán al método abrirExperimento(), el cual requiere la introducción de un objeto experimento, y este método nos proporcionará otro menú con todo lo que nos pide la aplicación, llamando a los métodos creados en la clase Experimento.

Errores conocidos:
A la hora de seleccionar la opción de guardar normal no encuentra el archivo.
Si a la hora de introducir la fecha inicial esta no coincide con el formato presentado, dará error.

Conclusión:
Esta práctica me ha llevado más tiempo del que me esperaba, en parte por una mala gestión mía y porque al principio no sabía muy bien cómo plantearla. Desde un principio tenía una idea clara de cómo quería que acabase siendo la app, pero tenía dudas de cómo empezarla para que acabase siendo como la había visualizado.
