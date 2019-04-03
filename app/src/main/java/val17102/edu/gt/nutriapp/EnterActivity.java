package val17102.edu.gt.nutriapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class EnterActivity extends AppCompatActivity {
    private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        button = (ImageButton) findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity();
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
