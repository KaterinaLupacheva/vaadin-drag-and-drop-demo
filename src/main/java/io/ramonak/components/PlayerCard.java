package io.ramonak.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import io.ramonak.data.Player;

public class PlayerCard extends HorizontalLayout {

    private Div name = new Div();
    private Div number = new Div();
    private Div position = new Div();

    public PlayerCard(Player player) {
        name.setText(player.getName());
        number.setText(player.getNumber().toString());
        position.setText(player.getPosition().toString());
        add(number, position, name);
    }
}
