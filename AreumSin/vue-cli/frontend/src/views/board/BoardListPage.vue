<template>
  <div id="board">
    <h2> Vue + Spring 게시판</h2>
    <!-- 1. 게시물 작성 2. list 보이도록 -->

    <router-link :to="{ name: 'BoardRegisterPage' }">게시물 작성</router-link>
    <board-list :boards="boards"/>
    <!-- v-bind: board:board="boards"와 같으면 아래와 같이 생략 가능 -->
  </div>
</template>

<script>

import BoardList from "@/components/board/BoardList";
import {mapState, mapActions} from 'vuex'; // state에서 정보를 가지고 온다.

export default {
  name: "BoardListPage",
  components: {
    BoardList
  },
  computed: {
    ...mapState(['boards'])//states에 있는 정보를 가지고 온다.
  },
  mounted(){ // vue 객체가 만들어지고 나서 필요한 정보를 붙일때? 발생한다
    // 그냥 fetchBoardList를 호출한것
    this.fetchBoardList(); // spring쪽으로 url 요청 그 결과를 res로 전달
  },
  methods: {
    ...mapActions(['fetchBoardList']) // 보드 전제 내용을 가져올 수 있는 메서드
  }

}
</script>

<style scoped>

</style>