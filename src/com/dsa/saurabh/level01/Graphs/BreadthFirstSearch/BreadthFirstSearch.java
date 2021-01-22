package com.dsa.saurabh.level01.Graphs.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {


    private void traverse(Vertex vertex) {
        Queue<Vertex> vertexQueue = new LinkedList<>();
        vertex.setVisited(true);
        vertexQueue.add(vertex);

        while (!vertexQueue.isEmpty()) {
            Vertex actualVertex = vertexQueue.remove();
            System.out.print(actualVertex + " ");

            for (Vertex vertex1 : actualVertex.getAdjacencyList()) {
                if (!vertex1.isVisited()) {
                    vertex.setVisited(true);
                    vertexQueue.add(vertex1);
                }
            }
        }
    }

    public static void main(String[] args) {

        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");

        v1.addNeighbour(v2);
        v1.addNeighbour(v3);

        v3.addNeighbour(v4);
        v4.addNeighbour(v5);


        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.traverse(v1);
    }
}
