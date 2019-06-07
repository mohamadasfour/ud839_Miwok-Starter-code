package com.example.android.miwok;



public class Word {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

public Word(String miwokTranslation, String defaultTranslation){
    mDefaultTranslation = defaultTranslation;
    mMiwokTranslation = miwokTranslation;
}

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
