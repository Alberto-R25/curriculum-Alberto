package com.example.curriculum.model.person;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

@Data
public class WorkExperience {
    public String title;
    public String company;
    @JsonFormat(pattern="dd/MM/yyyy")
    public Date from;
    @JsonFormat(pattern="dd/MM/yyyy")
    public Date to;
    public Boolean current;
    public String description;
}
