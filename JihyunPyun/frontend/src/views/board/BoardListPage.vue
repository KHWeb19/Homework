<template>
    <div id="board">
        <h2>Vue + Spring 게시판</h2>
        <router-link :to="{ name: 'BoardRegisterPage' }">
            게시물 작성
        </router-link>
        <board-list :boards="boards"/>
    </div>
</template>

<script>

import BoardList from '@/components/board/BoardList.vue'
import { mapState, mapActions } from 'vuex'

export default {
    name: 'BoardListPage',
    components: {
        BoardList
    },
    computed: {
        ...mapState(['boards']) //이름 그대로 state와 연결
    },
    mounted () {
        this.fetchBoardList()
    },
    methods: {
        ...mapActions(['fetchBoardList']) 
    }
}

</script>