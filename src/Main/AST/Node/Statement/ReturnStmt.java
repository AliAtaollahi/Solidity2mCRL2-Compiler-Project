package Main.AST.Node.Statement;

import Main.AST.Node.expression.Expression;
import Main.visitor.IVisitor;

public class ReturnStmt extends Statement{

    private Expression returnedExpr;

    public ReturnStmt(Expression returnedExpr) {
        this.returnedExpr = returnedExpr;
    }

    public ReturnStmt() {}

    public Expression getReturnedExpr() {
        return returnedExpr;
    }

    public void setReturnedExpr(Expression returnedExpr) {
        this.returnedExpr = returnedExpr;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
