package com.dsa.saurabh.level01.Graphs.GraphRepresentation;

import java.util.LinkedList;
import java.util.List;

public class Vertex {

    private String name;
    private List<Vertex> adjacencyList;

    Vertex(String name) {
        this.name = name;
        this.adjacencyList = new LinkedList<>();
    }


    public void addNeighbour(Vertex vertex) {
        adjacencyList.add(vertex);
    }

    public void showNeighbours(Vertex vertex) {
        for (Vertex vertex1 : adjacencyList) {
            System.out.println(vertex1);
        }
    }

    public String toString() {
        return name;
    }
}
