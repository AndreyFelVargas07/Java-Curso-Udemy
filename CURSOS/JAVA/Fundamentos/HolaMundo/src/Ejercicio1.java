
public class Ejercicio1 {

    public static void main(String[] args) {
        var nombre = "Andrey";
        var nombre2 = "Melannie";
        int edad = 18;
        int edad2 = 19;
        String texto = " Feliz es ";
        String texto2 = " con ";
        var desenlace = " Gozatela vida es un vacilon ";

        System.out.println(" \n\n A continuacion va haber una historia: \n Todo inicio con " + nombre);
        System.out.println("Donde " + nombre + "conocio a " + nombre2);
        System.out.println(nombre2 + " tenia " + edad + " y " + nombre + " tenia " + edad2);
        System.out.println(nombre + " y " + nombre2 + " Se volvieron novios, y querian saber "
                + " que la suma de sus edades \n era la de su matrimonio por lo que un dia,"
                + " decidieron sentarse y sumar sus edades... \n la edad de su matrimonio"
                + " era: a los " + (edad + edad2) + " años \n " + nombre + texto + texto2 + nombre2 + " y vivieron "
                + "felices por siempre \n " + nombre + " le dedico la de ñejo \t " + desenlace + "\n\n");

//Calculadora 
        int numero1 = 8;
        int numero2 = 8;

        //Hacer una calculadora breve
        var suma = "la suma de los dos numeros: " + numero1 + " y " + numero2 + " es: " + (numero1 + numero2);
        var resta = "la resta de los dos numeros: " + numero2 + " y " + numero1 + " es: " + (numero2 - numero1);
        var multiplicacion = "la multiplicacion de los dos numeros " + numero1 + " y " + numero2 + " es: " + (numero1 * numero2);
        var division = "La division de los dos numeros " + numero2 + " y " + numero1 + " es: " + (numero2 / numero1);
        var residuo = "El residuo de los dos numeros " + numero2 + " y " + numero1 + " es: " + (numero2 % numero1);
        System.out.println(suma + "\n" + resta + "\n" + multiplicacion + "\n" + division + "\n" + residuo);

        
    }
}
