# TallerAutomatizacion


# Para ejecutar la automatizacion de forma satisfactoria es necesario seguir los siguientes pasos

- Ejecutar el archivo build.gradle para que se descarguen las dependencias.
- Dirigirse al archivo src\main\java\co\com\taller\gurubank\util\Const.java
- Cambiar los datos customer_name, customer_email para que se cree un usuario diferente (en el campo customer_name es solo texto no se le pueden introducir numeros)
- Ejecutar en la raiz del proyecto el comando gradlew clean test

#Casos de prueba.
1. El usuario ingresa a la página Guru y crea un customer una vez lo crea verifica que se haya creado correctamente.
2. El usuario crea una cuenta, una vez creada la cuenta se verifica que se haya creado correctamente.
3. El usuario elimina la cuenta, una vez eliminada la cuenta verifica que se haya eliminado satisfactoriamente.

   
