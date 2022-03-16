<template>
    <table>
        <!-- v-for: 비슷한 내용을 반복적으로 보여줘야할 때 사용하는 디렉티브
                    배열을 기반으로 리스트를 랜더링 할 수 있다.
            
            아무튼 tr-component를 table에서 실행한다.
         -->
        <tr-component
                v-for="(rowData, index) in tableData"
                :key="index"
                :row-data="rowData"
                :row-index="index"
                :table-data="tableData"
                :turn="turn"
                :winner="winner"
                v-on:updateTurn="updateTurn"
                v-on:updateTableData="updateTableData"
                v-on:updateWinner="updateWinner">
        </tr-component>
    </table>
</template>

<script>
import TrComponent from '@/components/game/concave/TrComponent.vue'
export default {
    data () {
        return {
            propTurn: this.turn,
            propWin: this.winner
        }
    },
    components: {
        TrComponent
    },
    props: {
        tableData: Array,
        turn: String,
        winner: String
    },
    methods: {
        updateTurn (val) {
            this.propTurn = val
            this.$emit('updateTurn', this.propTurn)
        },
        updateTableData () {
            this.$emit('updateTableData')
        },
        updateWinner (val) {
            this.propWin = val
            this.$emit('updateWinner', this.propWin)
        }
    }
}
</script>

<!--
이 코드로 인해 coverflow가 실행되지 않았음
inline 방식은 한 줄 짜리 짤막한 스타일로 구성할 경우 사용함

현재 케이스는 여러개의 이미지가 다중 중첩 형태로 뭉치다보니
처리할 수 없다 판단하고 그냥 0 처리한것 같음

<style>
div {
    display: inline;
}
</style>

style 부분이 전체 적용이 되게 만들어져 있으므로 정말 저런 스타일링이 필요할지라도

style scoped 형식으로 사용하도록 하며 되도록이면 class=”~~~” 형태로 해결하도록 한다.
-->