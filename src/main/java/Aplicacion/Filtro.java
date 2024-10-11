package Aplicacion;

import java.util.ArrayList;

/**
 * Filtra el input.
 *
 * @author Diego Francisco Darias Pino
 */
public class Filtro {

    public static String mayus(String str) {
        String filtrado = str;
        filtrado = filtrado.toUpperCase();
        return filtrado;
    }

    public static ArrayList<String> listaMayus(ArrayList<String> lista) {
        ArrayList<String> filtrado = new ArrayList<>();
        for (String str : lista) {
            str = str.toUpperCase();
            filtrado.add(str);
        }
        return filtrado;
    }

    public static String tildes(String str) {
        String filtrado = str;
        filtrado = filtrado.replace('Á', 'A');
        filtrado = filtrado.replace('É', 'E');
        filtrado = filtrado.replace('Í', 'I');
        filtrado = filtrado.replace('Ó', 'O');
        filtrado = filtrado.replace('Ú', 'U');
        return filtrado;
    }

    public static ArrayList<String> listaTildes(ArrayList<String> lista) {
        ArrayList<String> filtrado = new ArrayList<>();
        for (String str : lista) {
            str = str.replace('Á', 'A');
            str = str.replace('É', 'E');
            str = str.replace('Í', 'I');
            str = str.replace('Ó', 'O');
            str = str.replace('Ú', 'U');
            filtrado.add(str);
        }
        return filtrado;
    }

}
