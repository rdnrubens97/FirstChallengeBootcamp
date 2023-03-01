package domain;

public class Course extends Content {

    private Double workload;

    public Course(){
    }
    
    public Double getWorkload() {
        return workload;
    }

    public void setWorkload(Double workload) {
        this.workload = workload;
    }

    @Override
    public Double calculateXp() {
        return defaultXp * workload;
    }

    @Override
    public String toString(){
        return "Course {" + 
               "Title: " + getTitle() + '\'' +
               ", Description: " + getDescription() + '\'' +
               ", workload: " + workload + "}.";
    }    

}    

