package web;

import com.opensymphony.xwork2.ActionContext;

import java.util.Map;

public class SignoffAction {

    public String signoff(){

        Map m = ActionContext.getContext().getSession();
        m.put("account",null);

        return "true";
    }
}
