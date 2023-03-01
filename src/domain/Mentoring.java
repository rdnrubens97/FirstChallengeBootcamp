package domain;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    public Mentoring(){
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public Double calculateXp() {
        return defaultXp + 20d;
    }

    @Override
    public String toString() {
        return "Mentoring {" + 
               "Title: " + getTitle() + '\'' +
               ", Description: " + getDescription() + '\'' +
               ", Date: " + date + "}.";
    }

        
}
