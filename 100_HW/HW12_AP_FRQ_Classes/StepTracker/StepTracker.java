public class StepTracker{
    //minimum steps required for day to be considered active
    private int minSteps;
    private int totalSteps = 0;
    private int activeDays = 0;
    private int totalDays = 0;

    //assume minSteps is positive
    public StepTracker(int minSteps){
        this.minSteps = minSteps;
    }

    public void addDailySteps(int steps){
        totalDays++;
        if(steps>=minSteps){
            activeDays++;
        }
        return;
    }

    public double averageSteps(){
        return (totalDays==0)? (0.0):(totalSteps/totalDays);
    }

    public int activeDays(){
        return activeDays;
    }
}