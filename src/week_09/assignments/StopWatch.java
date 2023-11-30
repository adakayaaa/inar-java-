package week_09.assignments;

public class StopWatch {
    private long startTime;
    private long endTime;

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    StopWatch () {
        startTime = System.currentTimeMillis();
    }

    public void start(){
       startTime= System.currentTimeMillis();
    }
    public void end(){
         endTime= System.currentTimeMillis();
    }
    public long getElapsed(){
        return endTime-startTime;

    }



}

