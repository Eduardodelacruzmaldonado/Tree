package fes.aragon;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioOrden<Integer> arbol = new ArbolBinarioOrden<>();
        arbol.insertar(10);
        arbol.insertar(11);
        arbol.insertar(12);
        arbol.insertar(13);
        System.out.println(arbol.getRaiz().derecho.dato);
    }
}
