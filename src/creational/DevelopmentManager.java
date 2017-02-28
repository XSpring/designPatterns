package creational;

/**
 * Created by hldo on 1/3/17.
 */
public class DevelopmentManager extends HiringManager {
    public Interviewer makeInterviewer() {
        return new Developer();
    }
}
