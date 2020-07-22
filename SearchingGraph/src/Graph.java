import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	
	private int TotalVertices;
	private String[] vertices;
	private LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	Graph(int tv) {
		
		TotalVertices = tv;
		vertices = new String[TotalVertices];
		adj = new LinkedList[TotalVertices];
		
		vertices[0] = "Ali";
		vertices[1] = "Waseem";
		vertices[2] = "Baber";
		vertices[3] = "Imran";
		vertices[4] = "Noorulain";
		vertices[5] = "Aiman";
		vertices[6] = "Rimsha";
		vertices[7] = "Mahnoor";

		for (int i=0; i<TotalVertices; i++) {
			//vertices[i] = Character.toString((char)(65 + i));
			adj[i] = new LinkedList();
		}
		
	}
	
	
	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	
	void BFT(String name) {
		boolean[] visited = new boolean[TotalVertices];
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		int v=-1;
		
		for (int i=0; i<TotalVertices; i++)
			if (vertices[i].compareTo(name) == 0)
				v = i;
		if (v == -1)
			return;
		
		visited[v] = true;
		queue.add(v);
		
		while (queue.size() != 0) {
			v = queue.poll();
			System.out.print(vertices[v] + ", ");
			
			Iterator<Integer> i = adj[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (visited[n] == false) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	void DFTUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.print(vertices[v] + ", ");

		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (visited[n] == false) {
				DFTUtil(n, visited);
			}
		}
	}
	void DFT(String name) {
		boolean[] visited = new boolean[TotalVertices];
		
		int v=-1;
		for (int i=0; i<TotalVertices; i++)
			if (vertices[i].compareTo(name) == 0)
				v = i;
		if (v == -1)
			return;
		
		DFTUtil(v, visited);
	}

	boolean isCyclicUtil(int v, boolean visited[], boolean recStack[]) {
		
		if (recStack[v])
			return true;
		if (visited[v])
			return false;
		
		visited[v] = true;
		recStack[v] = true;

		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (isCyclicUtil(n, visited, recStack))
				return true;
		}
		recStack[v] = false;
		return false;
	}
	boolean isCyclic() {
		boolean[] visited = new boolean[TotalVertices];
		boolean[] recStack = new boolean[TotalVertices];
		
		for (int v=0; v<TotalVertices; v++) {
			if (isCyclicUtil(v, visited, recStack))
					return true;
		}
		
		return false;
	}

	int BFS(String findname) {
		boolean[] visited = new boolean[TotalVertices];
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		int v=0;
		
		visited[v] = true;
		queue.add(v);
		
		while (queue.size() != 0) {
			v = queue.poll();
			
			if (vertices[v].compareTo(findname) == 0) {
				return v;
			}
			
			Iterator<Integer> i = adj[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (visited[n] == false) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
		return -1;
	}

	int DFSUtil(String findname, int v, boolean visited[]) {
		visited[v] = true;
		if (vertices[v].compareTo(findname) == 0) {
			return v;
		}

		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (visited[n] == false) {
				int position = DFSUtil(findname, n, visited);
				if (position != -1)
					return position;
			}
		}
		return -1;
	}
	int DFS(String findname) {
		boolean[] visited = new boolean[TotalVertices];

		int position = DFSUtil(findname, 0, visited);
		
		return position;
	}

}
