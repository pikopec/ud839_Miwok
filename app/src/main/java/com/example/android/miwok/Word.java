package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains an English translation and a Miwok translation for that word.
 */
public class Word {
    private String mEnglishTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;

    public Word(String english, String miwok){
        mEnglishTranslation = english;
        mMiwokTranslation = miwok;
    }

    public Word(String english, String miwok, int imageIdResource){
        mEnglishTranslation = english;
        mMiwokTranslation = miwok;
        mImageResourceId = imageIdResource;
    }
    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }
}
