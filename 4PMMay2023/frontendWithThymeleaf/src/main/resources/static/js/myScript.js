function addToCart(id){
	console.log(id)
	let http = new XMLHttpRequest();
	http.onreadystatechange=()=>{
		if(http.readyState == 4 && http.status == 200){
			let data=JSON.parse(http.response);
			document.getElementById("totalItemsBadge").innerHTML=data.totalItems;
		}
	};
	http.open("GET", "/products/addToCart/"+id);
	http.send();

}


function increaseQuantity( id ){
	let http = new XMLHttpRequest();
	console.log(id);
	http.onreadystatechange=()=>{
		if(http.readyState == 4 && http.status == 200){
			let data=JSON.parse(http.response);
			console.log(document.getElementById("totalItemsBadge"));
			document.getElementById("totalItemsBadge").innerHTML=data.totalItems;
			let tbody = document.getElementById("cart-items");
			while(tbody.firstChild){
				tbody.removeChild(tbody.firstChild);
			}
			for(let x of data.items){
				renderCartItem(x);
			}
		}
	};
	http.open("GET", "/cart/increaseQuantity/"+id);
	http.send();
}




function decreaseQuantity(id){
	
	let http = new XMLHttpRequest();
	http.onreadystatechange=()=>{
		if(http.readyState == 4 && http.status == 200){
			let data=JSON.parse(http.response);
			console.log(document.getElementById("totalItemsBadge"));
			document.getElementById("totalItemsBadge").innerHTML=data.totalItems;let tbody = document.getElementById("cart-items");
			while(tbody.firstChild){
				tbody.removeChild(tbody.firstChild);
			}
			for(let x of data.items){
				renderCartItem(x);
			}
			
		}
	};
	http.open("GET", "/cart/decreaseQuantity/"+id);
	http.send();
	
}

function removeItem(id){
	let http = new XMLHttpRequest();
	http.onreadystatechange=()=>{
		if(http.readyState == 4 && http.status == 200){
			let data=JSON.parse(http.response);
			if(data.items.length==0	){
				window.location.replace('/products');
			}
			console.log(document.getElementById("totalItemsBadge"));
			document.getElementById("totalItemsBadge").innerHTML=data.totalItems;let tbody = document.getElementById("cart-items");
			while(tbody.firstChild){
				tbody.removeChild(tbody.firstChild);
			}
			for(let x of data.items){
				renderCartItem(x);
			}
			
		}
	};
	http.open("GET", "/cart/removeItem/"+id);
	http.send();
}

function renderCartElements(){
	let http = new XMLHttpRequest();
	http.onreadystatechange=()=>{
		if(http.readyState == 4 && http.status == 200){
			let data=JSON.parse(http.response);
			if(data.items==null){
				window.localhost.href='/products';
			}
			console.log(document.getElementById("totalItemsBadge"));
			document.getElementById("totalItemsBadge").innerHTML=data.totalItems;let tbody = document.getElementById("cart-items");
			/*while(tbody.firstChild){
				tbody.removeChild(tbody.firstChild);
			}*/
			for(let x of data.items){
				renderCartItem(x);
			}
			
		}
	};
	http.open("GET", "/cart/getCart");
	http.send();
}
					   

function renderCartItem(x){
	let tableRow = document.createElement("tr");
	let imagetd = document.createElement("td");
	imagetd.className="align-middle";
	let imageElement = document.createElement("img");
	imageElement.src='/'+x.imageUrl;
	imageElement.style.height="50px";
	imagetd.appendChild(imageElement);
	let imgText = document.createTextNode(x.name);
	imagetd.appendChild(imgText)
	tableRow.appendChild(imagetd);
	
	
	let pricetd = document.createElement("td");
	pricetd.className="align-middle";
	let priceText = document.createTextNode(x.unitPrice);
	pricetd.appendChild(priceText);
	tableRow.appendChild(pricetd);
	
	let inputgroup = document.createElement("div");
	inputgroup.style.width="100px";
	inputgroup.className = "input-group quantity mx-auto quantityPanel";
	let decrBtndiv = document.createElement("div");
	decrBtndiv.className="input-group-btn";
	let decrBtn = document.createElement("button");
	decrBtn.className="btn btn-sm btn-primary btn-minus";
	decrBtn.onclick=function(){decreaseQuantity(x.id);};
	let decrBtntext = document.createElement("i");
	decrBtntext.className="fa fa-minus";
	decrBtn.appendChild(decrBtntext);
	decrBtndiv.appendChild(decrBtn);
	inputgroup.appendChild(decrBtndiv);
	
	let qtyInput = document.createElement("input");
	qtyInput.className="form-control form-control-sm bg-secondary text-center quantity";
	qtyInput.type="text";
	qtyInput.value=x.quantity;
	inputgroup.appendChild(qtyInput);
	
	let incrBtndiv = document.createElement("div");
	incrBtndiv.className="input-group-btn";
	let incrBtn = document.createElement("button");
	incrBtn.className="btn btn-sm btn-primary btn-plus";
	incrBtn.onclick=function(){increaseQuantity(x.id);};
	let incrBtntext = document.createElement("i");
	incrBtntext.className="fa fa-plus";
	incrBtn.appendChild(incrBtntext);
	incrBtndiv.appendChild(incrBtn);
	inputgroup.appendChild(incrBtndiv);
	
	let quantitytd = document.createElement("td");
	quantitytd.className="align-middle quantityElement";
	quantitytd.appendChild(inputgroup);
	tableRow.appendChild(quantitytd);
	
	let totaltd = document.createElement("td");
	totaltd.className="align-middle";
	let totalText = document.createTextNode(parseFloat(x.unitPrice*x.quantity).toFixed(2));
	totaltd.appendChild(totalText);
	tableRow.appendChild(totaltd);
	
	let removetd = document.createElement("td");
	removetd.className="align-middle";
	let removeBtndiv = document.createElement("div");
	removeBtndiv.className="input-group-btn";
	let removeBtn = document.createElement("button");
	removeBtn.className="btn btn-sm btn-primary";
	let removeBtntext = document.createElement("i");
	removeBtntext.className="fa fa-times";
	removeBtn.appendChild(removeBtntext);
	removeBtn.onclick=function(){removeItem(x.id);};
	removeBtndiv.appendChild(removeBtn);
	removetd.appendChild(removeBtndiv);
	tableRow.appendChild(removetd);
	
	
	document.getElementById("cart-items").appendChild(tableRow);
	console.log("hello");
	
}