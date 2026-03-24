public class Arbol {

    Nodo raiz ;
    public Arbol() {
        raiz = null;
    }

    //Método para insertar
    public void insertar (int i, String fruta) {
        Nodo n = new Nodo(i);
        n.contenido = fruta;

        if (raiz == null) {
            raiz = n;
        }else{
            Nodo aux = raiz;
            //Aquí se comienza a definir donde nace el nodo
            while (aux != null) {
                n.padre = aux;
                if (n.llave >= aux.llave) {
                    aux = aux.derecha;
                }else {
                    aux = aux.izquierda;
                }
            }
            //Ahora hay que enlazar el Nodo
            if (n.llave < n.padre.llave) {
                n.padre.izquierda = n;
            }else {
                n.padre.derecha = n;
            }
        }
    }

    //Método para buscar
    public boolean buscar (int valor) {
        Nodo aux = raiz;
        while (aux != null) {
            if (valor == aux.llave) {
                return Boolean.TRUE;
            }else if (valor < aux.llave) {
                aux = aux.izquierda;
            }else {
                aux = aux.derecha;
            }
        }
        return false;
    }


    private void recorrer(Nodo n) {
        if(n != null) {
            recorrer(n.izquierda);
            System.out.println("Indice "+n.llave+" fruta "+n.contenido);
            recorrer(n.derecha);
        }
    }
    public void recorrer() {
        recorrer(raiz);
    }

    public void buscarYMostrar (int valor) {
        if (buscar(valor)){
            System.out.println("Clave "+valor+": Número encontrado");
        }else {
            System.out.println("Clave "+valor+": No existe");
        }
    }

    private static class Nodo {
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        public String contenido;

        public Nodo (int indice) {
            llave = indice;
            derecha = null;
            izquierda = null;
            padre = null;
        }


    }
}
