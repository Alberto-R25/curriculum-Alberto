package com.example.curriculum.model.person;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

@Data
public class Challenges {
    public String name;
    @JsonFormat(pattern="dd/MM/yyyy")
    public Date date;
    public String description;
    public String url;
}
