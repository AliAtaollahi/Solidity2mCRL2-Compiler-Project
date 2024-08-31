package main.ast.nodes.declaration.utility;

import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.primary.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class NameValueList extends FunctionCallArguments {
    private ArrayList<NameValue> nameValues = new ArrayList<>();
    public NameValueList() {}

    public void addNameValue(NameValue nameValue) {
        this.nameValues.add(nameValue);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<NameValue> getNameValues() {
        return nameValues;
    }

    public void setNameValues(ArrayList<NameValue> nameValues) {
        this.nameValues = nameValues;
    }
}
