let app = new Vue({
    el: '#app',
    data: {
        list: [
            { id: 1, name: '시금치', hp: 10 },
            { id: 2, name: '표고버섯', hp: 15 },
            { id: 3, name: '당근', hp: 8 }
        ],
        name: '랜덤값',
        namelist: ['오이', '브로콜리','가지','깻잎','']
    },
    methods: {
        addMonster: function () {
            let max = this.list.reduce(function(a, b) {
                return a > b.id ? a : b.id
            }, 0)

            this.list.push({
                id:max+1,
                name: this.namelist[Math.ceil(Math.random()*this.namelist.length)-1],
                hp: Math.ceil(Math.random()*10)
            })
        },
        attackMonster: function (index) {
            this.list[index].hp -= 1
        }

    },
    beforeUpdate () {
        console.log('VDOM의 변화를 감지하는 루틴')

        let i
        for (i=0; i< this.list.length; i++) {
            if (this.list[i].hp <= 0) {
                this.list.splice(i,1)
            }
        }
    }
})