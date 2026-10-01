import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        int n = 8; // for the 8 nodes in the assignment
        @SuppressWarnings("unchecked")
        LinkedList<Integer>[] adj = new LinkedList[n + 1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new LinkedList<>();
        }

        // all the adjacency lists, going from left to right
        adj[1].add(2); adj[1].add(3);
        adj[2].add(1); adj[2].add(3); adj[2].add(4); adj[2].add(5);
        adj[3].add(1); adj[3].add(2); adj[3].add(5); adj[3].add(7); adj[3].add(8);
        adj[4].add(2); adj[4].add(5);
        adj[5].add(2); adj[5].add(3); adj[5].add(4); adj[5].add(6);
        adj[6].add(5);
        adj[7].add(3); adj[7].add(8);
        adj[8].add(3); adj[8].add(7);
    }
}