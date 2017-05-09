package graph;

/**
 * Represent a non oriented edge
 * @author Marc Chakiachvili
 * @version 1.0
 */
public class UndirectedEdge extends Edge{

	/**
	 * Create a new undirected edge between Vertices in the graph
	 * @param g the containing graph
	 * @param v1 the first Vertex
	 * @param v2 the sedonc Vertex
	 */
	public UndirectedEdge(Graph g, Vertex v1, Vertex v2){
		super(g, v1, v2);
	}
}
