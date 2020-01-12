package io.ramonak.components;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dnd.DropEffect;
import com.vaadin.flow.component.dnd.DropTarget;
import com.vaadin.flow.component.html.Div;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@CssImport("./styles/field-position.css")
public class FieldPosition extends Div implements DropTarget<Div> {

    private boolean isEmpty = true;

    public FieldPosition(@Autowired FootballField field) {
        addClassName("field-position");
        setActive(true);
        setDropEffect(DropEffect.MOVE);
        addDropListener(event -> {
            event.getDragSourceComponent().ifPresent(component -> {
                add(component);
                setEmpty(false);
                field.getPositions().forEach(position ->
                    position.removeClassName("drop-target"));
            });
            event.getDragData().ifPresent(data -> setText(data.toString()));
        });
    }
}
