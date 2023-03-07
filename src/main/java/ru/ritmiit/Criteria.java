package ru.ritmiit;

import lombok.Data;

@Data
public class Criteria {
    private Integer id;
    private String parameter;
    private String operator;
    private String value;
}