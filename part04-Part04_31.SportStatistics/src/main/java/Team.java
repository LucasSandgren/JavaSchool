
public class Team {
    private String homeTeam, awayTeam;
    private int homeTeamPoints, awayTeamPoints, teamWins, teamLosses, totalGames;
    
    public Team(String homeTeam,String awayTeam, int homeTeamPoints,int awayTeamPoints){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.awayTeamPoints = awayTeamPoints;
    }
    public String getHomeTeam(){
        return this.homeTeam;
    }
    public String getAwayTeam(){
        return this.awayTeam;
    }
    public int getHomeTeamPoints(){
        return this.homeTeamPoints;
    }
    public int getAwayTeamPoints(){
        return this.awayTeamPoints;
    }
    public int teamWin(){
        return this.teamWins +=1;
    }
    public int teamLosses(){
        return this.teamLosses +=1;
    }
    public int playGame(){
        return this.totalGames +=1;
        
    }
    
}
