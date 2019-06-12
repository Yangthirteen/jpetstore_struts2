<%@ include file="../common/IncludeTop.jsp"%>

<div id="Catalog">
	<form action="confirmNewOrder" method="post">

	<table>
		<tr>
			<th colspan=2>Payment Details</th>
		</tr>
		<tr>
			<td>Card Type:</td>
			<td>
				<select name="order.cardType">
					<option value="Visa">Visa</option>
					<option value="MasterCard">MasterCard</option>
					<option value="American Express">American Express</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Card Number:</td>
			<td>
				<input type="text" name="order.creditCard" value="9999 9999 9999 9999"/>*  .Use a fake number!
			</td>
		</tr>
		<tr>
			<td>Expiry Date (MM/YYYY):</td>
			<td><input type="text" name="order.expiryDate" value="12/03"/></td>
		</tr>
		<tr>
			<th colspan=2>Billing Address</th>
		</tr>

		<tr>
			<td>First name:</td>
			<td><input type="text" name="order.billToFirstName" value="${account.firstName}"/></td>
		</tr>
		<tr>
			<td>Last name:</td>
			<td><input type="text" name="order.billToLastName" value="${account.lastName}"/></td>
		</tr>
		<tr>
			<td>Address 1:</td>
			<td><input type="text" name="order.billAddress1" value="${account.address1}" size="40"/></td>
		</tr>
		<tr>
			<td>Address 2:</td>
			<td><input type="text" name="order.billAddress2"value="${account.address2}" size="40"/></td>
		</tr>
		<tr>
			<td>City:</td>
			<td><input type="text" name="order.billCity" value="${account.city}" /></td>
		</tr>
		<tr>
			<td>State:</td>
			<td><input type="text" name="order.billState" size="4" value="${account.state}" /></td>
		</tr>
		<tr>
			<td>Zip:</td>
			<td><input type="text" name="order.billZip" size="10" value="${account.zip}" /></td>
		</tr>
		<tr>
			<td>Country:</td>
			<td><input type="text" name="order.billCountry" size="15" value="${account.country}"/></td>
		</tr>

		<tr>
			<td colspan=2>
				<input type="checkbox" name="shippingAddressRequired"/> Ship to different address...

			</td>
		</tr>

	</table>
	<input type="submit" name="newOrder" value="Continue" />
	</form>
</div>

<%@ include file="../common/IncludeBottom.jsp"%>