<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

</head>
<body>
<div class="container">
<h1>Add Product Form</h1>
<form action="addProduct" method="post" class="col-9 mt-5 mb-3">
<div class="mb-3">
  <label  class="form-label">Name</label>
  <input type="text" class="form-control" placeholder="Product Name" name="name">
</div>
<div class="mb-3">
  <label  class="form-label">Quantity In Stock</label>
  <input type="text" class="form-control" placeholder="Qvailable Quantity" name="quantityInStock">
</div>
<div class="mb-3">
  <label  class="form-label">Unit Price</label>
  <input type="text" class="form-control" placeholder="Unit Price" name="unitPrice">
</div>
<input type="submit" value="submit" class="btn btn-success">
</form>
</div>
</body>
</html>