package customerpack;

/**
 * Created by Khushali Thakkar on 1/7/2017.
 */

public class PartplotDataModel
{
    String partyname;
    String partyarea;
    int partyid_;
    int partyimage;
    String partymobile;

    public PartplotDataModel(String partyname, String partyarea, int partyid_, int partyimage,String partymobile)
    {
        this.partyname = partyname;
        this.partyarea = partyarea;
        this.partyid_ = partyid_;
        this.partyimage = partyimage;
        this.partymobile=partymobile;
    }

    public String getpartyName() {
        return partyname;
    }


    public String getpartyVersion() {
        return partyarea;
    }

    public int getpartyImage() {
        return partyimage;
    }

    public int getpartyId() {
        return partyid_;
    }

    public String getpartyMobile() {
        return partymobile;
    }
}
