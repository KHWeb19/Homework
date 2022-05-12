<template>
    <div>
        <h3>게시물 목록</h3>
        <table border="1">
            <tr>
                <th align="center" width="100">번호</th>
                <th align="center" width="640">제목</th>
                <th align="center" width="150">작성자</th>
                <th align="center" width="240">등록일자</th>
            </tr>
            <tr v-if="!jpaBoards || (Array.isArray(jpaBoards) && jpaBoards.length === 0)">
                <td colspan="4">
                    현재 등록된 게시물이 없습니다!
                </td>
            </tr>
            <tr v-else v-for="jpaBoard in jpaBoards" :key="jpaBoard.boardNo">
                <td align="center">
                    {{ jpaBoard.boardNo }}
                </td>
                <td align="left">
                    <router-link :to="{ name: 'JpaBoardReadPage',
                                        params: { boardNo: jpaBoard.boardNo.toString() } }">
                        {{ jpaBoard.title }}
                    </router-link>
                </td>
                <td align="right">
                    {{ jpaBoard.writer }}
                </td>
                <td align="center">
                    {{ jpaBoard.regDate }}
                </td>
            </tr>
        </table>
    </div>
</template>

<script>
export default {
    name: 'JpaBoardList',
    props: {
      jpaBoards: {
            type: Array
        }
    }
}
</script>