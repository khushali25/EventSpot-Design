package customerpack;

/**
 * Created by NIKKI on 05/01/2017.
 */

public class GallaryItemObject {

    private String name;
    private int photo;

    public GallaryItemObject( int photo) {

        this.photo = photo;
    }



    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
