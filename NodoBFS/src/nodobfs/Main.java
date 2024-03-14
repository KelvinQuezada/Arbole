/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodobfs;

/**
 *
 * @author petee
 */
// Clase principal que contiene el método main para probar la funcionalidad del árbol
public class Main {
    public static void main(String[] args) {
        ArbolBFS arbol = new ArbolBFS();
        // Insertar algunos valores
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(30);
        arbol.insertar(40);
        arbol.insertar(50);
        arbol.insertar(25);
        // Mostrar la representación visual del árbol
        System.out.println("Representación visual del árbol:");
        imprimirArbol(arbol.raiz, 0);
        // Buscar un valor en el árbol
        arbol.buscar(30); // Debería encontrar el valor 30
    }

    // Método recursivo para imprimir la representación visual del árbol
    public static void imprimirArbol(NodoBFS nodo, int nivel) {
        if (nodo != null) {
            imprimirArbol(nodo.derecha, nivel + 1);
            for (int i = 0; i < nivel; i++)
                System.out.print("    ");
            System.out.println(nodo.valor);
            imprimirArbol(nodo.izquierda, nivel + 1);
        }
    }
}
