package graph;

/**
 * Represent an oriented edge
 * @author Marc Chakiachvili
 * @version 1.0
 */
public class DirectedEdge extends Edge {

	/**
	 * Directed Edge source
	 */
	private Vertex source;

	/**
	 * Create a Directed Edge, v1 is used as source
	 * @param g
	 * @param v1
	 * @param v2
	 */
	public DirectedEdge(Graph g, Vertex v1, Vertex v2){
		super(g, v1, v2);
		this.source = v1;
	}

	/**
	 * Create a Directed Edge, last parameter set up Edge origin, if not set, v1 is used as source
	 * @param g the containing graph
	 * @param v1 one Vertex
	 * @param v2 another Vertex
	 * @param source edge origin
	 */
	public DirectedEdge(Graph g, Vertex v1, Vertex v2, Vertex source){
		super(g, v1, v2);
		this.source = source;
	}

	public String toString(){
		return super.toString() + "{o" + this.source +"}";
	}
}
