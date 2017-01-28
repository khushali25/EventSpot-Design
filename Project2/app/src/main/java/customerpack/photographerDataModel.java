package customerpack;

/**
 * Created by NIKKI on 07/01/2017.
 */

public class photographerDataModel {

    String name;
    String website;
    String contactno;
    int image;

    public photographerDataModel(String name,String website,String contactno,Integer image)
    {
        this.name=name;
        this.website=website;
        this.contactno=contactno;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public String getContactno() {
        return contactno;
    }

    public int getImage() {
        return image;
    }
}
