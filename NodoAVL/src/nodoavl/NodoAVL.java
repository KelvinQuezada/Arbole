/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodoavl;

/**
 *
 * @author petee
 */
public class NodoAVL {
    int valor; // Valor almacenado en el nodo
    int altura; // Altura del nodo en el árbol AVL
    NodoAVL izquierda; // Referencia al hijo izquierdo del nodo
    NodoAVL derecha; // Referencia al hijo derecho del nodo

    // Constructor para inicializar un nuevo nodo AVL con un valor dado
    public NodoAVL(int item) {
        valor = item; // Asignar el valor proporcionado al nodo
        altura = 1; // Inicializar la altura en 1, ya que un nodo recién creado siempre tiene altura 1
// Inicializar ambas referencias a nodos hijo como null, indicando que el nodo recién creado no tiene hijos
        izquierda = derecha = null; 
    }
}

