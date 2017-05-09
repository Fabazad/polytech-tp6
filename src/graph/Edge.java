package graph;

/**
 * Represent a Edge between two vertices in a graph
 * @author Marc Chakiachvili
 * @version 1.0
 */
public abstract class Edge{

    /**
     * Related Graph
     * @see Graph
     */
	private Graph graph;

    /**
     * First Vertex for this Edge
     * @see Vertex
     */
	private Vertex v1;

    /**
     * Second Vertex for this Edge
     * @see Vertex
     */
	private Vertex v2;

    /**
     * Class Constructor
     * @param graph the related graph
     * @param v1 first Vertex
     * @param v2 second Vertex
     */
	public Edge(Graph graph, Vertex v1, Vertex v2){
		this.graph = graph;
		this.v1 = v1;
		this.v1.setGraph(graph);
		this.v2 = v2;
		this.v2.setGraph(graph);
	}

    /**
     * String representation for an edge
     * @return String
     */
	public String toString(){
	    return "(" + v1 + ", " + v2 + ")";
    }

    public Graph getGraph() {
        return graph;
    }

    public Vertex getV1() {
        return v1;
    }

    public Vertex getV2() {
        return v2;
    }

    public boolean equals(Edge o) {
	    return (this.v1.equals(o.getV1()) && this.v2.equals(o.getV2())
        || this.v1.equals(o.getV2()) && this.v2.equals(o.getV1()));
    }
}
