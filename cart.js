if(document.readyState=='loading'){
    document.addEventListener('DOMContentLoaded',ready)
}else{
    ready()
}

function ready(){
    var removeCartItemButtons=document.getElementsByClassName('product-remove')
console.log(removeCartItemButtons)
for(var i=0; i< removeCartItemButtons.length; i++){
    var button=removeCartItemButtons[i]
    button.addEventListener('click',removeCartItem)
       
    }
}

function removeCartItem(event){
    var buttonClicked=event.target
    buttonClicked.parentElement.parentElement.remove()
    updateCartTotal()
}

function updateCartTotal(){
    var cartItemContainer=document.getElementsByClassName('product')[0]
    var cartRows=cartItemContainer.getElementsByClassName('product-info')
    var total=0
    for (var i=0; i< cartRows.length; i++){
        var cartRows=cartRows[i]
        var priceElement=cartRow.getElementByClassName('product-price')[0]
        var quantityElement=cartRow.getElementsByClassName('product-quantity')[0]
        var price=parseFloat(priceElement.innerText.replace('$',''))
        var quantity=quantityElement.value
        total=total + (price * quantity)

    }
    document.getElementsByClassName('cart-total-price')[0].innerText='$'+total
}