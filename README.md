# trabajo-usuario-git-Object-Oriented-Programming-semana1-script

kevin andrey angarita sanjuan

explicacion3:
ADMINISTRADOR:
Es un Usuario con permisos especiales para gestionar el sistema. Este da una herencia a el Usuario, tiene métodos para gestionar notas.
EJEMPLO: quien modifica y gestiona los permisos de usuarios y profesores.


MAIN:
Es un punto de entrada que nos ayuda a probar todas las clases.
crea los objetos administrador, profesor y Usuario. Ejecuta los métodos de cada objeto y nos muestra los resultados
EJEMPLO: ejecuta el programa simulando el comportamiento de todos.


PROFESOR:
simula un profesor que gestiona las notas de una materia asignada.
tiene unos atributos para el Nombre, Materia y notas. Tiene un Constructor para iniciar los datos al crear el objeto y tiene permisos para crear, editar, borrar y gestionar notas de su materia
EJEMPLO: un Profesor necesita calificar una nota de un estudiante, este lo puede realizar debido a sus permisos.


USUARIO:
este representa a un estudiante el cual cuenta con permisos para iniciar sección, leer notas y cerrar sección. Este almacena datos privados como nombre, id y contraseña con getters para acceder a la información
tiene un constructor que inicia la información del usuario.
EJEMPLO: cualquier persona que cuente con usuario podrá ingresar a revisar sus notas.
