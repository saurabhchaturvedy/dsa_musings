package com.dsa.saurabh.level01.Graphs.BreadthFirstSearch;

import java.util.LinkedList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> adjacencyList;

    Vertex(String name) {
        this.name = name;
        this.adjacencyList = new LinkedList<>();
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    public void addNeighbour(Vertex vertex) {
        this.adjacencyList.add(vertex);
    }

    public String toString() {
        return this.name;
    }
}
