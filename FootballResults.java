import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int wins = 0;
        int draws = 0;
        int loses = 0;

        for (int i = 0; i < 3; i++) {
            String first = read.nextLine();
            String[] goals = first.split(":") ;
            int a = Integer.parseInt(goals[0]);
            int b = Integer.parseInt(goals[1]);
            if (a>b){
                wins++;
            }else if (a<b){
                loses++;
            }
            if (a==b){
                draws++;
            }
        }
        System.out.printf("Team won %d games.%n",wins);
        System.out.printf("Team lost %d games.%n",loses);
        System.out.printf("Drawn games: %d",draws);
    }
}