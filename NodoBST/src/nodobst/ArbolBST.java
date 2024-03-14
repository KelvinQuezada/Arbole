/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodobst;

/**
 *
 * @author petee
 */
// Definición de la clase ArbolBST que representa un árbol binario de búsqueda
public class ArbolBST {
    NodoBST raiz; // Raíz del árbol

    // Constructor que inicializa un árbol vacío
    ArbolBST() {
        raiz = null;
    }

    // Método para insertar un nuevo valor en el árbol
    void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    // Método auxiliar recursivo para insertar un nuevo valor en el árbol
    NodoBST insertarRecursivo(NodoBST nodo, int valor) {
        if (nodo == null) {
            // Si el nodo actual es nulo, creamos un nuevo nodo con el valor proporcionado
            nodo = new NodoBST(valor); 
            return nodo;
        }
        // Si el valor es menor que el valor del nodo actual, lo insertamos en el subárbol izquierdo
        if (valor < nodo.valor)
            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        // Si el valor es mayor que el valor del nodo actual, lo insertamos en el subárbol derecho
        else if (valor > nodo.valor)
            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        return nodo;
    }

    // Método para buscar un valor en el árbol
    void buscar(int valor) {
        NodoBST encontrado = buscarRecursivo(raiz, valor);
        if (encontrado != null)
            System.out.println("Valor encontrado: " + encontrado.valor);
        else
            System.out.println("Valor no encontrado");
    }
    // Método auxiliar recursivo para buscar un valor en el árbol
    NodoBST buscarRecursivo(NodoBST nodo, int valor) {
        // Si el nodo actual es nulo o contiene el valor buscado, lo retornamos
        if (nodo == null || nodo.valor == valor)
            return nodo;

        // Si el valor es menor que el valor del nodo actual, continuamos la búsqueda en el subárbol izquierdo
        if (valor < nodo.valor)
            return buscarRecursivo(nodo.izquierda, valor);

        // Si el valor es mayor que el valor del nodo actual, continuamos la búsqueda en el subárbol derecho
        return buscarRecursivo(nodo.derecha, valor);
    }

    // Método para realizar el recorrido inorden en el árbol
    void recorridoInorden(NodoBST nodo) {
        if (nodo != null) {
            recorridoInorden(nodo.izquierda); // Recorremos el subárbol izquierdo
            System.out.print(nodo.valor + " "); // Visitamos el nodo actual
            recorridoInorden(nodo.derecha); // Recorremos el subárbol derecho
        }
    }

    // Método para realizar el recorrido preorden en el árbol
    void recorridoPreorden(NodoBST nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " "); // Visitamos el nodo actual
            recorridoPreorden(nodo.izquierda); // Recorremos el subárbol izquierdo
            recorridoPreorden(nodo.derecha); // Recorremos el subárbol derecho
        }
    }

    // Método para realizar el recorrido postorden en el árbol
    void recorridoPostorden(NodoBST nodo) {
        if (nodo != null) {
            recorridoPostorden(nodo.izquierda); // Recorremos el subárbol izquierdo
            recorridoPostorden(nodo.derecha); // Recorremos el subárbol derecho
            System.out.print(nodo.valor + " "); // Visitamos el nodo actual
        }
    }
    // Método para obtener la representación visual del árbol
    void imprimirArbol() {
        imprimirArbolRecursivo(raiz, 0); // Llamada al método auxiliar con la raíz del árbol y nivel inicial 0
    }
    // Método auxiliar recursivo para imprimir la representación visual del árbol
    void imprimirArbolRecursivo(NodoBST nodo, int nivel) {
        if (nodo != null) {
            imprimirArbolRecursivo(nodo.derecha, nivel + 1); // Imprimimos el subárbol derecho con un nivel más
            for (int i = 0; i < nivel; i++)
                System.out.print("   "); // Imprimimos espacios para la indentación según el nivel
            System.out.println(nodo.valor); // Imprimimos el valor del nodo actual
            imprimirArbolRecursivo(nodo.izquierda, nivel + 1); // Imprimimos el subárbol izquierdo con un nivel más
        }
    }
}
