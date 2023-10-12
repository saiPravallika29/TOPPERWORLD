import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> candidates = new HashMap<>();
        System.out.println("Enter the number of candidates:");
        int numCandidates = input.nextInt();
        input.nextLine(); // consume newline
        
        for (int i = 1; i <= numCandidates; i++) {
            System.out.println("Enter the name of candidate " + i + ":");
            String candidateName = input.nextLine();
            candidates.put(candidateName, 0); // initialize votes to 0
        }
        System.out.println("Available Options:");
        System.out.println("1. Vote");
        System.out.println("2. Results");
        System.out.println("3. Quit");
        
        boolean running = true;
        
        while (running) {
            System.out.println("Enter option:");
            int option = input.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Enter the name of the candidate you want to vote for:");
                    input.nextLine(); // consume newline
                    String voteCandidate = input.nextLine();
                    
                    if (candidates.containsKey(voteCandidate)) {
                        candidates.put(voteCandidate, candidates.get(voteCandidate) + 1);
                        System.out.println("Vote successful!");
                    } else {
                        System.out.println("Invalid candidate!");
                    }
                    break;
                case 2:
                    System.out.println("Voting Results:");
                    for (String candidate : candidates.keySet()) {
                        int votes = candidates.get(candidate);
                        System.out.println(candidate + ": " + votes + " votes");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the Online Voting System. Have a nice day!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        
        input.close();
    }
}
