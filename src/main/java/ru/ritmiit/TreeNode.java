package ru.ritmiit;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class TreeNode {
    private Integer id;
    private List<Integer> criterias;
    private List<Node> nodes;
    private BigDecimal loss;
}