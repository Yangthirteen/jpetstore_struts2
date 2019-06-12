package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Account;
import service.AccountService;

import java.util.Map;

public class SaveAccountAction {

    public String saveAccount(){

        Map m = ActionContext.getContext().getSession();
        Account account = (Account) m.get("account");
        AccountService service = new AccountService();
        service.updateAccount(account);
        m.put("account",account);

        return "true";
    }
}
