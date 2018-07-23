package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColour;
    ArrayList<colourList> alColour;
    CustomAdapter caColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColour = findViewById(R.id.ListViewColour);
        alColour = new ArrayList<>();

        colourList colour1 = new colourList("blue");
        colourList colour2 = new colourList("orange");
        colourList colour3 = new colourList("brown");

        alColour.add(colour1);
        alColour.add(colour2);
        alColour.add(colour3);

        caColour = new CustomAdapter(this, R.layout.colour_list, alColour);

        lvColour.setAdapter(caColour);

    }
}
