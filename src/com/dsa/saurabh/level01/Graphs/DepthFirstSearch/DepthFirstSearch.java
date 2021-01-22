package com.dsa.saurabh.level01.Graphs.DepthFirstSearch;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {


    private Stack<Vertex> stack;

    DepthFirstSearch() {
        this.stack = new Stack<>();
    }


    private void DFS(List<Vertex> vertexList) {
        for (Vertex v : vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsWithStack(v);
            }
        }
    }

    private void dfsRecursive(Vertex v)
    {
        System.out.print(v+" ");
        for (Vertex vertex : v.getAdjacencyList()) {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                dfsRecursive(vertex);
            }
        }

    }

    private void dfsWithStack(Vertex v) {

        v.setVisited(true);
        stack.push(v);


        while (!stack.isEmpty()) {
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex + " ");

            for (Vertex vertex : actualVertex.getAdjacencyList()) {
                if (!vertex.isVisited()) {
                    vertex.setVisited(true);
                    stack.push(vertex);
                }
            }
        }
    }


    public static void main(String[] args) {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");

        v1.addNeighbour(v2);
        v1.addNeighbour(v3);

        v3.addNeighbour(v4);
        v4.addNeighbour(v5);

        List<Vertex> vertices = Arrays.asList(v1, v2, v3, v4, v5);


       // depthFirstSearch.DFS(vertices);
        depthFirstSearch.dfsRecursive(v1);
    }
}
