
public class SearchingGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Graph Example");
		System.out.println("--------------------------------------------");

		Graph g = new Graph(8);
		
		g.addEdge(0, 1);
		g.addEdge(1, 0);
		g.addEdge(0, 2);
		g.addEdge(2, 0);
		g.addEdge(1, 3);
		g.addEdge(3, 1);
		g.addEdge(1, 4);
		g.addEdge(4, 1);
		g.addEdge(2, 4);
		g.addEdge(4, 2);
		g.addEdge(3, 4);
		g.addEdge(4, 3);
		g.addEdge(3, 5);
		g.addEdge(5, 3);
		g.addEdge(4, 5);
		g.addEdge(5, 4);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		
		System.out.println("-------------------------------------");
		System.out.println("Breadth First Traversal");
		System.out.println("-------------------------------------");
		g.BFT("Ali1");
		System.out.println("");
		System.out.println("-------------------------------------");

		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("Depth First Traversal");
		System.out.println("-------------------------------------");
		g.DFT("Ali");
		System.out.println("");
		System.out.println("-------------------------------------");

		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("Graph is Cyclic or not");
		System.out.println("-------------------------------------");
		if (g.isCyclic() == true)
			System.out.println("Graph is Cyclic");
		else
			System.out.println("Graph is Not Cyclic");
		System.out.println("-------------------------------------");

	
		System.out.println("-------------------------------------");
		System.out.println("Breadth First Search");
		System.out.println("-------------------------------------");
		int BFSposition = g.BFS("Noorulain");
		if (BFSposition == -1)
			System.out.println("Record not Found!");
		else
			System.out.println("Name found at Vertex Position "+BFSposition);
		System.out.println("-------------------------------------");

		System.out.println("-------------------------------------");
		System.out.println("Depth First Search");
		System.out.println("-------------------------------------");
		int DFSposition = g.DFS("Noorulain");
		if (DFSposition == -1)
			System.out.println("Record not Found!");
		else
			System.out.println("Name found at Vertex Position "+DFSposition);
		System.out.println("-------------------------------------");
	}

}
