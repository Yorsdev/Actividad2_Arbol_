

public static void main(String[] args) {

    //Se instancia el arbol
    Arbol arbol = new Arbol();

    //Se inserta un elemento Fruta con su identificador
    arbol.insertar(4, "Naranja");
    arbol.insertar(8, "Manzana");
    arbol.insertar(1, "Uva");
    arbol.insertar(9, "Sandía");
    arbol.insertar(7, "Pera");

    System.out.println("====  RECORRIDO INORDEN  ====");
    arbol.recorrer();

    System.out.println();
    System.out.println("====  BÚSQUEDA Y MUESTRA  ====");
    //Se busca y muestra el valor ingresado manualmente
    arbol.buscarYMostrar(4);
    arbol.buscarYMostrar(5);
    arbol.buscarYMostrar(7);
}
