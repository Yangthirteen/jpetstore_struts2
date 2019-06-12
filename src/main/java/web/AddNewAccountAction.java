package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Account;
import service.AccountService;

import java.util.Map;

public class AddNewAccountAction {

    public Account account = new Account();

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String addNewAccount() {

        Map m = ActionContext.getContext().getSession();
        m.put("account",account);

        AccountService accountService  = new AccountService();
        accountService.insertAccount(account);

        System.out.println("11111111");

        return "true";
    }

}
