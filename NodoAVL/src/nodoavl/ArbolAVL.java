/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodoavl;

/**
 *
 * @author petee
 */

// Definición de la clase ArbolAVL
public class ArbolAVL {
    NodoAVL raiz; // Raíz del árbol AVL
    // Constructor de la clase ArbolAVL
    ArbolAVL() {
        raiz = null; // Inicialización de la raíz como null
    }
    // Método para insertar un nuevo valor en el árbol AVL
    void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }
    // Método recursivo para insertar un nuevo valor en el árbol AVL
    NodoAVL insertarRecursivo(NodoAVL nodo, int valor) {
        // Si el nodo es nulo, crea un nuevo nodo con el valor dado
        if (nodo == null)
            return new NodoAVL(valor);
        // Si el valor es menor que el valor del nodo actual, lo inserta en el subárbol izquierdo
        if (valor < nodo.valor)
            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        // Si el valor es mayor que el valor del nodo actual, lo inserta en el subárbol derecho
        else if (valor > nodo.valor)
            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        else
            return nodo; // El valor ya existe en el árbol
        // Actualiza la altura del nodo actual
        nodo.altura = 1 + Math.max(getAltura(nodo.izquierda), getAltura(nodo.derecha));
        // Obtiene el factor de equilibrio del nodo para verificar si se necesita balancear
        int balance = getBalance(nodo);
        // Casos de rotación para balancear el árbol
        if (balance > 1 && valor < nodo.izquierda.valor)
            return rotacionDerecha(nodo);
        if (balance < -1 && valor > nodo.derecha.valor)
            return rotacionIzquierda(nodo);
        if (balance > 1 && valor > nodo.izquierda.valor) {
            nodo.izquierda = rotacionIzquierda(nodo.izquierda);
            return rotacionDerecha(nodo);
        }
        if (balance < -1 && valor < nodo.derecha.valor) {
            nodo.derecha = rotacionDerecha(nodo.derecha);
            return rotacionIzquierda(nodo);
        }
        return nodo;
    }

    // Método para buscar un valor en el árbol AVL
    void buscar(int valor) {
        NodoAVL encontrado = buscarRecursivo(raiz, valor);
        if (encontrado != null)
            System.out.println("Valor encontrado: " + encontrado.valor);
        else
            System.out.println("Valor no encontrado");
    }

    // Método recursivo para buscar un valor en el árbol AVL
    NodoAVL buscarRecursivo(NodoAVL nodo, int valor) {
        // Si el nodo es nulo o el valor es igual al valor del nodo actual, devuelve el nodo actual
        if (nodo == null || nodo.valor == valor)
            return nodo;
        // Si el valor es menor que el valor del nodo actual, busca en el subárbol izquierdo
        if (valor < nodo.valor)
            return buscarRecursivo(nodo.izquierda, valor);
        // Si el valor es mayor que el valor del nodo actual, busca en el subárbol derecho
        return buscarRecursivo(nodo.derecha, valor);
    }

    // Método para obtener la altura de un nodo
    int getAltura(NodoAVL nodo) {
        if (nodo == null)
            return 0;
        return nodo.altura;
    }

    // Método para obtener el factor de equilibrio de un nodo
    int getBalance(NodoAVL nodo) {
        if (nodo == null)
            return 0;
        return getAltura(nodo.izquierda) - getAltura(nodo.derecha);
    }

    // Método para realizar una rotación hacia la derecha en el árbol AVL
    NodoAVL rotacionDerecha(NodoAVL y) {
        NodoAVL x = y.izquierda;
        NodoAVL T2 = x.derecha;
        // Realiza la rotación hacia la derecha
        x.derecha = y;
        y.izquierda = T2;
        // Actualiza las alturas de los nodos afectados
        y.altura = Math.max(getAltura(y.izquierda), getAltura(y.derecha)) + 1;
        x.altura = Math.max(getAltura(x.izquierda), getAltura(x.derecha)) + 1;
        return x;
    }

    // Método para realizar una rotación hacia la izquierda en el árbol AVL
    NodoAVL rotacionIzquierda(NodoAVL x) {
        NodoAVL y = x.derecha;
        NodoAVL T2 = y.izquierda;
        // Realiza la rotación hacia la izquierda
        y.izquierda = x;
        x.derecha = T2;
        // Actualiza las alturas de los nodos afectados
        x.altura = Math.max(getAltura(x.izquierda), getAltura(x.derecha)) + 1;
        y.altura = Math.max(getAltura(y.izquierda), getAltura(y.derecha)) + 1;

        return y;
    }
}
