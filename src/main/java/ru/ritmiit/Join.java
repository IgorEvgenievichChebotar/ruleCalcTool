package ru.ritmiit;

import lombok.Data;

@Data
public class Join {
    private String tableLeft;
    private String entityLeft;
    private String tableRight;
    private String entityRight;
    private String type;
}