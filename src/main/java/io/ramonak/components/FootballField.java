package io.ramonak.components;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@CssImport("./styles/football-field.css")
public class FootballField extends Div {

    private final List<FieldPosition> positions = new ArrayList<>();

    public FootballField() {
        addClassName("football-field");
        add(createRow(2), createRow(4),
                createRow(4), createRow(1));
    }

    private Div createRow(int numOfPlayers) {
        Div row = new Div();
        for (int i=0; i<numOfPlayers; i++) {
            FieldPosition fieldPosition = new FieldPosition(this);
            row.add(fieldPosition);
            positions.add(fieldPosition);
        }
        row.addClassName("row");
        return row;
    }
}
