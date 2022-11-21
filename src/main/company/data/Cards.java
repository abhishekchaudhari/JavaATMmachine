package main.company.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cards {
    Map<Integer, ArrayList> card = new HashMap<>();

    public Cards() {
        registeredCards();
    }
    private void registeredCards(){
        card.put(12345,new ArrayList(List.of(123, 1111)));
        card.put(22333,new ArrayList(List.of(223, 2222)));
        card.put(55555,new ArrayList(List.of(555, 3333)));
    }

    public Map<Integer, ArrayList> getCard() {
        return card;
    }

    public void setCard(Map<Integer, ArrayList> card) {
        this.card = card;
    }
}
