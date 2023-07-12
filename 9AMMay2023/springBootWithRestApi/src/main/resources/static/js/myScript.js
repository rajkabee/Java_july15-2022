function addToCart(id) {
	let cart;
	  console.log(id);
	  var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      //console.log(this.responseText);
	      cart=JSON.parse(this.response);
	      document.getElementById("totalCartItems").innerHTML=cart.totalPrice;
	      //console.log(cart.totalPrice);
	    }
	  };
	  xhttp.open("GET", "/products/addToCart/"+id, true);
	  xhttp.send();
	  
}

