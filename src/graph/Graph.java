package graph;

/**
 * Classic graph API
 * @author Marc Chakiachvili
 * @version 1.0
 */
public interface Graph {

	/**
	* Add a edge to graph
	* @param e the edge to add
	*/
	void addEdge(Edge e);


    /**
     * Add edge from Vertex v1 to Vertex v2
     * @param v2 Vertex
     * @param v1 Vertex
     */
    void addEdge(Vertex v1, Vertex v2);

	/**
	* Add a new Vertext to the graph
	* @param v the new Vertex
	*/
	void addVertex(Vertex v);

	/**
	* Remove corresponding edge from graph
	* @param e the edge to remove
	*/
	void removeEdge(Edge e);

	/**
	* Remove this vertex from graph
	* Delete all related Edges
	* @param v the vertex to remove
	*/
	void removeVertex(Vertex v);
	/**
	* Print out all Vertex followed by their related Edges
	*/
	void printGraph();

	// Other common Graph actions

	/**
	 * Return nearest neighbors from v
	 * @param v
	 * @return Vertex[]
	 */
	Vertex[] getNeighbors(Vertex v);

	/**
	 * Calculate shortest path from v1 to v2
	 * @param v1 a Vertex
	 * @param v2 another Vertex
	 * @return Vertex[] list of vertices forming path
	 */
	Vertex[] getShortestPath(Vertex v1, Vertex v2);

	/**
	 * Delete related vertex from graph
	 * @param v Vertex
	 */
	void deleteVertex(Vertex v);

	/**
	 * Delete related Edge from graph
	 * @param e Edge
	 */
	void deleteEdge(Edge e);

} 
