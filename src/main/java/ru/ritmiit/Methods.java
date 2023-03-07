package ru.ritmiit;

import java.util.List;
import java.util.Map;

public class Methods {
    public List<Map<String, Object>> executeRule(String ruleFilePath, String dataFilePath) {
        // чтение правила из файла ruleFilePath
        Rule rule = readRuleFromFile(ruleFilePath);

        // выполнение join и агрегация данных из dataFilePath
        List<Map<String, Object>> data = aggregateData(rule, dataFilePath);

        // вычисление параметров и критериев
        data = calculateParameters(data, rule.getParameters());
        data = filterDataByCriteria(data, rule.getCriterias());

        // вычисление решения в дереве узлов
        for (TreeNode node : rule.getTree()) {
            data = calculateNode(data, node);
        }

        // сохранение результата в файл result.json
        saveResultToFile(data);
        return data;
    }

    private Rule readRuleFromFile(String ruleFilePath) {
        // чтение правила из файла и десериализация в объект Rule
    }

    private List<Map<String, Object>> aggregateData(Rule rule, String dataFilePath) {
        // выполнение join и агрегация данных из файла dataFilePath с помощью Hadoop
        // и возврат списка Map<String, Object>
    }

    private List<Map<String, Object>> calculateParameters(List<Map<String, Object>> data, List<Parameter> parameters) {
        // вычисление значений параметров с использованием данных из списка data
        // и возврат обновленного списка Map<String, Object>
    }

    private List<Map<String, Object>> filterDataByCriteria(List<Map<String, Object>> data, List<Criteria> criterias) {
        // фильтрация данных из списка data по критериям и возврат обновленного списка Map<String, Object>
    }

    private List<Map<String, Object>> calculateNode(List<Map<String, Object>> data, TreeNode node) {
        // вычисление решения в дереве узлов для данных из списка data,
        // соответствующих критериям из node.criterias, и возврат обновленного списка Map<String, Object>
    }

    private void saveResultToFile(List<Map<String, Object>> data) {
        // сериализация и сохранение списка Map<String, Object> в файл result.json
    }
}
