package Servicio;

import Entidades.Cadena;

public class CadenaServicio {

    Cadena c1 = new Cadena();
    //  Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.

    public int mostrarVocales(Cadena c1) {
        int contador = 0;
        char letra;
        for (int i = 0; i < c1.getFraseLongitud(); i++) {
            letra = c1.getFrase().charAt(i);
            letra = Character.toUpperCase(letra);

            switch (letra) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    contador++;
            }
        }
        return contador;
    }

    public void invertirFrase(Cadena c1) {
        for (int i = c1.getFraseLongitud() - 1; i >= 0; i--) {
            System.out.println(c1.getFrase().charAt(i));
        }
        System.out.println("");
    }

    public void vecesRepetido(String letra, Cadena c1) {
        int contador = 0;
        for (int i = 0; i < c1.getFraseLongitud(); i++) {
            if ((c1.getFrase().substring(i, i + 1).equals(letra))) {
                contador++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + contador + " veces");
    }

    public boolean compararLongitud(String frase, Cadena c1) {
        boolean resultado = false;
        if (frase.length() == c1.getFraseLongitud()) {
            resultado = true;
        }
        return resultado;
    }

    public void unirFrases(String frase, Cadena c1) {
        System.out.println(c1.getFrase() + " " + frase);
    }

    public void reemplazar(String letra, Cadena c1) {
        for (int i = 0; i < c1.getFraseLongitud(); i++) {
            if (c1.getFrase().charAt(i) == 'a') {
                System.out.println(letra);
            } else {
                System.out.println(c1.getFrase().charAt(i));
            }

        }
        System.out.println("");
    }

    public boolean contiene(String letra, Cadena c1) {

        boolean contiene = false;

        for (int i = 0; i < c1.getFraseLongitud(); i++) {
            if (String.valueOf(c1.getFrase().charAt(i)).equals(letra)) {
                contiene = true;
                break; // Si ya contiene en la primer pasada directamente corto el ciclo.
            }
        }
        return contiene;
    }

}
