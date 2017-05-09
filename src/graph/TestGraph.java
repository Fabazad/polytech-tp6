package graph;

/**
 * Graph Package test Class
 * @author Marc Chakiachvili
 * @version 1.0
 */
public class TestGraph {

	/***
	 * Very simple package Test
	 * @param args
	 */
	public static void main(String[] args) {
		Graph graph = null;
		Vertex v = new Vertex(graph, new Integer(1));
		Vertex v2 = new Vertex(graph, new String("Test String inside"));
		UndirectedEdge e = new UndirectedEdge(graph, v, v2);
		DirectedEdge e1 = new DirectedEdge(graph, v, v2);

		System.out.println("Vertex: " + v);
		System.out.println("Vertex: " + v2);
		System.out.println("Edge:" + e);
		System.out.println("DirectedEdge:" + e1);
	}
	
}
