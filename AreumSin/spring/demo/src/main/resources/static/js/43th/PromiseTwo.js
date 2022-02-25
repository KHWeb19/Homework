/*
const promise = new Promise(function (resolve, reject){
    setTimeout(function (){
        console.log("얘는 그냥 시간 지나면 출력");
        resolve("난 전송 된다.");
    }, 2000)
})
 */

function PromiseTwo () {
    console.log("JavaScript Promise Test"); // ---- 1

    // 이 객체가 만들어지는 시점이 어느 시점이냐가 중요하다.
    const promise = new Promise(function (resolve, reject){
        setTimeout(function (){
            console.log("얘는 그냥 시간 지나면 출력"); // ---- 4
            resolve("난 전송 된다.");
        }, 2000) // ---- 3 (2초를 먼저 대기)
    })

    promise.then(function (response) { //promise가 완료되면 진행해라.
        console.log("응답 !: "+ response) // ---- 5
    })

    console.log("작업 완료 ")// ----  2
}
