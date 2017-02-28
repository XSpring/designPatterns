package creational;

/**
 * Created by hldo on 1/3/17.
 */
public class MarketingManager extends HiringManager {
    public Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
