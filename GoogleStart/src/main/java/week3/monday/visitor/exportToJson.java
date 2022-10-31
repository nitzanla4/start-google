package week3.monday.visitor;

import com.google.gson.Gson;

public class exportToJson implements Visitor{
    @Override
    public void visit(Asset asset) {
        System.out.println(new Gson().toJson(asset));
    }

    @Override
    public void visit(Group group) {
        System.out.println(new Gson().toJson(group));
    }

    @Override
    public void visit(User user) {
        System.out.println(new Gson().toJson(user));
    }
}
