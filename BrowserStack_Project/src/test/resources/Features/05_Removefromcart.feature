Feature:Remove from cart
Scenario:Remove from cart
Given Open homepage in default browser
When click on signin and then login with credentials
And add an item to cart 
And remove the item from cart
Then close the cart 