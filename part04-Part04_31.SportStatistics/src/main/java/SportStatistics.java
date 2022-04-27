
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    private static int count = 0, wins = 0, losses = 0;
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("File: ");
        String readerInput = SC.nextLine();
        System.out.println("Team: ");
        String teamName = SC.nextLine();
        
        ArrayList<Team> teamRecords = readRecordsFromAFile(readerInput);
        
        for(Team teams : teamRecords){
            if(teams.getHomeTeam().contains(teamName)){
                count += 1;
                if(teams.getHomeTeamPoints()>=teams.getAwayTeamPoints()){
                    wins +=1;
                    teams.teamWin();
            } else {
                losses += 1;    
                teams.teamLosses();
        } if(teams.getAwayTeam().contains(teamName)){
            count += 1;
                if (teams.getAwayTeamPoints()>=teams.getHomeTeamPoints()){
                    wins += 1;
                    teams.teamWin();
                }
        } teams.playGame();
            }
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    public static ArrayList<Team>readRecordsFromAFile(String readerInput){
        ArrayList<Team> teams = new ArrayList<>();
        String[]fileParts;
        String homeTeam;
        String awayTeam;
        int homeTeamPoints;
        int awayTeamPoints;
        
        try (Scanner fileScan = new Scanner(Paths.get(readerInput))){
            while (fileScan.hasNextLine()){
                String fileLine = fileScan.nextLine();
                fileParts = fileLine.split(",");
                
                homeTeam = fileParts[0];
                awayTeam = fileParts[1];
                homeTeamPoints = Integer.valueOf(fileParts[2]);
                awayTeamPoints = Integer.valueOf(fileParts[3]);
                
                teams.add(new Team(homeTeam, awayTeam, homeTeamPoints, awayTeamPoints));
            }
        } catch (IOException ex){
            System.out.println("Error: " +ex.getMessage());
        }
        return teams;
    } 
}



