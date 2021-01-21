package com.dsa.saurabh.level01.Graphs.GraphRepresentation;

public class GraphRepresentation {

    private static int[][] adjacencyMatrix = {
            {0, 2, 4, 0},
            {0, 0, 0, 3},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
    };

    public static void main(String[] args) {


        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");

        A.addNeighbour(B);
        A.addNeighbour(C);

        B.addNeighbour(A);
        B.addNeighbour(D);

        D.addNeighbour(B);
        C.addNeighbour(A);

        B.showNeighbours(B);


    }
}
