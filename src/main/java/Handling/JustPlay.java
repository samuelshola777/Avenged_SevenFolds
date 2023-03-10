package Handling;

import java.util.ArrayList;
import java.util.List;

public class JustPlay {

    private List<Human> humans;

    public JustPlay() {
        humans = new ArrayList<>();
    }
    public void setHumans(Human human){
        humans.add(human);
    }
    public List<Human> getHumans() {
        return humans;
    }
    public Human getHumanByIndex(int id) {
        for (Human human : humans) {
            System.out.println("my name ");
        }
        return null;
    }
}
