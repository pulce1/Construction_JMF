package Sports;

public abstract class SportsTeam 
{
	private String teamName;
	private String teamMascot;
	private String headCoach;
	private int wins;
	private int losses;
	public double getWinPercentage;
	public SportsTeam()
	{
		this.teamName = " ";
		this.teamMascot = " "; 
		this.headCoach = " ";
		this.wins = 0;
		this.losses = 0;
	}
	public SportsTeam(String teamName, String teamMascot, String headCoach, int wins, int losses) {
		
		this.teamName = teamName;
		this.teamMascot = teamMascot; 
		this.headCoach = headCoach;
		this.wins = wins;
		this.losses = losses;
		
	}//end preferred constructor
	
	
	
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamMascot() {
		return teamMascot;
	}
	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}
	public String getHeadCoach() {
		return headCoach;
	}
	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	
	public void getWinPercentage(int getWinPercentage)
	{
		this.getWinPercentage = wins/(wins + losses);
	}
	
	public double getStats() {
		return getStats();
	}
	
	
	
	
	
}
