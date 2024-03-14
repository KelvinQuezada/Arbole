/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol1;

/**
 *
 * @author petee
 */
public class Main {
    public static void main(String[] args) {
        ArbolGenealogico arbol = new ArbolGenealogico();       
        // Insertar nodos en el árbol
        arbol.insertar("Abuelo", "Padre", true); // Insertar padre como hijo izquierdo del abuelo
        arbol.insertar("Abuelo", "Tío", false); // Insertar tío como hijo derecho del abuelo
        arbol.insertar("Padre", "Hijo1", true); // Insertar hijo1 como hijo izquierdo del padre
        arbol.insertar("Padre", "Hijo2", false); // Insertar hijo2 como hijo derecho del padre
        arbol.insertar("Tío", "Primo1", true); // Insertar primo1 como hijo izquierdo del tío
        arbol.insertar("Tío", "Primo2", false); // Insertar primo2 como hijo derecho del tío
        // Visualizar el árbol
        System.out.println("Árbol Genealógico:");
        arbol.visualizar(arbol.raiz, "");
        // Buscar en el árbol   
        String nombreABuscar = "Hijo1";
        ArbolGenealogico.Nodo nodoBuscado = arbol.buscar(nombreABuscar);
        if (nodoBuscado != null) {
            System.out.println("\nNodo encontrado: " + nodoBuscado.nombre);
        } else {
            System.out.println("\nNodo no encontrado");
        }
    }
}