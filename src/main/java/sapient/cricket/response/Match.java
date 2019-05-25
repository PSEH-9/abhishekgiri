package sapient.cricket.response;


public class Match {

    private String unique_id;
    private String date;
    private boolean squad;
    private String team2;
    private String team1;
    private boolean matchStarted;
    private String teamScore;
    private String roundRotation;


    public String getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isSquad() {
        return squad;
    }

    public void setSquad(boolean squad) {
        this.squad = squad;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public boolean isMatchStarted() {
        return matchStarted;
    }

    public void setMatchStarted(boolean matchStarted) {
        this.matchStarted = matchStarted;
    }

    public String getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(String teamScore) {
        this.teamScore = teamScore;
    }

    public String getRoundRotation() {
        return roundRotation;
    }

    public void setRoundRotation(String roundRotation) {
        this.roundRotation = roundRotation;
    }
}
