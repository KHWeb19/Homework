let app = new Vue({
    el: '#app',
    data: {
        list:[
            {  id: 1, name:'슬라임', hp:100 },
            {  id: 2, name:'사슴', hp:200 },
            {  id: 3, name:'고블린', hp:300 },
            {  id: 4, name:'리본돼지', hp:250 }

        ],
        name:'고정값:슬라임'
    },

   methods: {
        addMonster: function () { //let max를 reduce를 통해 현재 id값이 뭐가 제일 높은지 찾음--push 해서 특정 이름이 오게 집어넣음
            let max = this.list.reduce(function(a, b){
                return a > b.id ? a : b.id
            }, 0)

            //1가 무조건 0이고 아이디1이랑 비교--a가 크면 그대로 있고 b의 아이디가 더 크면 리턴이 됨. 리턴된 것은 ,0)의 위치에 들어가고
            //a값이 1이고 b는 2 이래서 max값이 추가될 떄 마다 상승함

            this.list.push({ //
                id: max + 1,
                name: this.name,
                hp: 300

            })

        },

        removeMonster: function(index) {
                this.list.splice(index, 1)
        },

        attackMonster: function(index) {
                this.list[index].hp -= 10
                  }
            //여기 밑에서 음수로는 못내려감은 여러몬스터에 상대할수 없음

        },
        beforeUpdate (){ //여기서는 처리가 다 같이 가능
            console.log('VDOM 의 변화를 감지하는 루틴')

            let i
            for(i=0 ;i<this.list.length; i++){
              if (this.list[i].hp <= 0) {
                            this.list.splice(i, 1)
              }

            }


        }

})