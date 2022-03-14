<template>
    <div id="board">
        <h2>Vue + Spring 게시판</h2>
        <router-link :to="{ name: 'BoardRegisterPage' }">
            게시물 작성
        </router-link>
        <!-- v-bind:board="boards"와 같으며 아래와 같이 생략 가능 -->
        <board-list :boards="boards"/>
                <!-- board-list<없는 태그지만 로컬 컴포넌트 덕분에 사용 가능하다. -->
    </div>
</template>

<script>

import BoardList from '@/components/board/BoardList.vue'
import { mapState, mapActions } from 'vuex'
//store에 action에 있는 fetchBoardList와 맵핑해라

export default {
    name: 'BoardListPage',
    components: {
        BoardList
    },
    computed: {
        ...mapState(['boards'])
           //State에 있는 boards 값을 this랑 맵핑한다.
        //...<-이건 문법적으로 사용된 것이다.
        //값을 땡겨올 때 computed는 자동으로 동작 함(자바 스크립트는 스레드 베이스니까!)
    },
    //아래 둘만으로는 정보만 있음 ↑computed가 있음으로써 활용할 수 있게 됨
    mounted () {
        this.fetchBoardList()
    },
    methods: { //methods에 적는 것은 실행될 내용
        ...mapActions(['fetchBoardList'])
        //BoardList내용 전체를 가져올 수 있는(호출) 메소드를 만든 것이다.

        //fetchBoardList가 하는 일: BoardList를 가져옴(state에 넘어온 정보를 저장)
    }
}

// web에서 Mapping이란? 해당 값이 다른 값을 가리키도록 하는 것이다.
// 이를 통해 url이 그대로 노출되는 것을 방지하고 보안성을 높이는 것이다.

</script>