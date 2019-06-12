package web;

import com.opensymphony.xwork2.ActionContext;
import domain.Account;
import org.apache.struts2.ServletActionContext;
import service.AccountService;
import com.opensymphony.xwork2.ActionSupport;


import javax.servlet.http.HttpSession;
import java.util.Map;

public class SignonAction extends ActionSupport {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String checkCode;

    public String getCheckCode()
    {
        return checkCode;
    }

    public void setCheckCode(String checkCode)
    {
        this.checkCode = checkCode;
    }


    public String signon(){

        String msg = null;
        Map m = ActionContext.getContext().getSession();
        m.put("username",username);
        m.put("password",password);

        AccountService accountService = new AccountService();
        Account account = accountService.getAccount(username,password);

        m.put("account",account);


        if(account != null) {

                return "Main";
        }
        else {

            msg="Invalid username or password.  Signon failed";
            m.put("msg",msg);

            return "SignonForm";
        }
    }

    public void validate()
    {
        HttpSession session = ServletActionContext.getRequest().getSession();

        String checkCode2 = (String)session.getAttribute("checkCode");

        if(!checkCode.equals(checkCode2))
        {
            this.addFieldError("Error","你是猪吗？验证码错了");
        }
    }

}
