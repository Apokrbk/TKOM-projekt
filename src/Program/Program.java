package Program;

import AST.Statement.Statement;

import java.util.ArrayList;

public class Program {
    private ArrayList<Statement> statements;


    public Program(){
        statements=new ArrayList<>();
    }

    public void addStatement(Statement statement){
        statements.add(statement);
    }

    @Override
    public String toString() {
        String result="";
        for (Statement statement: statements) {
            result+=statement.toString();
        }
        return result;
    }
}
