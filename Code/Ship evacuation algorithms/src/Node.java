import java.util.ArrayList;


public class Node {
	public enum NodeType { STAIRS, GUESTROOM, HALLWAY, DININGROOM, GAMEROOM, SHOP }
	private float chanceOfDeath;
	private int capacity;
	private NodeType nodeType;
	private ArrayList<Edge> listOfPaths;
	private int nodeID;	
	private int florNumber;
	private boolean isExit;
	private int amountOfPheromones;
	public boolean hasWayToExit = false;
	
	
	
	public Node(int NodeID, NodeType nt, int cap, int fNumber)
	{
		this.nodeType = nt;
		this.capacity = cap;
		this.nodeID = NodeID;
		this.florNumber = fNumber;
	}
	
	public int getID()
	{
		return nodeID;
	}
	
	public void addEdge(Edge e)
	{
		listOfPaths.add(e);
	}
	public ArrayList<Edge> getPaths()
	{
		return listOfPaths;
	}
}
