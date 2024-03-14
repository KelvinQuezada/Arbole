/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol1;

/**
 *
 * @author petee
 */
// Definición de la clase ArbolGenealogico
public class ArbolGenealogico {
    // Declaración de la variable de instancia raiz de tipo Nodo
    Nodo raiz;
    // Definición de la clase interna Nodo
    class Nodo {
        // Campos de la clase Nodo
        String nombre;  // Nombre de la persona representada por este nodo
        Nodo hijoIzquierdo;  // Referencia al hijo izquierdo
        Nodo hijoDerecho;    // Referencia al hijo derecho
        boolean esHijo;      // Indica si este nodo representa a un hijo

        // Constructor de la clase Nodo
        Nodo(String nombre, boolean esHijo) {
            // Inicialización de los campos
            this.nombre = nombre;
            this.esHijo = esHijo;
            this.hijoIzquierdo = null;
            this.hijoDerecho = null;
        }
    }

    // Método para insertar un nodo en el árbol
    void insertar(String padre, String hijo, boolean esHijoIzquierdo) {
        // Si la raíz es nula, se crea un nuevo nodo y se establece como raíz
        if (raiz == null) {
            raiz = new Nodo(padre, true);
        }
        // Buscar el nodo correspondiente al padre
        Nodo padreNode = buscar(padre);
        // Si se encuentra el nodo del padre
        if (padreNode != null) {
            // Si es hijo izquierdo, se crea un nuevo nodo y se establece como hijo izquierdo del padre
            if (esHijoIzquierdo) {
                padreNode.hijoIzquierdo = new Nodo(hijo, true);
            }
            // Si es hijo derecho, se crea un nuevo nodo y se establece como hijo derecho del padre
            else {
                padreNode.hijoDerecho = new Nodo(hijo, false);
            }
        }
    }

    // Método para buscar un nodo por nombre
    Nodo buscar(String nombre) {
        // Llamada al método recursivo de búsqueda
        return buscarRecursivo(raiz, nombre);
    }

    // Método recursivo para buscar un nodo por nombre
    Nodo buscarRecursivo(Nodo nodo, String nombre) {
        // Si el nodo actual es nulo, se devuelve nulo (no se encontró el nombre)
        if (nodo == null) {
            return null;
        }
        // Si el nombre del nodo actual coincide con el nombre buscado, se devuelve el nodo
        if (nodo.nombre.equals(nombre)) {
            return nodo;
        }
        // Se busca recursivamente en el hijo izquierdo
        Nodo izquierdo = buscarRecursivo(nodo.hijoIzquierdo, nombre);
        // Si se encuentra en el hijo izquierdo, se devuelve
        if (izquierdo != null) {
            return izquierdo;
        }
        // Si no se encontró en el hijo izquierdo, se busca en el hijo derecho y se devuelve
        return buscarRecursivo(nodo.hijoDerecho, nombre);
    }

    // Método para visualizar el árbol genealógico
    void visualizar(Nodo nodo, String espacio) {
        // Si el nodo actual no es nulo
        if (nodo != null) {
            // Se imprime el nombre del nodo con el nivel de indentación dado
            System.out.println(espacio + "└── " + nodo.nombre);
            // Se visualiza recursivamente el hijo izquierdo con un nivel de indentación mayor
            if (nodo.hijoIzquierdo != null) {
                visualizar(nodo.hijoIzquierdo, espacio + "    ");
            }
            // Se visualiza recursivamente el hijo derecho con un nivel de indentación mayor
            if (nodo.hijoDerecho != null) {
                visualizar(nodo.hijoDerecho, espacio + "    ");
            }
        }
    }
}
