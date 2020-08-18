package com.example.android.miwok;

/**
 * It contains the default and miwok translation for the word
 */
public class Word {

    /** Default miwok for the word*/
    private String mMiwokTranslation;

    /** Default translation for the word*/
    private String mDefaultTranslation;

    public Word(String miwokWord, String defaultWord) {
        mMiwokTranslation = miwokWord;
        mDefaultTranslation = defaultWord;
    }

    /**
     * Get the miwok translation of word
     * @return miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the default translation of word
     * @return default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
