package io.ramonak;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import io.ramonak.components.PlayerCard;
import io.ramonak.data.JuventusData;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
@PWA(name = "Vaadin drag and drop", shortName = "Juventus FC")
public class MainView extends VerticalLayout {

    public MainView() {
        JuventusData data = new JuventusData();
        data.getPlayers().forEach(player -> {
            add(new PlayerCard(player));
        });
    }
}
