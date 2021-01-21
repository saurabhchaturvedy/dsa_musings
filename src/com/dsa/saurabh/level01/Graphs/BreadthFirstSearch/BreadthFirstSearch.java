package com.dsa.saurabh.level01.Graphs.BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {


    private void traverse(Vertex vertex) {
        Queue<Vertex> vertexQueue = new LinkedList<>();
        vertex.setVisited(true);
        vertexQueue.add(vertex);

        while (!vertexQueue.isEmpty()) {
            Vertex actualVertex = vertexQueue.remove();
            System.out.print(actualVertex);

            for (Vertex vertex1 : actualVertex.getAdjacencyList()) {
                if (!vertex1.isVisited()) {
                    vertex.setVisited(true);
                    vertexQueue.add(vertex);
                }
            }
        }
    }

    public static void main(String[] args) {

        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");

        A.addNeighbour(B);
        A.addNeighbour(C);

        B.addNeighbour(A);

        C.addNeighbour(A);



        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.traverse(A);
    }
}
