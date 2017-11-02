package L04_Encapsulation_Exercises.P06_FootballTeamGenerator;

class ErrorMessages {
    static final String INVALID_NAME = "A name should not be empty.";
    private static final String INVALID_STAT = "%s should be between 0 and 100.";
    private static final String INVALID_PLAYER_TEAM = "Player %s is not in %s team.";
    private static final String TEAM_DOES_NOT_EXIST = "Team %s does not exist.";
    
    static String getInvalidStat(String statName) {
        return String.format(INVALID_STAT, statName);
    }
    
    static String getInvalidPlayerTeam(String playerName, String teamName) {
        return String.format(INVALID_PLAYER_TEAM, playerName, teamName);
    }
    
    static String getTeamDoesNotExist(String teamName) {
        return String.format(TEAM_DOES_NOT_EXIST, teamName);
    }
}
