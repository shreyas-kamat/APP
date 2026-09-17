import java.util.*;

class Candidate {
    int Candidate_Id;
    String name;
    int aptitude;
    int technical;
    int communication;

    Candidate(int Candidate_Id, String name, int aptitude, int technical, int communication) {
        this.Candidate_Id = Candidate_Id;
        this.name = name;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }

    int getTotalScore() {
        return aptitude + technical + communication;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Candidate[] candidates = new Candidate[n];

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int aptitude = sc.nextInt();
            int technical = sc.nextInt();
            int communication = sc.nextInt();

            candidates[i] = new Candidate(id, name, aptitude, technical, communication);
        }

        // Selection sort: higher total score first, smaller Candidate ID breaks a tie
        for (int i = 0; i < n - 1; i++) {
            int best = i;
            for (int j = i + 1; j < n; j++) {
                boolean higherScore = candidates[j].getTotalScore() > candidates[best].getTotalScore();
                boolean sameScore = candidates[j].getTotalScore() == candidates[best].getTotalScore();
                boolean smallerId = candidates[j].Candidate_Id < candidates[best].Candidate_Id;

                if (higherScore || (sameScore && smallerId)) {
                    best = j;
                }
            }
            Candidate temp = candidates[i];
            candidates[i] = candidates[best];
            candidates[best] = temp;
        }

        for (int i = 0; i < k; i++) {
            System.out.println(candidates[i].Candidate_Id + " " + candidates[i].name + " " + candidates[i].getTotalScore());
        }

        sc.close();
    }
}
