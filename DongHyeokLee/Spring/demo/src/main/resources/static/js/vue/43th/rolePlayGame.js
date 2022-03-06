let app = new Vue({
    el: '#app',
    data: {
        monsterList: [
            { name: '사슴', hp: 100, exp: 10, money: 10},
            { name: '독나방', hp: 200, exp: 20, money: 20},
            { name: '흡혈박쥐', hp: 150, exp: 15, money: 15},
            { name: '거머리', hp: 300, exp: 30, money: 30},
            { name: '두꺼비', hp:500, exp: 50, money: 50},
            { name: '구미호', hp: 1000, exp: 100, money: 100},
            { name: '해태', hp: 2000, exp: 200, money: 200},
            { name: '해룡', hp: 20000, exp: 2000, money: 2000},
            { name: '황룡', hp: 50000, exp: 5000, money: 5000}
        ],
        shopView: false,
        shopListValue: [],
        shopList: [],
        storeItemList: [
            { name: '소드', price: 500, effect: { desc: '물리 공격력 10', pAtk: 10, mAtk: 0}},
            { name: '다크 소드', price: 10000, effect: { desc: '물리 공격력 100', pAtk: 100 , mAtk: 0}},
            { name: '스태프', price: 500, effect: { desc: '마법 공격력 10', pAtk:0, mAtk: 10}},
            { name: '다크 스태프', price: 10000, effect: { desc: '마법 공격력 100',pAtk:0, mAtk: 100}}

        ],
        inventoryView: false,
        myInventory: [],
        myInventoryValue: [],
        filedMonster: [],
        name: "자동 생성",
        characterStatus: {
            level: 1,
            hp: 50,
            mp: 50,
            str: 5,
            dex: 5,
            int: 5,
            wis: 5,
            currentExp: 0,
            requestExp: 10,
            money: 0,
            pAtk: 10,
            mAtk: 5,
            selectJob: "어둠의 마법사" 
        }
    },
    methods: {
        equipItem: function () {
            for(let i = 0; i < this.myInventoryValue.length; i++){
                for(let j = 0; j < this.myInventory.length; j++){
                    if(this.myInventoryValue[i] === j){
                        this.characterStatus.pAtk += this.myInventory[j].effect.pAtk
                        this.characterStatus.mAtk += this.myInventory[j].effect.mAtk
                        break
                    }
                }
            }
            
        },
        calcBuy: function () {
            let tmpSum = 0
            console.log("뭥미")
            for(let i = 0; i < this.shopListValue.length; i++){
                for(let j = 0; j < this.shopList.length; j++){
                    if(this.shopListValue[i] === j){
                        tmpSum += this.shopList[j].price
                        break
                    }
                }
            }
            if(this.characterStatus.money - tmpSum >= 0){
                this.characterStatus.money -= tmpSum

                for(let i = 0; i < this.shopListValue.length; i++){
                    this.myInventory.push({
                        name: this.shopList[this.shopListValue[i]].name,
                        effect: this.shopList[this.shopListValue[i]].effect,
                    })
                }
            }else{
                alert('not enough money')
            }
        

        },
        shuffleShopList: function () {
                if(this.shopView){
                    this.shopListValue = []
                }

                for(let i = 0; i < 10; i++){
                    let randNum = Math.floor(Math.random() * this.storeItemList.length)
                    this.shopList[i] = this.storeItemList[randNum]
                }

        },
        addMonster: function () {
              let max = this.filedMonster.reduce(function(a, b) {
                        return a > b.id ? a : b.id
              }, 0)

                let ranNum = Math.floor(Math.random() * this.monsterList.length)
            this.filedMonster.push({
                  id: max + 1,
                  name: this.monsterList[ranNum].name,
                  hp: this.monsterList[ranNum].hp,
                  exp: this.monsterList[ranNum].exp,
                  money: this.monsterList[ranNum].money

              })
        },
        addManyMonster: function (){
            let i
            for(i = 0; i < 100; i++){
                let max = this.filedMonster.reduce(function(a,b){
                    return a > b.id ? a: b.id
                },0)
            

                let ranNum = Math.floor(Math.random() * this.monsterList.length)
                this.filedMonster.push({
                      id: max + 1,
                      name: this.monsterList[ranNum].name,
                      hp: this.monsterList[ranNum].hp,
                      exp: this.monsterList[ranNum].exp,
                    money: this.monsterList[ranNum].money

            })
        }
    },
        removeMonster: function (index) {
            this.filedMonster.splice(index, 1)
        },
        attackMonster: function (index) {
            this.filedMonster[index].hp -=10
        },
        wideAttackMonster: function (){
            console.log("재가 되어라, 다크 플레임")
            let i
            for(i=0; i < this.filedMonster.length; i++){
                this.filedMonster[i].hp -= parseInt(this.characterStatus.pAtk * 20 + this.characterStatus.mAtk * 40)
            }
            
        }
    },
        beforeUpdate() {
            let i
            for(i = 0; i < this.filedMonster.length; i++) {
                if(this.filedMonster[i].hp <= 0){
                this.characterStatus.money += this.filedMonster[i].money
                this.characterStatus.currentExp += this.filedMonster[i].exp
                this.filedMonster.splice(i,1)
            }
        }

        for(;this.characterStatus.currentExp >= this.characterStatus.requestExp;){
            this.characterStatus.currentExp -= this.characterStatus.requestExp
            
            this.characterStatus.level += 1
            this.characterStatus.requestExp *= 2
            this.characterStatus.hp *= 1.2
            this.characterStatus.mp *= 1.2
            this.characterStatus.pAtk += 3
            this.characterStatus.mAtk += 3
            this.characterStatus.str += 1
            this.characterStatus.dex += 1
            this.characterStatus.int += 1
            this.characterStatus.wis += 1
        }
    }
    

})