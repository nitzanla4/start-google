package week3.monday.visitor;

public interface Visitor {
    void visit (Asset asset);
    void visit (Group group);
    void visit (User user);
}
