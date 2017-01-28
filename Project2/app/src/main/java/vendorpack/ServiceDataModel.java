package vendorpack;

/**
 * Created by NIKKI on 06/01/2017.
 */

public class ServiceDataModel {

    String name;
    String website;
    String contactno;

    public ServiceDataModel(String name,String website,String contactno)
    {
        this.name=name;
        this.website=website;
        this.contactno=contactno;
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
}
