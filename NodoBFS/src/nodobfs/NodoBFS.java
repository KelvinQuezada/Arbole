/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodobfs;

/**
 *
 * @author petee
 */
// Clase que representa un nodo en el árbol binario de búsqueda
public class NodoBFS {
    int valor; // Valor del nodo
    NodoBFS izquierda, derecha; // Referencias al hijo izquierdo y derecho del nodo
    // Constructor para inicializar un nodo con un valor dado
    public NodoBFS(int item) {
        valor = item;
        izquierda = derecha = null; // Inicialmente, los hijos izquierdo y derecho son nulos
    }
}
