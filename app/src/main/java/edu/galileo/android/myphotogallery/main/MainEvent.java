package edu.galileo.android.myphotogallery.main;

/**
 * Created by mubir on 8/19/17.
 */
public class MainEvent {
    public static final int onPhotoSuccess = 1;
    public static final int onPhotoError = 2;

    private int type;
    private String message;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
