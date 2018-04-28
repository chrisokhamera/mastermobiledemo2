package com.example.chris.mastermobiledemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.chris.mastermobiledemo2.R;

public class MovieDetails extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openLoginActivity();
            }
        });


        Intent movieDetailsReceived = getIntent();

        //Note, the ids are in the resource file
        TextView textTitle = (TextView) findViewById(R.id.movieTitle);
        TextView textGenre = (TextView) findViewById(R.id.movieGenre);
        TextView textDirector = (TextView) findViewById(R.id.movieDirector);
        TextView textYear = (TextView) findViewById(R.id.movieYear);
        TextView textCast = (TextView) findViewById(R.id.movieCast);
        TextView textNotes = (TextView) findViewById(R.id.movieNotes);
       // TextView textRunningTimes = (TextView) findViewById(R.id.movieRunningTimes);

        String movieTitle = movieDetailsReceived.getStringExtra("MovieTitle");
        String movieGenre = movieDetailsReceived.getStringExtra("MovieGenre");
        String movieDirector = movieDetailsReceived.getStringExtra("MovieDirector");
        String movieYear = movieDetailsReceived.getStringExtra("MovieYear");
        String movieCast = movieDetailsReceived.getStringExtra("MovieCast");
        String movieNotes = movieDetailsReceived.getStringExtra("MovieNotes");
      //  String movieRunningTimes = movieDetailsReceived.getStringExtra("MovieRunningTimes");

        textTitle.setText(movieTitle);
        textGenre.setText(movieGenre);
        textDirector.setText(movieDirector);
        textYear.setText(movieYear);
        textCast.setText(movieCast);
        textNotes.setText(movieNotes);
       // textRunningTimes.setText(movieRunningTimes);

        //Can you add year, times etc? to the detail view by amending the table?


        Log.i("Movie", movieTitle);
        Log.i("Movie", movieGenre);
        Log.i("Movie", movieDirector);
        Log.i("Movie", movieYear);
        Log.i("Movie", movieCast);
        Log.i("Movie", movieNotes);
       // Log.i("Movie", movieRunningTimes);

    }
    public void openLoginActivity(){
        Intent intent = new Intent (this, LoginActivity.class );
        startActivity(intent);
    }
}
