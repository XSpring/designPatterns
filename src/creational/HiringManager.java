package creational;

/**
 * Created by hldo on 1/3/17.
 */
abstract class HiringManager {

    // Factory method
    abstract public Interviewer makeInterviewer();

    public void takeInterview() {
        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestions();
    }
}
