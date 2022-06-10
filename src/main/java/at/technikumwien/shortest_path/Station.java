package at.technikumwien.shortest_path;

import java.util.HashSet;
import java.util.Set;

public class Station implements Comparable<Station> {

    private final String name;
    private final Set<Line> lines = new HashSet<>();
    private int cost = Integer.MAX_VALUE;
    private Set<Neighbor> neighbors = new HashSet<>();
    private Neighbor previous;
    private boolean visited = false;

    // //////////////////////////////////////////////////////////////////////////
    // Init
    // //////////////////////////////////////////////////////////////////////////

    public Station(String name, Line line) {
        this.name = name;
        lines.add(line);
    }

    // //////////////////////////////////////////////////////////////////////////
    // Methoden
    // //////////////////////////////////////////////////////////////////////////

    // @Override
    // public boolean equals(Object obj) {
    //     if (obj == null) {
    //         return false;
    //     }

    //     return hashCode() == obj.hashCode();
    // }

    // @Override
    // public int hashCode() {
    //     return name.hashCode();
    // }

    @Override
    public int compareTo(Station o) {
        if (visited) {
            return Integer.MAX_VALUE;
        } else {
            return Integer.compare(cost, o.cost);
        }
    }

    // //////////////////////////////////////////////////////////////////////////
    // Getter und Setter
    // //////////////////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public Set<Line> getLines() {
        return lines;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Set<Neighbor> getNeighbors() {
        return neighbors;
    }

    public Neighbor getPrevious() {
        return previous;
    }

    public void setPrevious(Neighbor previous) {
        this.previous = previous;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}