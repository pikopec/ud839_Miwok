package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains an English translation and a Miwok translation for that word.
 */
public class Word {
    private String mEnglishTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String english, String miwok){
        mEnglishTranslation = english;
        mMiwokTranslation = miwok;
    }

    public Word(String english, String miwok, int imageIdResource, int audioResourceId){
        mEnglishTranslation = english;
        mMiwokTranslation = miwok;
        mImageResourceId = imageIdResource;
        mAudioResourceId = audioResourceId;
    }
    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public int getAudioResourceId() { return mAudioResourceId; }

    public boolean hasImage(){ return mImageResourceId != NO_IMAGE_PROVIDED; }

    @Override
    public String toString() {
        return "Word{" +
                "mEnglishTranslation='" + mEnglishTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
