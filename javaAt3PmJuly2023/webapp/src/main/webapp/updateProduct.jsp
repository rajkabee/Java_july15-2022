<%@ page isELIgnored="false"%>
<html>
<head>
<title>Index</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h2>Update Product Form</h2>
		<a href="products">products</a>
		<form action="updateProduct" method="post" class="col-9 mt-5 mb-3">
			<input type="hidden" name="id" value="${ product.id }"> 
			<div class="mb-3">
				<label class="form-label">Name</label> <input type="text"
					class="form-control" placeholder="Product Name" name="name" value="${ product.name }">
			</div>
			<div class="mb-3">
				<label class="form-label">Quantity In Stock</label> <input
					type="text" class="form-control" placeholder="Qvailable Quantity"
					name="quantityInStock" value="${ product.quantityInStock }">
			</div>
			<div class="mb-3">
				<label class="form-label">Unit Price</label> <input type="text"
					class="form-control" placeholder="Unit Price" name="unitPrice" value="${ product.unitPrice }">
			</div>
			<input type="submit" value="submit" class="btn btn-success">
		</form>
	</div>
</body>
</html>
