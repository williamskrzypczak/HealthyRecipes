package net.androidbootcamp.healthyrecipes;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


 public class MainActivity extends ActionBarActivity {

  @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       Button button = (Button) findViewById(R.id.btnRecipe);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, Recipe.class));
           }
       });
    }



 }
