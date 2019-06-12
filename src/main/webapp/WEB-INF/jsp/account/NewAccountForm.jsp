<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ include file="../common/IncludeTop.jsp"%>

<div id="Catalog">
	<s:form action="addNewAccount" method="post">

	     <h3>User Information</h3>

	     <table>
			<tr>
			    <td>User ID:</td>
			    <td><input type="text" name="account.username"/></td>
		    </tr>
		    <tr>
			    <td>New password:</td>
				<td><input type="text" name="account.password"/></td>
		    </tr>
		    <tr>
			    <td>Repeat password:</td>
			    <td><input type="text" name="repeatedPassword"/></td>
		    </tr>
	      </table>

	      <%@ include file="IncludeAccountFields.jsp"%>

		  <input type="submit" name="newAccount" value="Save Account Information"/>

		<s:token></s:token>
	</s:form>
</div>

<%@ include file="../common/IncludeBottom.jsp"%>