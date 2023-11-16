package graph;

import java.util.ArrayList;

public class haspath{
    static class edge{
        int src;
        int dist;
        int weight;

        public edge(int i, int j, int k) {
            this.src = i ;
            this.dist = j;
            this.weight = k;
        }

    }

    public static boolean hasp(ArrayList<edge> graph[],int src , int dist , boolean vist[]){
        if(src==dist){
            return true;
        }
        vist[src] = true;
        for(int i = 0 ; i<graph[src].size();i++){
            edge e = graph[src].get(i);
            if(!vist[e.dist] && hasp(graph, e.dist,dist,vist)){
                return true;
            }
        }

        return false;
        
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[5];

        for(int i = 0 ; i<v;i++){
            graph[i]= new ArrayList<>();
        }

        // 0 vertex 
        graph[0].add(new edge(0,1,1));

        // 1 vertex                
        graph[1].add(new edge(1,0,1));
        graph[1].add(new edge(1,2,1));
        graph[1].add(new edge(1,3,1));

        // 2 vertex
        graph[2].add(new edge(2, 1, 3));
        graph[2].add(new edge(2, 3, 3));
        
        // 3 vertex
        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 2, 1));


       System.out.println(hasp(graph, 1, 3, new boolean[v])); 
    }
}
