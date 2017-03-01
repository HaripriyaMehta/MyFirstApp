package com.example.haripriyamehta.criminalintent;

import java.util.UUID;

/**
 * Created by haripriyamehta on 2/27/17.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        //Generate Unique Identified
        mId = UUID.randomUUID();
    }
    public UUID getId() {
    return mId;
}

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
