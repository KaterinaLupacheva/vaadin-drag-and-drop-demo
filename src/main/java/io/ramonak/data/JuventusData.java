package io.ramonak.data;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class JuventusData {

    private List<Player> players = new ArrayList<>();

    public JuventusData() {
        players.add(new Player("Buffon", 1, Position.GK));
        players.add(new Player("Ferrara", 2, Position.DF));
        players.add(new Player("Tacchinardi", 3, Position.MF));
        players.add(new Player("Montero", 4, Position.DF));
        players.add(new Player("Tudor", 5, Position.MF));
        players.add(new Player("Legrottaglie", 6, Position.DF));
        players.add(new Player("Pessotto", 7, Position.DF));
        players.add(new Player("Emerson", 8, Position.MF));
        players.add(new Player("Ibrahimović", 9, Position.FW));
        players.add(new Player("Del Piero", 10, Position.FW));
        players.add(new Player("Nedvěd", 11, Position.MF));
    }
}
