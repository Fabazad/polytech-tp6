package graph.impl;

import graph.Vertex;

public class TestGraphImpl {

    public static void main(String[] args) {
	    // write your code here
        GraphImpl myGraph = new GraphImpl(100);
        myGraph.addEdge(new Vertex(myGraph, "V1"), new Vertex(myGraph, "Vertex 2"));
        myGraph.printGraph();
    }
}
