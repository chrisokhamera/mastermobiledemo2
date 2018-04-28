package com.example.chris.mastermobiledemo2;


/**
 * Created by chris on 22/04/2018.
 */

class MovieObject {

    public String Title;
    public String Genre;
    public String Year;
    public String Director;
    public String Cast;
    public String Notes;
//    public String RunningTimes;

    public  MovieObject(String _title, String _genre, String _year, String _director, String _cast, String _notes) {
        Title = _title;
        Genre = _genre;
        Year = _year;
        Director = _director;
        Cast = _cast;
        Notes = _notes;
       // RunningTimes = _runningTimes;

    }

}
