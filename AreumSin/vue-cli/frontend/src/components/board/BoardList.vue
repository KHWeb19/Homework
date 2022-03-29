<template>
<!-- 컴포넌트들을 어떻게 보여줄것인가를 설계해야한다 -->
  <div>
    <h3>게시물 목록</h3>
    <table border="1">
      <tr>
        <th align="center" width="100">번호</th>
        <th align="center" width="640">제목</th>
        <th align="center" width="150">작성자</th>
        <th align="center" width="240">등록일자</th>
      </tr>

      <tr v-if="!boards || (Array.isArray(boards) && boards.length === 0)">
        <td colspan="4">
          현재 등록된 게시물이 없습니다.
        </td>
      </tr>

      <tr v-else v-for="board in boards" :key="board.boardNo">
        <td>
          {{board.boardNo}}
        </td>

        <td>
          <router-link :to="{name: 'BoardReadPage', params: { boardNo: board.boardNo.toString() }}"></router-link>
          {{board.title}}
        </td>

        <td>
          {{board.writer}}
        </td>

        <td>
          {{board.regDate}}
        </td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: "BoardList",
  props: {
    boards: {
      type: Array
    }
  }
}
</script>

<style scoped>

</style>