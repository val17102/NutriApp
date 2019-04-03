package val17102.edu.gt.nutriapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TextInputEditText;
import android.view.View;
import android.widget.Button;

public class Aportes extends Activity {
    private TabLayout tabLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        setContentView(R.layout.aportes);
        TextInputEditText peso = (TextInputEditText) findViewById(R.id.peso);
        TextInputEditText liquido = (TextInputEditText) findViewById(R.id.liquido);
        TextInputEditText chon = (TextInputEditText) findViewById(R.id.CHON);
        TextInputEditText chooh = (TextInputEditText) findViewById(R.id.CHOOH);
        TextInputEditText cho = (TextInputEditText) findViewById(R.id.CHO);
        TextInputEditText na = (TextInputEditText) findViewById(R.id.Na);
        TextInputEditText k = (TextInputEditText) findViewById(R.id.K);
        TextInputEditText ca = (TextInputEditText) findViewById(R.id.Ca);
        TextInputEditText mg = (TextInputEditText) findViewById(R.id.Mg);
        peso.setText("Hola");
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });
    }
}
