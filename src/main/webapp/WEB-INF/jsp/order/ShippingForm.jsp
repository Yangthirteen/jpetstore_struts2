<%@ include file="../common/IncludeTop.jsp"%>

<div id="Catalog">
	<form action="confirmNewOrder?order = ${order}">
	<table>
		<tr>
			<th colspan=2>Shipping Address</th>
		</tr>

		<tr>
			<td>First name:</td>
			<td><input type="text" name="order.shipToFirstName" /></td>
		</tr>
		<tr>
			<td>Last name:</td>
			<td><input type="text" name="order.shipToLastName" /></td>
		</tr>
		<tr>
			<td>Address 1:</td>
			<td><input type="text" name="order.shipAddress1" size="40"/></td>
		</tr>
		<tr>
			<td>Address 2:</td>
			<td><input type="text" name="order.shipAddress2" size="40"/></td>
		</tr>
		<tr>
			<td>City:</td>
			<td><input type="text" name="order.shipCity" /></td>
		</tr>
		<tr>
			<td>State:</td>
			<td><input type="text" name="order.shipState" size="4"/></td>
		</tr>
		<tr>
			<td>Zip:</td>
			<td><input type="text" name="order.shipZip" size="10"/></td>
		</tr>
		<tr>
			<td>Country:</td>
			<td><input type="text" name="order.shipCountry" size="15"/></td>
		</tr>
	</table>
		<input type="submit" name="newOrder" value="Continue"/>
	</form>
</div>

<%@ include file="../common/IncludeBottom.jsp"%>