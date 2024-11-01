package fes.aragon;

public class ArbolBinarioOrden<E> {
    protected Nodo<E> raiz;
    public ArbolBinarioOrden(){
        raiz=null;
    }
    public Nodo<E> getRaiz(){
        return raiz;
    }
    public void insertar(E dato){
        Nodo<E> n=raiz;
        Nodo<E> previo=null;
        while (n!=null){
            previo=n;
            if (n.mayor(dato)){
                n=n.derecho;
            }else {
                n=n.izquierdo;
            }
        }
        if (raiz==null){
            raiz=new Nodo<E>(dato,"raiz");
        } else if (previo.mayor(dato)) {
            previo.derecho=new Nodo<>(dato,"derecho,padre="+previo.dato);
        }else {
            previo.izquierdo=new Nodo<>(dato,"izquierdo,padre="+previo.dato);
        }
    }
/*
    public void eliminar(int dato){
        Nodo tmp, nodo, n=raiz, previo=null;
        while ((n!=null) && (n.dato! =dato)){
            previo=n;
            if (n.dato < dato){
                n=n.derecho;
            }else {
                n=n.izquierdo;
            }
        }
        nodo=n;
        if(n!=null && n.dato==dato){
            if (nodo.derecho==null){
                nodo=nodo.izquierdo;
            }else if (nodo.izquierdo == null){
                nodo=nodo.derecho;
            }else {
                tmp=nodo.izquierdo;//1
                while (tmp.derecho!=null){ //2
                    tmp=tmp.derecho;
                }
                tmp.derecho=nodo.derecho; //3
                nodo=nodo.izquierdo;     //4
            }
            if (n==raiz){
                raiz=nodo;
            } else if (previo.izquierdo==n) {
                previo.izquierdo=nodo;
            }else {
                previo.derecho=nodo;  //5
            }
        } else if (raiz!=null){
            System.out.println("No se encuentra el dato"+dato);
        }else {
            System.out.println("Arbol vacio");
        }
    }

 */

}
