package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */
public class Word {

    /**
     * Default miwok for the word
     */
    private String mMiwokTranslation;

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Image resource id for word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param miwokTranslation   is the word in the Miwok language
     *                           (such as English)
     * @param defaultTranslation is the word in a language that the user is already familiar with
     */
    public Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    /**
     * Create a new Word object.
     *
     * @param miwokTranslation   is the word in the Miwok language
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param imageResourceId    is the drawable resource ID for the image associated with the word
     */
    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the miwok translation of word
     *
     * @return miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the default translation of word
     *
     * @return default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * @return image
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return weather or not their is an image for this word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
