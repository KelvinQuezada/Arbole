/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolb;

/**
 *
 * @author petee
 */
public class ArbolBinario {
    Nodo raiz;//Atributos 
    public ArbolBinario() {//Constructor 
        this.raiz = null;
    }
    // Método para insertar un nodo en el árbol
    public void insertarNodo(int valor) {
        raiz = insertarRec(raiz, valor);
    }
// Método privado recursivo para insertar un nodo en el árbol
    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return new Nodo(valor);
        }
        if (valor < raiz.valor) {
            raiz.izquierda = insertarRec(raiz.izquierda, valor);
        } else if (valor > raiz.valor) {
            raiz.derecha = insertarRec(raiz.derecha, valor);
        }
        return raiz;
    }
    // Recorrido preorden: raíz - izquierda - derecha
    public void recorridoPreorden() {
        recorridoPreordenRec(raiz);
    }
    // Método privado recursivo para realizar el recorrido preorden
    private void recorridoPreordenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            recorridoPreordenRec(raiz.izquierda);
            recorridoPreordenRec(raiz.derecha);
        }
    }

    // Recorrido inorden: izquierda - raíz - derecha
    public void recorridoInorden() {
        recorridoInordenRec(raiz);
    }
    // Recorrido inorden: izquierda - raíz - derecha
    private void recorridoInordenRec(Nodo raiz) {
        if (raiz != null) {
            recorridoInordenRec(raiz.izquierda);
            System.out.print(raiz.valor + " ");
            recorridoInordenRec(raiz.derecha);
        }
    }
    // Recorrido postorden: izquierda - derecha - raíz
    public void recorridoPostorden() {
        recorridoPostordenRec(raiz);
    }
    // Método privado recursivo para realizar el recorrido postorden
    private void recorridoPostordenRec(Nodo raiz) {
        if (raiz != null) {
            recorridoPostordenRec(raiz.izquierda);
            recorridoPostordenRec(raiz.derecha);
            System.out.print(raiz.valor + " ");
        }
    }
}
