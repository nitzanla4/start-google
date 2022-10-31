package week3.monday.builder;

import java.time.LocalDate;

public class JobPosition {
    private LocalDate publishedDate;
    private String title;
    private String description;
    private String location;
    private int salaryCap;
    private boolean isRemote;
    private int yearsOfExperience;

public static  class Builder {
    private LocalDate publishedDate;
    private String title;
    private boolean isRemote;

    private String location = "Tel Aviv";
    private String description;
    private int salaryCap;
    private int yearsOfExperience;


    public Builder(LocalDate publishedDate, String title, boolean isRemote) {
        this.publishedDate = publishedDate;
        this.title = title;
        this.isRemote = isRemote;
    }

    public Builder location(String location) {
        this.location = location;
        return this;
    }

    public Builder description(String description) {
        this.description = description;
        return this;
    }

    public Builder salaryCap(int salaryCap) {
        this.salaryCap = salaryCap;
        return this;
    }

    public Builder yearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
        return this;
    }

    public JobPosition build() {
        return new JobPosition(this);
    }
}
    private JobPosition(Builder builder)
    {
        this.publishedDate = builder.publishedDate;
        this.title = builder.title;
        this.description = builder.description;
        this.location = builder.location;
        this.salaryCap = builder.salaryCap;
        this.isRemote = builder.isRemote;
        this.yearsOfExperience = builder.yearsOfExperience;
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "publishedDate=" + publishedDate +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", salaryCap=" + salaryCap +
                ", isRemote=" + isRemote +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}






