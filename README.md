<div id="top"></div>

# APP DISPATCH

<!-- ABOUT THE PROJECT -->
## Sobre el proyecto
App Booking 


<!-- TABLE OF CONTENTS -->
<details>
<summary>Table of Contents</summary>
<ol>
<li>
<a href="#about-the-project">About The Project</a>
</li>
<li>
<a href="#getting-started">Getting Started</a>
<ul>
<li><a href="#prerequisites-windows">Prerequisites Windows</a></li>
<li><a href="#prerequisites-macos">Prerequisites MacOS</a></li>
</ul>
</li>
<li>
<a href="#installation-local">Installation Local</a>
<ul>
<li><a href="#installation-in-windows">Installation in Windows</a></li>
<li><a href="#installation-in-macos">Installation in MacOS</a></li>
</ul>
</li>
<li><a href="#configuracion-local-setting-maven-repositories">Configuracion local Settings maven Repositories</a></li>
<li><a href="#usage-run-local">Usage Run Local</a></li>
<li><a href="#contact-team">Contact Team</a></li>
<li><a href="#contact-lead">Contact Lead</a></li>
</ol>
</details>

<!-- GETTING STARTED -->
## Empezando
Antes de ejecutar el proyecto, es necesario tener claro los programas, marcos de ejecución y complementos mínimos para iniciar con la automatización del proyecto.

### Prerrequisitos Windows
Se necesita instalar los siguientes complementos.


* [Maven](https://maven.apache.org/) 
* [JDK-1.8](https://www.oracle.com/java/technologies/downloads/)
* [Appium](https://appium.io/downloads.html)


<!-- INSTALLATION GLOBAL -->
## Instalación Local
Pasos necesarios para instalar correctamente los programas en tu local (Windows)

### Instalación en Windows

1. Haga clic en Aplicaciones de escritorio de Appium y verifique que sea la última versión de Appium, descargue la carpeta zip en su local, extraiga la carpeta y haga doble clic en Appium install exe.
2. Habilitar las opciones de desarrollador y depuración por USB en un dispositivo físico android y conectarlo por medio de un cable USB a tu pc.
3. Abrir Appium y oprimir "Start Server v1.21.0" y luego oprimir la opción "Start inspector Session".
4. Para conocer el nombre de nuestro dispositivo android abrir la terminal de Windows y colocar "adb devices".

5. Configurar las Desired Capabilities de la siguiente manera:

| Name                 | text   | Value |
| ---------------------------|---------------|---------|
| deviceName     | text | **Nombre del dispositivo android** |
| platformName      | text | Android |
| platformVersion  | text | **Colocar la version del sistema operativo del dispositivo android** |
| appPackage  | text | com.geosort.dispatch |
| appActivity  | text | .MainActivity |

6. Luego de configurar las Desired Capabilities oprimir "Start Session" y estaremos enlazando nuestro servidor Appium con nuestro dispositivo físico o emulador para poder capturar objetos del app y ejecutar las pruebas automatizadas.
7. - Configure System Variables;
- Name Variables: JAVA_HOME  
- Value Variable : C:\Program Files\Java\jdk1.8.0_202 <---Debe ingresar la dirección donde se encuentra el jdk  
- Name Variables: JAVA_TOOL_OPTIONS  
- Value Variable: -Djava.vendor="Sun Microsystems Inc."  
- Name Variables: M2_HOME  
- Value Variable: C:\apache-maven-3.x.x <----Debe ingresar la dirección donde se encuentra.  
- Name Variables: M2  
- Value Variable: %M2_HOME%\bin

6-Ingrese la variable del sistema Path en la sección de variables del sistema.  
- Enter the new records 
- %M2%  
- %JAVA_HOME%\binEY = 'ENTER YOUR API';


<!-- USAGE RUN LOCAL -->
## Ejecutar Localmente
Antes de ejecutar el proyecto, es necesario tener claros los programas, marcos de ejecución y complementos mínimos para iniciar con la automatización del proyecto.

1. IDE abierto, y en la terminal ejecute este comando para descargar dependencias
```sh
mvn clean install
```

```sh
2. Dentro del proyecto ubicar la clase Base y configurarlo de la siguiente manera:

    cap.setCapability("deviceName", **Nombre del dispositivo android**);
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", **Colocar la version del sistema operativo del dispositivo android**);
	cap.setCapability("appPackage", ""); 
	cap.setCapability("appActivity", "");  



```







<p align="right">(<a href="#top">back to top</a>)</p>
