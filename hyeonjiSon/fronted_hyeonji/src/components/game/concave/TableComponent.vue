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

<style>
div {
    display: inline;
}
</style>