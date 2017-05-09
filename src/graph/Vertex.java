package graph;

public class Vertex {

    /**
     * Associated object
     */
    private Object object;

    /**
     * Associated Graph object
     */
    private Graph graph;

    /**
     * Class Constructor
     *
     * @param graph  the attached graph
     * @param object the object included in Vertex
     */
    public Vertex(Graph graph, Object object) {
        this.object = object;
        this.graph = graph;
    }

    /**
     * Create a new Vertex not attached with special graph
     *
     * @param object
     */
    public Vertex(Object object) {

        this.object = object;
    }

    /**
     * Set up attached graph
     *
     * @param g
     */
    public void setGraph(Graph g) {
        this.graph = g;
    }

    /**
     * @return the object contained in Vertex
     */
    public Object getObject() {
        return object;
    }

    /**
     * Set up object in vertex
     *
     * @param object
     */
    public void setObject(Object object) {
        this.object = object;
    }

    /**
     * Get current attached graph
     *
     * @return Graph
     */
    public Graph getGraph() {
        return graph;
    }

    /**
     * Delete Vertex from graph
     */
    public void delete() {
        //graph.deleteVertex(this);
        //graph.deleteEdges(this);
    }

    /**
     * Representation for a Vertex
     *
     * @return String
     */
    @Override
    public String toString() {
        return "[" + this.object.toString() + "]";
    }

    public boolean equals(Vertex o) {
        return this.object.equals(o);
    }
}