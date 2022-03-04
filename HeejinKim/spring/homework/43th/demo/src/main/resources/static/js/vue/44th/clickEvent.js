let app = new Vue({
    el: '#app',
    data: {
        count:0
        },
    methods: {//클릭을 했을 때 동작하는 메소드
        increment: function(){
          this.count+=1
        }
        //안방문이 열린 것이 이벤트 발생 ---이벤트 핸들러
        //여기서는 클릭을 하는 것이 이벤트 --- increment 는 이벤트 핸들러

      }

})