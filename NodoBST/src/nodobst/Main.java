/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodobst;

/**
 *
 * @author petee
 */
public class Main {
    public static void main(String[] args) {
        ArbolBST arbol = new ArbolBST(); // Creación de un objeto ArbolBST
        // Insertar elementos en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);
        // Recorridos del árbol
        System.out.println("Recorrido Inorden:");
        arbol.recorridoInorden(arbol.raiz); // Recorrido inorden del árbol
        System.out.println("\nRecorrido Preorden:");
        arbol.recorridoPreorden(arbol.raiz); // Recorrido preorden del árbol
        System.out.println("\nRecorrido Postorden:");
        arbol.recorridoPostorden(arbol.raiz); // Recorrido postorden del árbol
        // Representación visual del árbol
        System.out.println("\n\nRepresentación visual del árbol:");
        arbol.imprimirArbol(); // Imprime la representación visual del árbol
        // Buscar elementos en el árbol
        System.out.println("\n\nBuscar elementos:");
        arbol.buscar(20);
    }
}
