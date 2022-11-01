# Aplicación distribuida segura en todos sus frentes

Desarrolle una aplicación Web segura con los siguientes requerimientos:

    Debe permitir un acceso seguro desde el browser a la aplicación. Es decir debe garantizar autenticación, autorización e integridad de usuarios.
    Debe tener al menos dos computadores comunicacndose entre ellos y el acceso de servicios remotos debe garantizar: autenticación, autorización e integridad entre los servicios. Nadie puede invocar los servicios si no está autorizado.
    Explique como escalaría su arquitectura de seguridad para incorporar nuevos servicios.

## Funcionamiento

La aplicación contiene un browser como cliente, un servicio de Login y otro servicio que valida si el usuario está autenticado para loggearlo corriendo cada uno en una instancia independiente en AWS.

La arquitectura se puede escalar generando certificados propios de los nuevos servicios y la inclusión del certificado del nuevo servicio el archivo myTrustStore, para autorizar el acceso desde que recibimos credenciales, en el directorio de los certificados autorizados de el servicio de login.

1.Generamos un par de llaves públicas y privadas y un certificado para almacenarlo en un archivo protegido. Esto, tomando en cuenta si usar  “localhost” o "url de la aplicación desplegada en aws" como nombre del certificado.

![imagen](https://user-images.githubusercontent.com/98195579/199169572-bce58bc6-8869-440f-a04a-819982a4da66.png)

2. Exportamos el certificado a un archivo

![imagen](https://user-images.githubusercontent.com/98195579/199169792-536ed22d-1437-4cf4-ad20-f5f006351927.png)

3. importamos el certificado a MyTrustStore

![imagen](https://user-images.githubusercontent.com/98195579/199169876-2c58e575-1a50-4146-ac97-01e77953e925.png)

## Adicional

La aplicación de 12 factores es una metodología para construir aplicaciones de software como servicio. Entre estos, la aplicación sería más escalable si se contara con  recursos para la base de datos, ya que se uso un apimock, para validar el usuario,valores por despliegue como el nombre de host canónico para el despliegue, contar con un contrato limpio con el sistema operativo subyacente, ofreciendo la máxima portabilidad entre entornos de ejecución.

## Despliegue

### Iniciar sesión con usuario y contraseña correctos

![imagen](https://user-images.githubusercontent.com/98195579/199167524-1d7e706f-66e1-4935-b96d-d20676c8e66b.png)

![imagen](https://user-images.githubusercontent.com/98195579/199170699-e5f44944-190f-47fe-9cae-c7aad91a50f2.png)


### Iniciar sesión con usuario correcto y contraseña incorrecta

![imagen](https://user-images.githubusercontent.com/98195579/199170643-d70acc6b-5282-41dc-8d52-c987aa6191d0.png)


![imagen](https://user-images.githubusercontent.com/98195579/199170805-19f2d181-5695-4eaa-b2e0-c22f5784ff16.png)

### Iniciar sesión con usuario y contraseña incorrectos

![imagen](https://user-images.githubusercontent.com/98195579/199170994-a1255c90-4c7d-44cf-b808-d326db876b24.png)


![imagen](https://user-images.githubusercontent.com/98195579/199170961-3271f1ec-6d44-4037-8eca-16b155225425.png)

### Todo esto se puede ver evidenciado en el siguiente video

https://youtu.be/cHDFCz2nex0

## Herramientas utilizadas

    Spark - The web framework used
    Maven - Dependency Management
    Github - web-based version-control and collaboration platform for software developers.
    
## Autora

Laura Valentina Alvarado
