package sapient.cricket.response;

public class SapientCricketResponse {

    private String team1;
    private String team2;
    private String matchUniqueId;
    private String teamScore;
    private String roundRotation;

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getMatchUniqueId() {
        return matchUniqueId;
    }

    public void setMatchUniqueId(String matchUniqueId) {
        this.matchUniqueId = matchUniqueId;
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
