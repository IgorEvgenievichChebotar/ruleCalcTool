package ru.ritmiit;

import lombok.Data;

import java.util.List;

@Data
public class Rule {
    private List<Join> joins;
    private List<Variable> variables;
    private List<Parameter> parameters;
    private List<Criteria> criterias;
    private List<TreeNode> tree;
}