# Aplicación distribuida segura en todos sus frentes

Desarrolle una aplicación Web segura con los siguientes requerimientos:

    Debe permitir un acceso seguro desde el browser a la aplicación. Es decir debe garantizar autenticación, autorización e integridad de usuarios.
    Debe tener al menos dos computadores comunicacndose entre ellos y el acceso de servicios remotos debe garantizar: autenticación, autorización e integridad entre los servicios. Nadie puede invocar los servicios si no está autorizado.
    Explique como escalaría su arquitectura de seguridad para incorporar nuevos servicios.

## Funcionamiento

La aplicación está compuesta de 3 componentes: browser como cliente, un servicio de Login y otro servicio que valida si el usuario está autenticado para loggearlo corriendo cada uno en una máquina virtual independiente en AWS.

### Iniciar sesión con usuario y contraseña correctos
![imagen](https://user-images.githubusercontent.com/98195579/199167524-1d7e706f-66e1-4935-b96d-d20676c8e66b.png)

## Adicional

la conexión de HTTP-Json, nos permite extender de los servicios fachada de los que nos conectamos para solicitar el histórico. Para implementar servicios diferentes, creamos por cada servicio un interfaz que nos permitira por medio de la conexión de HTTP implementar su respectivo get según el servicio deseado. Por medio del cliente javascript, realizamos el request del servicio que se ingresó y con spark, tenemos el framework con los históricos esperados.

## Despliegue

https://stark-crag-82185.herokuapp.com/

## Herramientas utilizadas

    Spark - The web framework used
    Maven - Dependency Management
    Github - web-based version-control and collaboration platform for software developers.
    
## Autora

Laura Valentina Alvarado
