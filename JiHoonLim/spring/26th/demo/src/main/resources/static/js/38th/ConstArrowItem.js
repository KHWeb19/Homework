const ConstArrowItem = () => {
    const itemArr = [
        {
            name: "Ryzen 5",
            price: 600000,
            quantity: 1,

        },
        {
            name: "DDR6 RAM",
            price: 640000,
            quantity: 2,
        },
    ]

    for(let i = 0; i < 2; i++){
        console.log("name: " + itemArr[i].name + 
            ", price: " + itemArr[i].price +
            "quantity: " + itemArr[i].quantity)
    }
}