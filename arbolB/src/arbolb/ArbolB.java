/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolb;

/**
 *
 * @author petee
 */
public class ArbolB {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        // Insertar nodos
        arbol.insertarNodo(50);
        arbol.insertarNodo(30);
        arbol.insertarNodo(70);
        arbol.insertarNodo(20);
        arbol.insertarNodo(40);
        // Realizar recorridos
        System.out.println("Recorrido Preorden:");
        arbol.recorridoPreorden();
        System.out.println("\nRecorrido Inorden:");
        arbol.recorridoInorden();
        System.out.println("\nRecorrido Postorden:");
        arbol.recorridoPostorden();
    }
}
