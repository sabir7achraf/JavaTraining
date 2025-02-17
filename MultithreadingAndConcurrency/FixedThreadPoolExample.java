package ma.ecole.MultithreadingAndConcurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolExample {
        public static void main(String[] args) {
            // Création d'un pool de threads fixe avec 3 threads
            ExecutorService executorService = Executors.newFixedThreadPool(3);

            // Soumission de 10 tâches au pool
            for (int i = 1; i <= 5; i++) {
                int taskNumber = i;
                executorService.execute(() -> {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("Tâche " + taskNumber + " exécutée par " + threadName);

                    try {
                        // Simuler un temps d'exécution de la tâche
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Tâche " + taskNumber + " interrompue.");
                    }

                    System.out.println("Tâche " + taskNumber + " terminée par " + threadName);
                });
            }

            // Arrêt de l'ExecutorService après soumission des tâches
            executorService.shutdown();

            try {
                // Attendre la fin de toutes les tâches pendant un maximum de 1 minute
                if (!executorService.awaitTermination(1, TimeUnit.MINUTES)) {
                    executorService.shutdownNow(); // Forcer l'arrêt si les tâches ne sont pas terminées
                }
            } catch (InterruptedException e) {
                executorService.shutdownNow();
            }

            System.out.println("Toutes les tâches ont été soumises.");
        }
    }


