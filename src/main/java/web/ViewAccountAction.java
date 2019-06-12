package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Account;
import service.AccountService;

import java.util.Map;

public class ViewAccountAction {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    public String viewAccount(){

        Map m = ActionContext.getContext().getSession();
        m.put("username",username);
        AccountService service=new AccountService();
        Account account=service.getAccount(username);
        m.put("account",account);

        return "true";
    }
}
