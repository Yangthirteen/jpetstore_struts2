<h3>Account Information</h3>

<table>
	<tr>
		<td>First name:</td>
		<td>
			<input type="text" name="account.firstName" value="${account.firstName}"/>
		</td>
	</tr>
	<tr>
		<td>Last name:</td>
		<td>
			<input type="text" name="account.lastName" value="${account.lastName}"/>
		</td>
	</tr>
	<tr>
		<td>Email:</td>
		<td>
			<input type="text" name="account.email" size="40" value="${account.email}"/>
		</td>
	</tr>
	<tr>
		<td>Phone:</td>
		<td>
			<input type="text" name="account.phone" value="${account.phone}"/>
		</td>
	</tr>
	<tr>
		<td>Address 1:</td>
		<td>
			<input type="text" name="account.address1" size="40" value="${account.address1}"/>
		</td>
	</tr>
	<tr>
		<td>Address 2:</td>
		<td>
			<input type="text" name="account.address2" size="40" value="${account.address2}"/>
		</td>
	</tr>
	<tr>
		<td>City:</td>
		<td>
			<input type="text" name="account.city" size="4" value="${account.city}"/>
		</td>
	</tr>
	<tr>
		<td>State:</td>
		<td>
			<input type="text" name="account.state" size="4" value="${account.state}"/>
		</td>
	</tr>
	<tr>
		<td>Zip:</td>
		<td>
			<input type="text" name="account.zip" size="10" value="${account.zip}"/>
		</td>
	</tr>
	<tr>
		<td>Country:</td>
		<td>
			<input type="text" name="account.country" size="15" value="${account.country}"/>
		</td>
	</tr>
</table>

<h3>Profile Information</h3>

<table>
	<tr>
		<td>Language Preference:</td>
		<td>
				<select name="account.languagePreference">
					<option value="english" <c:if test="${account.languagePreference=='english'}"> selected="selected"</c:if>>english</option>
					<option value="japanese" <c:if test="${account.languagePreference=='japanese'}"> selected="selected"</c:if>>japanese</option>
				</select>
		</td>
	</tr>
	<tr>
		<td>Favourite Category:</td>
		<td>
			<select name="account.favouriteCategoryId">
				<option value="FISH" <c:if test="${account.favouriteCategoryId=='FISH'}"> selected="selected"</c:if>>FISH</option>
				<option value="DOGS" <c:if test="${account.favouriteCategoryId=='DOGS'}"> selected="selected"</c:if>>DOGS</option>
				<option value="REPTILES" <c:if test="${account.favouriteCategoryId=='REPTILES'}"> selected="selected"</c:if>>REPTILES</option>
				<option value="CATS" <c:if test="${account.favouriteCategoryId=='CATS'}"> selected="selected"</c:if>>CATS</option>
				<option value="BIRDS" <c:if test="${account.favouriteCategoryId=='BIRDS'}"> selected="selected"</c:if>>BIRDS</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>Enable MyList</td>
		<td>
			<input type="checkbox" name="account.listOption" value="" <c:if test="${account.listOption==true}"> checked="checked"</c:if>/>
		</td>
	</tr>
	<tr>
		<td>Enable MyBanner</td>
		<td>
			<input type="checkbox" name="account.bannerOption" value="" <c:if test="${account.bannerOption==true}"> checked="checked"</c:if>/>
		</td>
	</tr>

</table>
