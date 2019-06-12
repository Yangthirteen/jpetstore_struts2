<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink">
	<a href="viewCategory?categoryID=${product.category}">Return to ${product.category}</a>
</div>

<div id="Catalog">

<h2>${product.name}</h2>

<table>
	<tr>
		<th>Item ID</th>
		<th>Product ID</th>
		<th>Description</th>
		<th>List Price</th>
		<th>&nbsp;</th>
	</tr>
	<c:forEach var="item" items="${itemList}">
		<tr>
			<td>
				<a href="viewItem?itemID=${item.itemID}">${item.itemID}</a>
			</td>
			<td>
					${product.productID}
			</td>
			<td>
					${item.attribute1} ${item.attribute2} ${item.attribute3}
			        ${item.attribute4} ${item.attribute5} ${product.name}
			</td>
			<td>
				<fmt:formatNumber value="${item.listPrice}"
				pattern="$#,##0.00" />
			</td>
			<td>
				<a class="Button" href="addItemToCart?workingItemID=${item.itemID}">Add to Cart</a>
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td>
		</td>
	</tr>
</table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>





