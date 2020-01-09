package io.ramonak.components;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;

@CssImport("./styles/football-field.css")
public class FootballField extends Div {

    public FootballField() {
        addClassName("football-field");
    }
}
