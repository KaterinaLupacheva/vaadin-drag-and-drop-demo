package io.ramonak;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import io.ramonak.components.FootballField;
import io.ramonak.components.PlayerCard;
import io.ramonak.data.JuventusData;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
@PWA(name = "Vaadin drag and drop", shortName = "Juventus FC")
@CssImport("./styles/main-view.css")
public class MainView extends HorizontalLayout {

    public MainView() {
        VerticalLayout playersList = new VerticalLayout();
        playersList.setSizeUndefined();
        playersList.addClassName("players-list");

        JuventusData data = new JuventusData();
        data.getPlayers().forEach(player -> {
            playersList.add(new PlayerCard(player));
        });
        add(playersList, new FootballField());
    }
}
