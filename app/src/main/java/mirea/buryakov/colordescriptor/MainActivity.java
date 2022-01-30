package mirea.buryakov.colordescriptor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerColors;
    private TextView textColorsDiscriptionView;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerColors = findViewById(R.id.spinnerColors);
        textColorsDiscriptionView = findViewById(R.id.textColorsDescriptionView);
        btn = findViewById(R.id.buttonColorsDescription);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDescription(view);
            }
        });

//        spinnerColors = findViewById(R.id.spinnerColors);
//        textDescriptionColors = findViewById(R.id.textDescriptionColors);
    }

    public void showDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        String description = getDescriptionByPosition(position);
        textColorsDiscriptionView.setText(description);
    }

    private String getDescriptionByPosition(int position) {
        String[] descriptions = getResources().getStringArray(R.array.description_of_temp);
        return  descriptions[position];
    }


//    public void showDescription(View view) {
//        int position = spinnerColors.getSelectedItemPosition();
//        String description =  getDescriptionByPosition(position);
//        textDescriptionColors.setText(description);
//    }
//
//    private String getDescriptionByPosition(int position) {
//        String[] description = getResources().getStringArray(R.array.description_of_temp);
//        return description[position];
//    }
}