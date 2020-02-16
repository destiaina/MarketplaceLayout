package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void register(View view){
        Intent intent = new Intent(this, activity_register.class);
        startActivity(intent);
    }
    public void Sudahlogin(View view){
        Intent intent = new Intent(this, activity_profile.class);
        startActivity(intent);
    }
    public void back(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
