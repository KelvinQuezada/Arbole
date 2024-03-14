/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodobst;

/**
 *
 * @author petee
 */
public class NodoBST {
    int valor; // Valor almacenado en el nodo
    NodoBST izquierda, derecha; // Referencias al hijo izquierdo y al hijo derecho del nodo

    // Constructor que inicializa un nodo con el valor proporcionado
    public NodoBST(int item) {
        valor = item;
        izquierda = derecha = null; // Inicialmente no tiene hijos
    }
}
