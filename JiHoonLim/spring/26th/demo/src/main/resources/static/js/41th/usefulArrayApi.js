function ArrayApiTest() {
    console.log("JavaScript Array test")

    let arr = ["one", "two", "three"]

    console.log(arr)
    console.log(arr.toString())

    console.log(arr.join("*"))

    console.log("pop 전: " + arr)
    let elem = arr.pop()

    console.log("pop 후: " + arr)
    console.log("뺀 요소: " + elem)

    console.log("push 전: " + arr)
    let len = arr.push("seven")

    console.log("push 후: " + arr)
    console.log("배열 길이 역할: " + len)

    elem = arr.shift()
    console.log("shift 후: " + arr)
    console.log("뺀 요소: " + elem)

    len = arr.unshift("333")
    console.log("unshift 후: " + arr)
    console.log("배열 길이 역할: " + len)

    arr.splice(2, 0, "elem1", "elem2")
    console.log("splice 이후: " + arr)

    arr.splice(2, 2, "elem3", "elem4")
    console.log("splice 이후: " + arr)

    arr.splice(1, 2)
    console.log("splice 이후: " + arr)

    let test = ["four", "five", "six"]

    arr = arr.concat(test)
    console.log("concat 후: " + arr)

    arr = arr.concat("I can add String")
    console.log("concat 후: " + arr)


    let testArr1 = [1, 2]
    let testArr2 = [3, 7]
    arr = arr.concat(testArr1, testArr2)
    console.log("concat 후: " + arr)

    arr = [1, 2, 3, 4, 5, 6, 7]
    let sliceArr = arr.slice(1)
    console.log("slice 후: " + arr)
    console.log("slice 결과: " + sliceArr)

    arr = [1, 2, 3, 4, 5, 6, 7]
    sliceArr = arr.slice(3)
    console.log("slice 후: " + arr)
    console.log("slice 결과: " + sliceArr)
}