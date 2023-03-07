package ru.ritmiit;

import lombok.Data;

@Data
public class Variable {
    private String name;
    private String table;
    private String field;
    private String type;
}