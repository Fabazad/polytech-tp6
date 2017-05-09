package graph.impl;

import graph.Edge;
import graph.Graph;
import graph.UndirectedEdge;
import graph.Vertex;

/**
 * A graph implementation
 *
 * @author Marc Chakiachvili
 * @version 1.0
 */
public class GraphImpl implements Graph {

    private Vertex[] vertices;
    private boolean[][] edges;
    private static int indexEdge;
    private static int indexVertices;


    public GraphImpl(int size) {
        // TODO complete
        indexEdge = 0;
        indexVertices = 0;
        vertices = new Vertex[size];
        edges = new boolean[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++) {
                edges[i][j] = false;
            }
        }
    }

    @Override
    public void addEdge(Edge edge) {
        // retrieve edge vertices index in vertices graph array
        int indexV1 = this.checkVertex(edge.getV1());
        int indexV2 = this.checkVertex(edge.getV2());
        // TODO manage errors
        if (indexV1 == -1){
            this.addVertex(edge.getV1());
            indexV1 = indexVertices;
        }
        if (indexV2 == -1){
            this.addVertex(edge.getV2());
            indexV2 = indexVertices;
        }
        edges[indexV1][indexV2] = true;
        edges[indexV2][indexV1] = true;
        System.out.println("Added Edge " + indexV1 + "/" + indexV2);
    }

    @Override
    public void addEdge(Vertex vertex, Vertex vertex1) {
        this.addVertex(vertex);
        this.addVertex(vertex1);
        this.addEdge(new UndirectedEdge(this, vertex, vertex1));
    }

    @Override
    public void addVertex(Vertex vertex) {
        if (checkVertex(vertex) == -1 && indexVertices < vertices.length) {
            vertices[indexVertices++] = vertex;
            System.out.println("Added Vertex:" + vertices[indexVertices - 1]);
        }
    }

    private int checkVertex(Vertex vertex){
        boolean exists = false;
        int i = 0;
        while (! exists && i < indexVertices) {
            exists = vertices[i].equals(vertex);
            i++;
        }
        // System.out.println("Exists ? "+ exists);
        return exists?i:-1;
    }

    @Override
    public void removeEdge(Edge edge) {
        for (int i = 0; i < indexEdge; i++) {
            //TODO finish :p
        }
    }

    @Override
    public void removeVertex(Vertex vertex) {
        //TODO finish
    }

    @Override
    public void printGraph() {
        System.out.println("--------------");
        System.out.println("Current Graph:");
        System.out.println("--------------");
        System.out.print("Vertices: ");
        for (int i = 0; i < indexVertices; i++) {
            System.out.print(vertices[i] + ", ");
        }
        System.out.println();
        System.out.print("Edges:");
        for (int i = 0; i < indexVertices; i++) {
            for (int j=0; j < indexVertices; j++) {
                if (edges[i][j]) {
                    System.out.print(vertices[i] + ", " + vertices[j]);
                }
            }
        }
        System.out.println();
        System.out.println("--------------");
    }


    @Override
    public Vertex[] getNeighbors(Vertex vertex) {
        //TODO write code
        return new Vertex[0];
    }

    @Override
    public Vertex[] getShortestPath(Vertex vertex, Vertex vertex1) {
        // TODO write code
        return new Vertex[0];
    }

    @Override
    public void deleteVertex(Vertex vertex) {
        //TODO write code
    }

    @Override
    public void deleteEdge(Edge edge) {
        //TODO write code
    }

}
