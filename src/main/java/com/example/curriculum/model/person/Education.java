package com.example.curriculum.model.person;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

@Data
public class Education {
    public String name;
    public String career;
    @JsonFormat(pattern="dd/MM/yyyy")
    public Date from;
    @JsonFormat(pattern="dd/MM/yyyy")
    public Date to;
    public String degree;
}
