<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink">
    <a href="viewProduct?productID=${product.productID}">Return to ${product.productID}</a>
</div>

<div id="Catalog">

<table>
	<tr>
		<td>
			${product.description}
		</td>
	</tr>
	<tr>
		<td>
			<b> ${item.itemID} </b>
		</td>
	</tr>
	<tr>
		<td>
			<b><font size="4">
				${item.attribute1}${item.attribute2}
				${item.attribute3}${item.attribute4}
				${item.attribute5}${product.name}
			</font></b>
		</td>
	</tr>
	<tr>
		<td>
			${product.name}
		</td>
	</tr>
	<tr>
		<td>
			<c:if test="${item.quantity <= 0}">
            Back ordered.
            </c:if>
			<c:if test="${item.quantity > 0}">
      	    ${item.quantity} in stock.
	        </c:if>
		</td>
	</tr>
	<tr>
		<td>
			<fmt:formatNumber value="${item.listPrice}"
			pattern="$#,##0.00" />
		</td>
	</tr>

	<tr>
		<td>
			<a class="Button" href="addItemToCart?workingItemID=${item.itemID}">Add to Cart</a>
		</td>
	</tr>
</table>

</div>

<%@ include file="../common/IncludeBottom.jsp"%>



