package com.sofiahardcode.tourguide;

public class Place {
    private int titleResourceId;
    private int descriptionResourceId;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(int titleResourceId, int descriptionResourceId) {
        this.titleResourceId = titleResourceId;
        this.descriptionResourceId = descriptionResourceId;
    }

    public Place(int titleResourceId, int descriptionResourceId, int imageResourceId) {
        this.titleResourceId = titleResourceId;
        this.descriptionResourceId = descriptionResourceId;
        this.imageResourceId = imageResourceId;
    }

    public int getTitleResourceId() {
        return titleResourceId;
    }

    public int getDescriptionResourceId() {
        return descriptionResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
