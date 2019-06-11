# Proyecto-1-Java-BBDD Luca Tic Formación Java Junio 2019

Grupo formado por: David, Luis, Raul y Andrea ----
Desarrollo de programa en Java para gestión y administracción de BBDD

<h1>BACKLOG</h1>

1- Alta usuario<br />
2- Modificar usuario<br />
3- Dar de baja usuario <br />
4- Listar todos los usuarios <br />
5- Crear peliculas nuevas <br />
6- Listar peliculas <br />
7- Dar de baja usuario <br />
8- Listar peliculas por categoria<br />
9- Listar peliculas mejor valoradas<br />
10-Listar peliculas vistas por usuario<br />
11-Borrar pelicula<br />
12-Modificar peliculas<br />

<h2>Tareas realizadas Sprint 1</h2>


<h3>5-Crear Peliculas Nuevas</h3>

5.1 Crear Proyecto con los paquetes control, servicios, datos, utilidades, gui y dao.<br />
5.2 Importar librería de Peliculas MySQL<br />
5.3 Crear Schema, tabla "Pelicula"<br />
5.4 Importar los datos del archivo csv.<br />
5.5 Crear clase conexión con el método conexión en paquete dao<br />
5.6 Crear bean de pelicula en el paquete modelo.<br />
5.7 Crear clase "usuario" (paquete modelo)<br />
5.8 Crear clase Pelicula dao(que implemente la interfaz), con el método agregar en el paquete dao<br />
5.9 Crear clase Menú en el paquete gui, con mensaje de bienvenida y la opción altaPelicula<br />
5.10 Crear Clase LecturaDatos en el paquete utilidades<br />
5.11 Crear clase MovieFlixx en el paquete control, con el método start();<br />
5.12 Crear clase Main en el paquete control que llama al método start de la clase movieflixx<br />
5.13 Crear clase Pelicula en el paquete servicios(interfaz y clase)

<h3>6-Listar películas</h3>
6.1 Crear método recuperar películas en interface y en la clase película dao<br />
6.2 Crear interfaz en paquete datos con el método añadir película<br />
6.3 Crear clase ListaPelicula (Implementa la interfaz)  con método añadir en el paquete datos<br />
6.4 Añadir opción ListarPeliculas en las clases Menu y MovieFlix<br />
6.5 Crear interfaz servicios en paquete servicios con sus metodos<br />
6.6 Crear clase servicios (implementa la interfaz) en sus métodos en paquete servicios


<h3>11-Borrar peliculas</h3>
11.1 Método eliminar película en el bean película<br />
11.2 Añadir opción eliminar película en la interfaz y en la clase película dao<br />
11.3 Añadir opción eliminar película  en las clases Menu y MovieFlix
<h3>12-Modificar Peliculas</h3>
12.1 Método eliminar película en el bean pelicula<br />
12.2 Método eliminar película en la interface y en la clase película dao<br />
12.3 Añadir opción eliminar película a clases Menu y MovieFlix<br />
12.4 Método encontrarPelicula<br />
12.5  Modificar clase IserviciosPelicula<br />
12.6 Modificar clase "ServiciosPelicula"<br />
12.7 Modificar clase con iDatosPelicula<br />





<h2>Tareas realizadas Sprint 2</h2>

<h3>0-Tareas generales</h3>

0.1 Generar JavaDoc <br />
0.2 Crear tabla categorias <br />
0.3 Conectar base de datos con pelicula <br />
0.4 Enlazar tabla categorías con tabla películas a través de FK <br />
0.5 Prueba calidad utilidades<br />
0.6 Prueba calidad datos<br />
0.7 Hacer fichero README con tareas realizadas<br />
0.8 Comprobar que podemos añadir películas modificar y borrar <br />
0.9 Prueba calidad model<br />
0.10 Prueba calidad gui<br />
0.11 Prueba calidad servicios<br />
0.12 Prueba de calidad control<br />
0.13 Prueba calidad dao<br />
0.14 Planificación en Jira (herramientas seguimiento)

<h3>1-Alta usuario</h3>
1.1 Crear clase "Usuario"<br />
1.2 Crear clase "DatosUsuario"<br />
1.3 Crear clase "ServiciosUsuario" + interfaz "iServiciosUsuario"<br />
1.4 Crear clase "iDatosUsuario"
1.5 Crear metodo "add.usu" en todas las capas

<h3>2-Modificar usuario</h3>
2.1 Metodos encontrar_usu(Datos)<br />
2.2 Metodo modificarusuario (Datos)<br />
2.3 Metodo modificarusuario (Interfaz)<br />
2.4 Metodo modificarusuario (dao)<br />
2.5 Añadir opcion modif.usu en menu y en clase MovieFlixx


<h3>3-Baja usuario</h3>
3.1 Crear metodo eliminar_usuario en (DatosUsuario, iDatosUsuario) <br />
3.2 Añadir opciones al menu

<h3>4-Listas usuarios</h3>
4.1 Usar metodo listaUsuarios en (Datosusa, serviciosusa, iserviciosusa)<br />
4.2 Añadir la opcion al menu y clase MovieFlixx
<h3>10-Listas peliculas vistas por usuario</h3>
<br />
<br />
<br />
