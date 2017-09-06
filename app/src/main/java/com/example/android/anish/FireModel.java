package com.example.android.anish;

/**
 * Created by Admin on 06-Sep-17.
 */

public class FireModel{
    public FireModel(){

    }

    String lecture_time = "default_time";
    String lecture_subject = "default_lect";



    public String getLecture_subject() {
        return this.lecture_subject;
    }

    public String getLecture_time() {
        return this.lecture_time;
    }

    public void setLecture_subject(String lecture_subject) {
        this.lecture_subject = lecture_subject;
    }

    public void setLecture_time(String lecture_time) {
        this.lecture_time = lecture_time;
    }
}
