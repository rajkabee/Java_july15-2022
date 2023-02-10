package snippet;

public class Snippet {
	<h1>Add New Product</h1>
	<form action="addProduct" method="POST">
		<input type="text" name="name" placeholder="Product Name"><br>
		<input type="text" name="description" placeholder="Description"><br>
		<input type="radio" name="inStock" value="true"><label>Is In Stock</label>
		<input type="radio" name="inStock" value="false"><label>Not In Stock</label>
		<br>
		<input type="number" name="price" placeholder="Price"><br>
		<input type="submit" value="Submit">
	</form>
}

