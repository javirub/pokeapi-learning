# pokemon-api-jrr

## Proyecto 1: Pokemon API
Crea el primer proyecto, el que servirá como librería. Las coordenadas de Maven deben de ser:  

com.laberit.sina.bootcamp.extra:pokemon-api:1.0.0-SNAPSHOT  

Debes de estructurar el API en cuatro paquetes:  
•Paquete **services**. Es la capa más externa, y será la que terminen invocando los clientes.
Tendrá toda la lógica de negocio que requiramos para implementar las operaciones. 
Crea aquí tantos paquetes como necesites.  
•Paquete **api**. Esta capa será invocada por la capa de servicios, y su función será la de llamar al PokeAPI.
Todo lo que tenga que ver con integrarse con PokeAPI estará en esta capa. Estructúralo como consideres.  
•Paquete **models**. Deja aquí los modelos.  
•Paquete **utils**. En este paquete dejarás esta clase: mail. 

Te servirá para parsear el JSON que te devuelva el API a la clase de Java que quieras. 
Para poder usar esta clase necesitarás la dependencia jackson-databind. Asegúrate de incorporarla a tu proyecto.  

Cada servicio que desarrolles debe de tener su respectiva interfaz, de manera que sea esta la que defina el API.
El cliente usará la capa de servicios a través de las interfaces y no de sus implementaciones.
Puedes crear si quieres en la raíz del proyecto una clase Main con un método main para poder ir probando tus 
clases conforme las vas desarrollando, pero cuando termines este proyecto no debe de tener clase Main. 
Es solo un API Java, y se usará a modo de librería.
Cuando lo hayas terminado, usa Maven para generar el jar de la librería e instálalo en tu repositorio local.

## Extra
### TESTS
Se añaden tests para comprobar el funcionamiento correcto
### Implementación gitlab CI/CD
Se añade un pipeline para comprobar que los tests pasan correctamente.  
Se configura un runner en local para ejecutar el pipeline.  
Se mergean automaticamente los merge request que pasan el pipeline.