package main.ast.nodes.declaration;

import main.ast.nodes.declaration.utility.ImportElement;
import main.ast.nodes.expression.primary.Identifier;
import main.ast.nodes.expression.value.ImportPath;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ImportDirective extends Declaration {
    private ImportPath importPath;

    private Identifier aliasId;
    private Boolean importAll = false;
    private ArrayList<ImportElement> importedElements = new ArrayList<>();

    public ImportDirective(String importPath) {
        this.importPath = new ImportPath(importPath);
    }

    public ImportDirective() {
    }

    public void setAlias(String alias) {
        this.aliasId = new Identifier(alias);
    }

    public void setImportPath(String importPath) {
        this.importPath = new ImportPath(importPath);
    }

    public void addImportElement(String elementName, String alias) {
        if (elementName.equals("*")) {
            this.importAll = true;
            setAlias(alias);
            return;
        }
        this.importedElements.add(new ImportElement(elementName, alias));
    }

    public void addImportElement(ImportElement element) {
        this.importedElements.add(element);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
