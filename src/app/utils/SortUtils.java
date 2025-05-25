package app.utils; // O el paquete que uses para utilidades

import app.domain.model.User; // Asegúrate de que la ruta a User sea correcta
import java.util.ArrayList;
// No necesitaremos java.util.Comparator ni java.util.stream.* aquí

public class SortUtils {

    

    public static ArrayList<User> bubbleSortUsersByNameDescending(ArrayList<User> users) {
        if (users == null || users.isEmpty()) {
            return new ArrayList<>(); // Devuelve lista vacía si la entrada es null o vacía
        }

        // Crear una copia para no modificar la lista original
        ArrayList<User> sortedList = new ArrayList<>(users);
        int n = sortedList.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                // Comparación para orden descendente (Z-A): si el actual es MENOR que el siguiente
                if (sortedList.get(j).getName().compareToIgnoreCase(sortedList.get(j + 1).getName()) < 0) {
                    // Intercambiar elementos
                    User temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                    swapped = true;
                }
            }
            // Si no hubo intercambios en esta pasada, la lista ya está ordenada
            if (!swapped) {
                break;
            }
        }
        return sortedList;
    }

    /**
     * Ordena una lista de usuarios por edad en orden ascendente (menor a mayor)
     * utilizando el algoritmo de Ordenamiento por Selección.
     * Devuelve una NUEVA lista ordenada.
     *
     * @param users La lista de usuarios a ordenar.
     * @return Una nueva ArrayList de usuarios ordenada por edad ascendente.
     */
    public static ArrayList<User> selectionSortUsersByAgeAscending(ArrayList<User> users) {
        if (users == null || users.isEmpty()) {
            return new ArrayList<>(); // Devuelve lista vacía si la entrada es null o vacía
        }

        // Crear una copia para no modificar la lista original
        ArrayList<User> sortedList = new ArrayList<>(users);
        int n = sortedList.size();

        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del elemento mínimo en la sublista no ordenada
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (sortedList.get(j).getAge() < sortedList.get(minIndex).getAge()) {
                    minIndex = j;
                }
            }

            // Intercambiar el elemento mínimo encontrado con el primer elemento de la sublista no ordenada
            if (minIndex != i) {
                User temp = sortedList.get(minIndex);
                sortedList.set(minIndex, sortedList.get(i));
                sortedList.set(i, temp);
            }
        }
        return sortedList;
    }


}
