![img.png](img.png)

## **Prueba automatizada para realizar el login de uno o varios usuarios y la compra de un producto en la tienda**

### Funcionalidades

###### Login de Usuario

###### Compra de producto

![img_1.png](img_1.png)

### Framework

###### Serenity: Se utiliza como framework Serenity BDD, que utiliza los resultados de las pruebas para realizar la documentación describiendo lo que hace la aplicación, informa que pruebas se han realizado, las pruebas que fallaron y las que pasaron.

### Patron de desarrollo

###### Se utiliza Screenplay pattern ya que esta centrado en el usuario y orientado a tareas, utiliza los principios S.O.L.I.D. Con screenplay se puede escribir el codigo en un lenguaje mas natural.

### Herramientas de compilación

![img_2.png](img_2.png)

### **Gradle**

###### Es un gestor de proyectos.


![img_3.png](img_3.png)

### Cucumber

###### Es una herramienta que permite escribir los casos de prueba.


![img_4.png](img_4.png)

### Selenium

###### Selenium es un entorno de pruebas de software para aplicaciones basadas en la web. Selenium provee una herramienta de grabar/reproducir para crear pruebas sin usar un lenguaje de scripting para pruebas.

### La estructura completa del proyecto es la siguiente:

###### *Features: Utiliza lenguaje Gherkin y contienen los escenarios de negocio del caso de prueba.

###### *Tasks: Clases que representan tareas que realiza el actor a nivel de proceso de negocio.

###### *Questions: Comprueban los resultados de las operaciones realizadas.

###### *Models: Estas clases representan abstracciones de objetos que hacen parte de la aplicación o del negocio.

###### *Builders: Es un patrón de diseño diseñado para proporcionar una solución flexible a varios problemas de creación de objetos en la programación orientada a objetos.

###### *Interfaces: Es una clase abstracta que se utiliza para agrupar métodos relacionados con cuerpos vacíos.

###### *Utils: En este package van las clases que son útiles para la construcción de la automatización, como cambiar formato de fecha, leer archivo, etc.

###### *Userinterfaces: Es una clase que donde se ingresan los elementos html o css de la página a automatizar.

### Requerimientos

###### Java JDK 

###### Gestor de proyectos Gradle

### Comando para ejecutar el proyecto.

###### gradle clean test aggregate /Este comando ejecuta todo el proyecto.

### Autor

###### Laura Ramirez Ruiz - lauraramirezruiz73@gmail.com