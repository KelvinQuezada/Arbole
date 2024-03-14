/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodobfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author petee
 */
public class ArbolBFS {
   NodoBFS raiz; // Referencia a la raíz del árbol

    // Constructor para inicializar el árbol con una raíz nula
    ArbolBFS() {
        raiz = null;
    }

    // Método para insertar un nuevo valor en el árbol utilizando BFS
    void insertar(int valor) {
        // Si el árbol está vacío, el nuevo valor se convierte en la raíz
        if (raiz == null) {
            raiz = new NodoBFS(valor);
            return;
        }
        // Utilizamos una cola para recorrer el árbol por niveles
        Queue<NodoBFS> cola = new LinkedList<>();
        cola.add(raiz);
        // Recorremos el árbol por niveles hasta encontrar un lugar vacío para insertar el nuevo valor
        while (!cola.isEmpty()) {
            NodoBFS temp = cola.poll(); // Obtenemos el primer nodo de la cola
            // Si el hijo izquierdo del nodo actual es nulo, insertamos el nuevo valor aquí
            if (temp.izquierda == null) {
                temp.izquierda = new NodoBFS(valor);
                break;
            } else { // Si no es nulo, agregamos el hijo izquierdo a la cola para explorar más tarde
                cola.add(temp.izquierda);
            }
            // Si el hijo derecho del nodo actual es nulo, insertamos el nuevo valor aquí
            if (temp.derecha == null) {
                temp.derecha = new NodoBFS(valor);
                break;
            } else { // Si no es nulo, agregamos el hijo derecho a la cola para explorar más tarde
                cola.add(temp.derecha);
            }
        }
    }

    // Método para buscar un valor en el árbol utilizando BFS
    void buscar(int valor) {
        // Si el árbol está vacío, no se puede realizar la búsqueda
        if (raiz == null) {
            System.out.println("Árbol vacío, no se puede realizar la búsqueda.");
            return;
        }

        // Utilizamos una cola para recorrer el árbol por niveles
        Queue<NodoBFS> cola = new LinkedList<>();
        cola.add(raiz);

        // Recorremos el árbol por niveles hasta encontrar el valor deseado o agotar el árbol
        while (!cola.isEmpty()) {
            NodoBFS temp = cola.poll(); // Obtenemos el primer nodo de la cola

            // Si encontramos el valor deseado, imprimimos un mensaje y salimos del método
            if (temp.valor == valor) {
                System.out.println("Valor encontrado: " + temp.valor);
                return;
            }

            // Agregamos los hijos (si existen) del nodo actual a la cola para explorar más tarde
            if (temp.izquierda != null)
                cola.add(temp.izquierda);

            if (temp.derecha != null)
                cola.add(temp.derecha);
        }

        // Si llegamos aquí, el valor no se encontró en el árbol
        System.out.println("Valor no encontrado");
    }
}