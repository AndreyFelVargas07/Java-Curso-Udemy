
import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {

        System.out.println("Escribe tu nombre:  ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("Tu nombre es = " + usuario);

        //  Utilizando mas Scanner
        System.out.println("Escrube las siguiente informacion de un libro \n Proporciona el titulo: ");
        Scanner scanner = new Scanner(System.in);
        var titulo = scanner.nextLine();
        System.out.println("Titulo es = " + titulo + "\n Proporciona el Autor: ");
        var autor = scanner.nextLine();
        System.out.println("Autor es = " + autor);
        System.out.println("Libro : " + titulo + " autor: " + autor);
    }

}
