package org.example;

import java.time.LocalDate;

public class Movie {
    private String title;
    private LocalDate releaseDate;
    private long boxOfficeRevenue;

    public Movie(String title, LocalDate releaseDate, long boxOfficeRevenue) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.boxOfficeRevenue = boxOfficeRevenue;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getBoxOfficeRevenue() {
        return boxOfficeRevenue;
    }

    public void setBoxOfficeRevenue(long boxOfficeRevenue) {
        this.boxOfficeRevenue = boxOfficeRevenue;
    }
}

