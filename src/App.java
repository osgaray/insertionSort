public class App {
    // Metodo que recibe un array y lo ordena mediante inserción
    public static void insertionSort(int[]array) {

        // bucle for que inicia de 1 hasta la longitud del arreglo
        for (int i = 1; i < array.length;i++){
            // se selecciona valor del arreglo que se va a comparar
            int key = array[i];
            /* se crea un indice j en la posición anterior del indice
            que se esta comparando para mover los elementos */
            int j = i-1;
            /* mientras el indice j sea mayor o igual a 0, y el 
            valor en el indice j (izquierdo) sea menor al 
            que se va a comparar (derecho) */
            while (j >= 0 && array[j] > key) {
                /* se coloca el valor de j en i (j+1), es decir, se desplaza
                   hacia la derecha el valor de j*/
                array[j+1] = array[j];
                // disminuir el índice j
                j--;
            }
            // cuando salga del while, se coloca el dato de "key" en su lugar
            array[j+1] = key;
        }
    }
    public static void main(String[] args) throws Exception {
        // crea un arreglo con numeros aleatorios desordenados
        int[] array = {21,37,43,15,52};
        
        System.out.println("Array original:");

        // imprimir cada elemento del arreglo desordenado separado por espacio
        for (int i : array) {
            System.out.print(i+" ");
        }

        System.out.println(); /* siguiente linea */

        insertionSort(array); /* metodo de ordenamiento por inserción */

        System.out.println("Array ordenada: ");
        // imprimir cada elemento del arreglo ordenado separado por espacio
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}