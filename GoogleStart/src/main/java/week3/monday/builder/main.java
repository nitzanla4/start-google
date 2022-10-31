package week3.monday.builder;

import java.time.LocalDate;

public class main {
    public static void main(String[] args)
    {
        JobPosition job= new JobPosition.Builder(LocalDate.now(),"title", true).description("bla bla bla").build();
        System.out.println(job);
    }
}
