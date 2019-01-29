# Demo Android Swapkeyboard
Demo con el ejemplo de implementación para el SDK de SwapKey

#### Requisitos
Los requisitos del sdk son:
- Dependencia de librería swapkey
- Android versión mayor o igual a 17
- Permiso de internet

#### Dependencias internas del proyecto
- support:appcompat
- constraint-layout
- recyclerview

#### Instalación
1. Agregar  el repositorio jitpack maven a la lista de repositorios
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
2. Agregar la dependencia de swapkey (reemplazar TAG por la versión)
```
dependencies {
	        implementation 'com.github.pocketdeveloper:SwapKeyAndroidSDK:TAG'
	}
```

## Inicializar el SDK
Para inicializar el SDK, se deberá ejecutar el siguiente código
```
new SecureDevicePreferences(androidContext).saveAPIKey("swap");
// Cambiar bandera dependiendo el ambiente
new SecureDevicePreferences(androidContext).saveIsProduction(false);
```

#### Asignar un identificador de dispositivo
Para el sdk es necesario asignar un identificador de dispositivo, que será utilizado para poder autenticar con el servicio.
La manera de asignarlo es mediante la clase _SecureDevicePreferences_. Ejemplo:
```
new SecureDevicePreferences(androidContext).save("_GET_DEVICE()_");
```

## Guía de integración
Se ha preparado una guía paso a paso con lo detalles para la integración:

## Versión
[![](https://jitpack.io/v/pocketdeveloper/SwapKeyAndroidSDK.svg)](https://jitpack.io/#pocketdeveloper/SwapKeyAndroidSDK)

## Autor
Jorge - Swap




