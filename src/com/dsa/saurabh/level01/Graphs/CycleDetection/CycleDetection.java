package com.dsa.saurabh.level01.Graphs.CycleDetection;

import java.util.Arrays;
import java.util.List;

public class CycleDetection {


    private void detectCycles(List<Vertex> vertexList) {
        for (Vertex vertex : vertexList) {
            if (!vertex.isVisited()) {
                detectCyclesDFS(vertex);
            }
        }
    }

    private void detectCyclesDFS(Vertex vertex) {

        // System.out.println("going to visit the vertex " + vertex);
        vertex.setBeingVisited(true);

        for (Vertex v : vertex.getAdjacencyList()) {
            if (v.isBeingVisited()) {
                System.out.println("Cycle detected in the graph...returning");
                return;
            }

            if (!v.isVisited()) {
                v.setVisited(true);
                detectCyclesDFS(v);
            }
        }
        // System.out.println("Setting " + vertex + " as beingVisited(false) and setVisited(true)");
        vertex.setBeingVisited(false);
        vertex.setVisited(true);

    }


    public static void main(String[] args) {
        CycleDetection cycleDetection = new CycleDetection();
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v5 = new Vertex("5");
        Vertex v4 = new Vertex("4");
        Vertex v8 = new Vertex("8");
        Vertex v9 = new Vertex("9");

        v1.addNeighbour(v2);
        v2.addNeighbour(v5);
        v5.addNeighbour(v1);

        v2.addNeighbour(v4);
        v4.addNeighbour(v8);
        v4.addNeighbour(v9);

        List<Vertex> vertices = Arrays.asList(v1, v2, v4, v5, v8, v9);
        cycleDetection.detectCycles(vertices);
    }
}
