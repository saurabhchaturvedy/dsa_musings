package com.dsa.saurabh.level01.Graphs.TopologicalOrdering;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TopologicalOrdering {


    private Stack<Vertex> stack;

    TopologicalOrdering() {
        this.stack = new Stack<>();
    }

    private void TopologicalSort(List<Vertex> vertexList) {
        for (Vertex vertex : vertexList) {
            if (!vertex.isVisited()) {
                dfsTopologicalOrdering(vertex);
            }
        }
    }

    private void dfsTopologicalOrdering(Vertex vertex) {

        vertex.setVisited(true);

        for (Vertex v : vertex.getAdjacencyList()) {
            if (!v.isVisited()) {
                dfsTopologicalOrdering(v);
            }
        }
        stack.push(vertex);
    }

    private Stack<Vertex> getStack() {
        return stack;
    }

    public static void main(String[] args) {
        TopologicalOrdering topologicalOrdering = new TopologicalOrdering();
        Vertex v0 = new Vertex("0");
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");

        v3.addNeighbour(v1);
        v4.addNeighbour(v1);
        v4.addNeighbour(v0);
        v5.addNeighbour(v0);
        v2.addNeighbour(v3);

        List<Vertex> vertices = Arrays.asList(v0, v1, v2, v3, v4, v5);

        topologicalOrdering.TopologicalSort(vertices);

        Stack<Vertex> stack = topologicalOrdering.getStack();

        for (Vertex v : stack) {
            System.out.print(v.getData() + " ");
        }


    }
}
