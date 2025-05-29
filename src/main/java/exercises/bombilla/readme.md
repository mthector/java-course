Crea una clase Bombilla y un programa que cree objetos Bombilla y utilice todas las propiedades y métodos.

PROPIEDADES

    - estado: si está apagada o encendida (boolean). Por defecto false
    
    - potencia: en vatios (int)
    
    - color: color de la bombilla (String)
    
    - horas: horas que puede estar encendida (float). Por defecto 10
  
MÉTODOS

    - encender: si quedan horas enciende la bombilla, pone la propiedad estado = true y pide por teclado cuánto tiempo estará encendida. Resta el tiempo de la propiedad horas.
    
    - apagar: pone la propiedad estado = false
    
    - ver_estado: devuelve el estado de la bombilla
    
    - cambia_potencia: se le pasa una potencia por parámetro y la sustituye por lo que hay en la propiedad potencia
    
    - ver_potencia: devuelve la potencia de la bombilla
    
    - cambia_color: se le pasa el color por parámetro y si la bombilla está encendida la apaga y luego cambia el color.
    
    - ver_color: imprime por pantalla el color de la bombilla
    
    - recargar: pregunta cuántas horas quiere el usuario recargar y las suma a la propiedad horas
