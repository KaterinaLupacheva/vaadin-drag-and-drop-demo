package io.ramonak.components;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dnd.DragSource;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import io.ramonak.data.Player;

@CssImport("./styles/player-card.css")
public class PlayerCard extends HorizontalLayout implements DragSource<PlayerCard> {

    private Div name = new Div();
    private Div number = new Div();
    private Div position = new Div();

    public PlayerCard(Player player) {
        addClassName("player-card");
        name.setText(player.getName());
        number.setText(player.getNumber().toString());
        position.setText(player.getPosition().toString());
        add(number, position, name);
        setDraggable(true);
        setDragData(number.getText());
    }
}
