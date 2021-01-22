package com.dsa.saurabh.level01.Graphs.CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {


    private String data;
    private boolean visited;
    private boolean beingVisited;
    private List<Vertex> adjacencyList;

    Vertex(String data) {
        this.data = data;
        this.adjacencyList = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    public void addNeighbour(Vertex vertex) {
        this.adjacencyList.add(vertex);
    }

    public void setAdjacencyList(List<Vertex> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public String toString() {
        return this.data;
    }
}
