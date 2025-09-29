/**
 * Algoritmo de ordenacao Quicksort
 * 
 * @author Max do Val Machado
 * @version 3 08/2020
 */
class Quicksort extends Geracao {

   /**
    * Construtor.
    */
   public Quicksort() {
      super();
   }

   /**
    * Construtor.
    * 
    * @param int tamanho do array de numeros inteiros.
    */
   public Quicksort(int tamanho) {
      super(tamanho);
   }

   /**
    * Algoritmo de ordenacao Quicksort.
    */
   @Override
   public void sort() {
      quickSortFirstPivot(0, n - 1);
   }

   /**
    * Algoritmo de ordenacao Quicksort.
    * 
    * @param int esq inicio do array a ser ordenado
    * @param int dir fim do array a ser ordenado
    */
   private void quickSortFirstPivot(int esq, int dir) {
      int i = esq, j = dir;
      int pivo = array[esq];
      while (i <= j) {
         while (array[i] < pivo)
            i++;
         while (array[j] > pivo)
            j--;
         if (i <= j) {
            swap(i, j);
            i++;
            j--;
         }
      }
      if (esq < j)
         quickSortFirstPivot(esq, j);
      if (i < dir)
         quickSortFirstPivot(i, dir);
   }

   private void quickSortLastPivot(int esq, int dir) {
      int i = esq, j = dir;
      int pivo = array[dir];
      while (i <= j) {
         while (array[i] < pivo)
            i++;
         while (array[j] > pivo)
            j--;
         if (i <= j) {
            swap(i, j);
            i++;
            j--;
         }
      }
      if (esq < j)
         quickSortLastPivot(esq, j);
      if (i < dir)
         quickSortLastPivot(i, dir);
   }

   private void quickSortRandomPivot(int esq, int dir) {
      int i = esq, j = dir;
      // NUMERO ALEATORIO ENTRE ESQUERDA E DIREITA
      int numeroAleatorio = esq + (int) (Math.random() * (dir - esq + 1));
      int pivo = array[numeroAleatorio];
      while (i <= j) {
         while (array[i] < pivo)
            i++;
         while (array[j] > pivo)
            j--;
         if (i <= j) {
            swap(i, j);
            i++;
            j--;
         }
      }
      if (esq < j)
         quickSortRandomPivot(esq, j);
      if (i < dir)
         quickSortRandomPivot(i, dir);
   }

   private void quickSortMedianOfThree(int esq, int dir) {
      int i = esq, j = dir;
      int mediana = ((array[esq] + array[dir] + array[(esq + dir) / 2]) / 3);
      int pivo = mediana;
      while (i <= j) {
         while (array[i] < pivo)
            i++;
         while (array[j] > pivo)
            j--;
         if (i <= j) {
            swap(i, j);
            i++;
            j--;
         }
      }
      if (esq < j)
         quickSortMedianOfThree(esq, j);
      if (i < dir)
         quickSortMedianOfThree(i, dir);
   }
}
