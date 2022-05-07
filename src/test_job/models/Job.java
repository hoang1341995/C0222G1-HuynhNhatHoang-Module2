package test_job.models;

public class Job {
    private String dayOfWeek;
    private String codeJob;
    private String name;
    private String priority;

    public Job() {
    }

    public Job(String dayOfWeek, String codeJob, String name, String priority) {
        this.dayOfWeek = dayOfWeek;
        this.codeJob = codeJob;
        this.name = name;
        this.priority = priority;
    }

    public String getCodeJob() {
        return codeJob;
    }

    public void setCodeJob(String codeJob) {
        this.codeJob = codeJob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "job{" +
                "dayOfWeek='" + dayOfWeek + '\'' +
                ", codeJob='" + codeJob + '\'' +
                ", name='" + name + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }

    public  String toFile(){
        return dayOfWeek +
                ","+codeJob+
                ","+name+
                ","+priority;

    }
}
