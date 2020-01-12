package io.ramonak.components;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dnd.DragSource;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import io.ramonak.data.Player;

@CssImport("./styles/player-card.css")
public class PlayerCard extends HorizontalLayout implements DragSource<PlayerCard> {

    public PlayerCard(Player player) {
        addClassName("player-card");
        Div name = new Div();
        name.setText(player.getName());
        Div number = new Div();
        number.setText(player.getNumber().toString());
        Div position = new Div();
        position.setText(player.getPosition().toString());
        add(number, position, name);
        setDraggable(true);
        setDragData(number.getText());
    }
}
