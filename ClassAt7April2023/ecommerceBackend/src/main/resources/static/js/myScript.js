function addToCart(id){
	console.log("add to cart called.... productId: "+id);
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
           // console.log(this.responseText);
            let data = JSON.parse(this.response);
            //console.log(data.totalPrice);
            document.getElementById("totalCartItems").innerHTML=data.totalPrice;
       }
    };
    xhttp.open("GET", "/products/addToCart/"+id, true);
    xhttp.send();
	
}