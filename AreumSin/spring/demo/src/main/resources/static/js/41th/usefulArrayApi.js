function ArrayApiTest() {
    console.log("javaScript Array")

    let arr = ["one", "two", "three"];

    console.log(arr);
    console.log(arr.toString());
    // 각 원소와 원소 사이에 join()에 있는 정보를 붙이는 역활을 함.
    console.log(arr.join(" * "))

    //
    console.log("pop (요소 뺴기)이전 : "+arr);
    let elem = arr.pop()
    let len = arr;
    console.log(len)
    // 실제로 pop 방식으로 뺴내는것은
    // 물건을 쌓아 올리고 하나씩 뺴는 구조를 생각하면 됨.
    console.log("pop(요소 빼기) 이후 :"+arr);
    console.log(elem);

    console.log("push(집어 넣기) 이전: " +arr);
    let len2 = arr.push("seven");

    console.log("push(집어 넣기) 이후: "+ arr);
    console.log(len2);

    elem = arr.shift()
    console.log(arr);
    console.log(elem);

    len = arr.unshift("333");
    console.log("unshift() 이후 :" + arr);
    console.log("len값: "+len);

    arr.splice(2, 0,"elem3", "elem4");
    console.log(arr);

    arr.splice(2, 1,"elem5", "elem6");
    console.log(arr);

    arr.splice(2, 3);
    console.log(arr);

    arr.splice(1, 2);
    console.log("splice 이후: "+ arr)

    let test = ["four", "five", "six"]

    arr = arr.concat(test)
    console.log("concat 이후: " + arr);


    let testArr1 = [1, 3];
    let testArr2 = [3, 6];

    arr = arr.concat(testArr1, testArr2);
    console.log("concat 이후: " + arr);

    arr = [1, 2, 3, 4, 5, 6, 7];
    let slicedArr = arr.slice(1);

    console.log("slice 이후: "+arr);
    console.log("slice의 결과: "+ slicedArr);

    arr = [1,2,3,4,5,6,7];
    slicedArr = arr.slice(3);
    console.log("slice 이후: "+arr);
    console.log("slice의 결과: "+ slicedArr);
}