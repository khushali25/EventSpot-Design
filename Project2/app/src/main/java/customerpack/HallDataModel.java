package customerpack;

/**
 * Created by Khushali Thakkar on 1/7/2017.
 */

public class HallDataModel
{
    String hallname;
    String hallarea;
    int hallid_;
    int hallimage;
    String hallmobile;

    public HallDataModel(String hallname, String hallarea, int hallid_, int hallimage,String hallmobile)
    {
        this.hallname = hallname;
        this.hallarea = hallarea;
        this.hallid_ = hallid_;
        this.hallimage = hallimage;
        this.hallmobile=hallmobile;
    }

    public String gethallName()
    {
        return hallname;
    }


    public String gethallVersion() {
        return hallarea;
    }

    public int gethallImage() {
        return hallimage;
    }

    public int gethallId()
    {
        return hallid_;
    }

    public String gethallMobile()
    {
        return hallmobile;
    }
}
