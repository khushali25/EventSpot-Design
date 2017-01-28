package customerpack;

/**
 * Created by Khushali Thakkar on 12/29/2016.
 */



public class DataModel {
    String name;
    String version;
    int id_;

    int image;
    String mobile;

    public DataModel(String name, String version, int id_, int image,String mobile) {
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image = image;
        this.mobile=mobile;
    }

    public String getName() {
        return name;
    }


    public String getVersion() {
        return version;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }

    public String getMobile() {
        return mobile;
    }
}