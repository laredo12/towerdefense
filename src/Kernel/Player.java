package Kernel;

public class Player {
	private String name;
	private long battleGold;
	private long campaignGold;
	
	public long getGold()
	{
		return this.battleGold + this.campaignGold;
	}
	public long getBattleGold() {
		return battleGold;
	}
	public void setBattleGold(long battleGold) {
		this.battleGold = battleGold;
	}
	public long getCampaignGold() {
		return campaignGold;
	}
	public void setCampaignGold(long campaignGold) {
		this.campaignGold = campaignGold;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
