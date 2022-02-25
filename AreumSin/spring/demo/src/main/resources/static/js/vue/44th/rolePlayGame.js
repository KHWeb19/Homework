let app = new Vue({
    el: '#app',
    data: {
        list: [
            { id: 1, name: '슬라임', hp: 100 },
            { id: 2, name: '고블린', hp: 200 },
            { id: 3, name: '사슴', hp: 150 },
            { id: 4, name: '리본돼지', hp: 250}
        ],
        name: '일단은 고정값: 키메라다!!!'
    },
    methods: {
        addMonster: function () {
            let max = this.list.reduce(function(a, b) {
                return a > b.id ? a : b.id
            }, 0)

            this.list.push({
                id: max + 1,
                name: this.name,
                hp: 500
            })
        },
        attackMonster: function (index){
            this.list[index].hp -= 10;

        },
        removeMonster: function (index) {
            this.list.splice(index, 1)
        },
        beforeUpdate() {
            console.log("vdom의 변화를 감지하는 루틴")

            let i
            for (let i = 0; i < this.list[i].length; i++) {
                if(this.list[i].hp <= 0){
                    this.list.splice(i, 1)
                }
            }
        }
    }
})