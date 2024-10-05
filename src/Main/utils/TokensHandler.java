package main.utils;

import main.ast.nodes.declaration.utility.ExpressionList;
import main.ast.nodes.declaration.utility.NameValue;
import main.ast.nodes.declaration.utility.NameValueList;
import main.ast.nodes.expression.AccessExpression;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.FunctionCallExpression;
import main.ast.nodes.expression.primary.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TokensHandler {
    ArrayList<String> tokens = new ArrayList<>();
    public TokensHandler() {
        tokens.add("IERC20");
    }

    public static void addToMap(Map<String, List<String>> map, String key, String value) {
        // Get the list associated with the key, or create a new one if it doesn't exist
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(value);
    }

    public static boolean addToMapIfStringFound(Map<String, List<String>> map, String string1, String string2) {
        // Iterate over each entry in the map
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            // Check if the value list contains String2
            if (entry.getValue().contains(string2)) {
                // Add String1 to the list for that key
                entry.getValue().add(string1);
                return true;
            }
        }
        return false;
    }

    public static boolean justFoundIfStringFound(Map<String, List<String>> map, String string) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(string)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getTokens() {
        return tokens;
    }

    public void setTokens(ArrayList<String> tokens) {
        this.tokens = tokens;
    }

    public void buildByBuiltIn(String tokenName, FunctionCallExpression functionCallExpression) {
        if (tokenName.equals("IERC20")) {
            String functionName = ((AccessExpression)functionCallExpression.getFunctionName()).getMember().getName();

            switch (functionName) {
                case "transfer":
                    // Handle the case where the function name is "functionA"
                    if (functionCallExpression.getArgs() instanceof ExpressionList) {
                        ExpressionList expressionList = (ExpressionList) functionCallExpression.getArgs();
                        Expression recipient = expressionList.getExpressionList().get(0);
                        Expression amount = expressionList.getExpressionList().get(1);
                        ((AccessExpression)functionCallExpression.getFunctionName()).setMaster(recipient);
                        ExpressionList newExpressionList = new ExpressionList();
                        newExpressionList.addExpression(amount);
                        functionCallExpression.setArgs(newExpressionList);
                    }
                    else if (functionCallExpression.getArgs() instanceof NameValueList) {
                        NameValueList nameValueList = (NameValueList) functionCallExpression.getArgs();
                        NameValue toValue = null;
                        NameValue amountValue = null;
                        for (NameValue nameValue : nameValueList.getNameValues()) {
                            if (nameValue.getKey().getName().equals("to")) {
                                toValue = nameValue;
                            } else if (nameValue.getKey().getName().equals("value")) {
                                amountValue = nameValue;
                            }
                        }
                        assert toValue != null;
                        ((AccessExpression)functionCallExpression.getFunctionName()).setMaster(toValue.getValue());
                        ExpressionList newExpressionList = new ExpressionList();
                        assert amountValue != null;
                        newExpressionList.addExpression(amountValue.getValue());
                        functionCallExpression.setArgs(newExpressionList);
                    }
                    break;

                case "transferFrom":
                    // Handle the case where the function name is "functionB"
                    if (functionCallExpression.getArgs() instanceof ExpressionList) {
                        ((AccessExpression)functionCallExpression.getFunctionName()).setMember(new Identifier("transfer"));
                        ExpressionList expressionList = (ExpressionList) functionCallExpression.getArgs();
                        Expression sender = expressionList.getExpressionList().get(0);
                        Expression recipient = expressionList.getExpressionList().get(1);
                        Expression amount = expressionList.getExpressionList().get(2);
                        ((AccessExpression)functionCallExpression.getFunctionName()).setMaster(recipient);
                        ExpressionList newExpressionList = new ExpressionList();
                        newExpressionList.addExpression(amount);
                        functionCallExpression.setArgs(newExpressionList);
                        functionCallExpression.setForUrgeTimes(sender);
                    }
                    else if (functionCallExpression.getArgs() instanceof NameValueList) {
                        ((AccessExpression)functionCallExpression.getFunctionName()).setMember(new Identifier("transfer"));
                        NameValueList nameValueList = (NameValueList) functionCallExpression.getArgs();
                        NameValue toValue = null;
                        NameValue amountValue = null;
                        NameValue senderValue = null;
                        for (NameValue nameValue : nameValueList.getNameValues()) {
                            if (nameValue.getKey().getName().equals("to")) {
                                toValue = nameValue;
                            } else if (nameValue.getKey().getName().equals("value")) {
                                amountValue = nameValue;
                            } else if (nameValue.getKey().getName().equals("sender")) {
                                senderValue = nameValue;
                            }
                        }
//                        assert toValue != null;
                        ((AccessExpression)functionCallExpression.getFunctionName()).setMaster(toValue.getValue());
                        ExpressionList newExpressionList = new ExpressionList();
//                        assert amountValue != null;
                        newExpressionList.addExpression(amountValue.getValue());
                        functionCallExpression.setArgs(newExpressionList);
//                        assert senderValue != null;
                        functionCallExpression.setForUrgeTimes(senderValue.getValue());
                    }
                    break;

                default:
                    // Handle cases where the function name doesn't match any of the above
                    System.out.println("Unknown function: " + functionName);
                    break;
            }
        }
    }
}
