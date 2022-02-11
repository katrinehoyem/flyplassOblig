import java.sql.Array;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Flyplass {
    private String fly;
    private int tidsenhet;
    private int antallAnkomst;
    private int antallAvganger;


    public Flyplass(String nvn) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velkommen til Halden lufthavn");
        System.out.println("Antall tidsenheter skal simuleringen gå?" + tidsenhet);
        tidsenhet = scanner.nextInt();
        System.out.println("Forventet antall ankomster pr. tidsenhet?" + antallAnkomst);
        antallAnkomst = scanner.nextInt();
        System.out.println("Forventet antall avganger pr. tidsenhet??" + antallAvganger);
        antallAvganger = scanner.nextInt();

    }
    private class fly {
        private int ankomst;
        public fly(int ankomst) {this.ankomst = ankomst;}
        public int venteTid(int tid) {return tid - ankomst;}
    }
    private class avgang {
        private int tidFerdigAvgang;
        public avgang(){tidFerdigAvgang = 0;}
        public void settTidFerdigAvgang(int tid) {tidFerdigAvgang = tid;}
        public boolean erLedig(int tid) {return tid >= tidFerdigAvgang;}
    }
    public void simuler(){
        int totalAvgangTid = 0;
        int totalVentetid = 0;
        int totalAntFly = 0;
        int totAntLedig = 0;

        Queue<String> landingKo = new LinkedList<fly>();
        Queue<String> avstigningsKo = new PriorityQueue<>();

        for (int tid = 0; tid < tidsenhet; tid++){
            avstigningsKo[] avko = new avstigningsKo[][antallAvganger];
        }
    }
    private static int getPoissonRandom(double mean) {
        Random r = new Random();
        double L = Math.exp(-mean);
        int k = 0;
        double p = 1.0;
        do {
            p = p * r.nextDouble();
            k++;
        } while (p > L);
        return k - 1;
    }


}