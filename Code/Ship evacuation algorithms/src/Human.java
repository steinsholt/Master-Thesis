import java.util.ArrayList;
import java.util.List;


public class Human {
	
	private List<Integer> familiarTies;
	private double chanceOfPanic;
	private boolean panicState;
	private int nodeID;
	private int humanID;
	
	public Human (List<Integer> familiarTies, boolean panicState, int nodeID, int humanID){
		this.familiarTies = familiarTies;
		this.panicState = panicState;
		this.nodeID = nodeID;
		this.humanID = humanID;
	}
	
	public int getHumanID() {
		return humanID;
	}
	
	public boolean isPanicState() {
		return panicState;
	}
	
	public void setPanicState(boolean panicState) {
		this.panicState = panicState;
	}
	
	public int getNodeID() {
		return nodeID;
	}

	public void setNodeID(int nodeID) {
		this.nodeID = nodeID;
	}	
	
	public double getChanceOfPanic() {
		return chanceOfPanic;
	}
	
	public void setChanceOfPanice (double chance){
		this.chanceOfPanic = chance;
	}
	
	public List<Integer> getFamiliarTies() {
		return familiarTies;
	}
	
	public void setIDFamiliarTies(List<Integer> familiarTies){
		this.familiarTies = familiarTies;
	}
	
	public void addFamilyMember(Integer h){
		familiarTies.add(h);
	}
	
	public void setHumanFamiliarTies(List<Human> familiarTies){
		for(Human h : familiarTies){
			if(this.humanID == h.getHumanID()){
				
			}
			else if(this.familiarTies.contains(h.getHumanID())){
				
			}
			else{
				this.addFamilyMember(h.getHumanID());
			}
		}
	}
}
