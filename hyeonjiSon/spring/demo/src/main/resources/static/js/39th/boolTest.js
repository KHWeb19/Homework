function BoolTest () {
    let emptyObj = {}

    let add = function (a, b) {
        return a + b
    }

//이 예시는 JavaScript의 boolean 테스트라기 보다는
//if else문 출력 예시로 봐야 맞는 거 같다!

    function Vehicle () {
        this.vendor = "Volvo"
        this.mcu = "tms570"
        this.price = 200000000
    }

    Vehicle.prototype.getVendor = function () {
        return this.vendor
    }

    let vehicle = new Vehicle();

    console.log("객체(emptyObj): " + emptyObj)

    if (emptyObj) {
        console.log("true")
    } else {
        console.log("false")
    }

    console.log("객체(add): " + add)

    if (add) {
        console.log("true")
    } else {
        console.log("false")
    }

    console.log("객체(vehicle.vendor): " + vehicle.vendor)

    if (vehicle.vendor) {
        console.log("true")
    } else {
        console.log("false")
    }

    console.log("vehicle prototype getVendor: " + vehicle.getVendor())
    console.log("vehicle.toString: " + vehicle.toString())
}