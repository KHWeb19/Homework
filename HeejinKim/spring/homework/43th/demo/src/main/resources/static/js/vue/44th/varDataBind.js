let app = new Vue({
    el: '#app',
    data: {
        message: 'Hello Vue.js',
        list: [
            'apple', 'banana', 'tangerine','grape'
        ],
        num: 2 //안쓰면 필드에서 값 뽑아내고 그래야함--알아서 맵핑이 가능함, 배열인덱스까지 맵핑이 됨
    }
})