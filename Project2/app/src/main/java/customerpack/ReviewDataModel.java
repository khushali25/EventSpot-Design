package customerpack;

/**
 * Created by NIKKI on 13/01/2017.
 */

public class ReviewDataModel  {

    String name;
    String review;

    public ReviewDataModel(String name,String review)
    {
        this.name=name;
        this.review=review;
    }

    public String getName() {
        return name;
    }

    public String getReview() {
        return review;
    }
}
