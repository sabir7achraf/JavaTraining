package ma.ecole.SortingAndSearchingAlgorithms;
// we just base on comparaison betwen adjuscent (bubbel) and we swap 
//if in the nested loop there is no swap(swap==false) that mean our array is sorted
public class BubbelSort {


        // Méthode pour effectuer le tri à bulles
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped; // Pour optimiser l'algorithme

            // Boucle externe pour parcourir le tableau
            for (int i = 0; i < n - 1; i++) {
                swapped = false;

                // Boucle interne pour comparer les éléments adjacents
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Échanger les éléments si ils sont dans le mauvais ordre
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true; // Un échange a eu lieu
                    }
                }

                // Si aucun échange n'a eu lieu, le tableau est déjà trié
                if (!swapped) {
                    break;
                }
            }
        }

        // Méthode pour afficher le tableau
        public static void printArray(int[] arr) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Méthode principale pour tester le tri à bulles
        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Tableau avant le tri :");
            printArray(arr);

            // Appliquer le tri à bulles
            bubbleSort(arr);

            System.out.println("Tableau après le tri :");
            printArray(arr);
        }
    }

