//객체가 만들어져 있으면 무조건 참
function EqualTest () {
    let name = "test"

    if (name) {
        console.log("true")
    } else {
        console.log("false")
    }

    //name이란 객체가 존재하기 때문에 true

    if (name == "test") {
        console.log("equal")
    } else {
        console.log("not equal")
    }
    //name이란 객체가 test맞기 때문에 equal
    // 자바에서는 String(문자열) 비교는 equal로 함

    if (name == "go") {
        console.log("equal")
    } else {
        console.log("not equal")
    }

    if (name == null) {
        console.log("equal")
    } else {
        console.log("not equal")
    }

    if (name == true) {
        console.log("equal")
    } else {
        console.log("not equal")
    }

    if (name == undefined) {
        console.log("equal")
    } else {
        console.log("not equal")
    }
}