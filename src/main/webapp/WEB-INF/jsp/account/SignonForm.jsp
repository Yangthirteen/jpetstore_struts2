<%@ include file="../common/IncludeTop.jsp"%>

<div id="Catalog">
	<%--?account=${account} username=${account.username}--%>
	<form action="signon" method="post">
	    <p>
			Please enter your username and password.
		</p>
	    <div>
		    Username:<input type="text" name="username" value="j2ee"/><br/>
	        Password:<input type="password" name="password" value="j2ee"/><br/>

			<s:textfield name="checkCode" label="VertifyCode"></s:textfield>


			<img src="createImageAction.action" onclick="this.src='createImageAction.action?'+ Math.random()" title="点击图片刷新验证码"/><br>
			<br>
			<span>
			<s:fielderror fieldName="Error" theme="simple" cssStyle="color: red ;margin: 0;padding: 0px"/>
			</span>
		</div>



		<br>
		<input type="submit"  name="login" value="Login"/>
	</form>


	Need a username and password?
	<a href="viewRegister">Register Now!</a>
</div>
<%@ include file="../common/IncludeBottom.jsp"%>




