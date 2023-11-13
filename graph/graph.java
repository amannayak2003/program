package graph;

import java.util.ArrayList;

class graph {

    static class edge{
        int src ;
        int dest;
        int weight;

        public edge(int s ,int d , int w ){
            this.src = s;
            this.dest = d;
            this.weight=w;
        }


    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge>[] graph = new ArrayList[v];

        for(int i = 0 ; i<v;i++){
            graph[i] = new ArrayList<>();
        }


        // 0 vertex :
        graph[0].add(new edge(0, 1, 5));

        // 1 vertex : 
        graph[1].add(new edge(1, 0, 5));
        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 3));

        // 2 vertex : 
        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 3, 1));
        graph[2].add(new edge(2, 4, 2));


        for(int i = 0 ; i<graph[2].size();i++){
            edge e = graph[2].get(i);
            System.out.println(e.dest);
        }



    }
    
}