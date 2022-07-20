package Sports;

public class BasketballTeam extends SportsTeam {

	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	public BasketballTeam()
	{
		super();
		
		this.fieldGoals = 40;
		this.fieldGoalsAttempted = 55;
		this.freeThrows = 10;
		this.freeThrowsAttempted = 17;
	}
	public BasketballTeam(String teamName, String teamMascot, String headCoach, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted)
	{
		this.setTeamName(teamName);
		this.setTeamMascot(teamMascot);
		super.setHeadCoach(headCoach);
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
	}

	
	public double fieldGoalPercentage() {
		return fieldGoals/fieldGoalsAttempted;
	}
	
	public double freeThrowPercentage() {
		return freeThrows/freeThrowsAttempted;
	}
	
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		this.setStats(wins, losses, fieldGoals, fieldGoalsAttempted, freeThrows, freeThrowsAttempted);
	}
	@Override
	public String toString() {
		return "BasketballTeam [fieldGoals=" + fieldGoals + ", fieldGoalsAttempted=" + fieldGoalsAttempted
				+ ", freeThrows=" + freeThrows + ", freeThrowsAttempted=" + freeThrowsAttempted + ", getTeamName()="
				+ getTeamName() + ", getTeamMascot()=" + getTeamMascot() + ", getHeadCoach()=" + getHeadCoach()
				+ ", getWins()=" + getWins() + ", getLosses()=" + getLosses() + "]";
	}
	
	
	
	
}
