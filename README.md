# Reto 2 Java Misión Tic
## Estudio De Prevención De Mortalidad.
En Colombia se desea iniciar una investigación relacionada con las causas de mortalidad en la población. 
En estudios previos se ha detectado que las siguientes enfermedades causan gran parte de la mortalidad en los pacientes: cáncer, cardiovasculares, respiratorias, cerebrovasculares, hipertensión y diabetes.
El objetivo de la investigación es realizar un estudio estadístico de las enfermedades anteriormente mencionadas con el fin de mitigar la mortalidad en la población y tomar decisiones en cuanto a los recursos disponibles para atacar cada una de ellas.
Para lo anterior, se tienen los siguientes datos de un conjunto de pacientes:

- Nombre completo
- Número de cédula
-	Edad
-	Ciudad
-	EPS
-	Enfermedad diagnosticada

Conforme a lo mencionado, se le ha contratado a usted para apoyar el proceso de investigación desarrollando un programa que implemente los siguientes requerimientos:

-	Leer la cantidad de pacientes del estudio.
-	Leer y almacenar el nombre, número de cédula, edad, ciudad, EPS, y enfermedad diagnosticada de cada uno de los pacientes.

Una vez leidos los datos.

-	¿Cuál es la ciudad en la cual se encuentra el mayor número de pacientes?

Si hay más de una ciudad con la mayor cantidad de pacientes escoger la primera en aparecer.

Para el diseño del programa usted deberá:

-	Implementar POO creando una clase llamada Paciente.
-	Implementar un método llamado clasificarEdad dentro de la clase Paciente que devuelva si el paciente es joven adulto, adulto o tercera edad según la siguiente tabla.

Por último, deberá imprimir la cedula de los pacientes y su clasificación según edad.

| Edad          | Titulo                  |
| ------------- | -------------           |
|[21 – 30]      | Adulto                  |
| (30 – 60]     | Contenido de la celda   |
|> 60           |Tercera edad             |


Ejemplo:

**Entrada esperada**
<pre><code>3
Julian Andrade-723456-45-Barranquilla-Sura-cardiovasculares
Andres Utria-734673-76-Barranquilla-Sanitas-cancer
Eva Molina-104312456-32-Bogota-Sura-cancer
</code></pre>


**Salida esperada**
<pre><code>Barranquilla
723456 Adulto
734673 Tercera edad
104312456 Adulto
</code></pre>
