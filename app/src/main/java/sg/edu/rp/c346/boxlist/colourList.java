package sg.edu.rp.c346.boxlist;

/**
 * Created by 16039013 on 23/7/2018.
 */

public class colourList {
    private String color;

    public colourList(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "colourList{" +
                "color='" + color + '\'' +
                '}';
    }
}
