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
            <tr v-if="!boards || (Array.isArray(boards) && boards.length === 0)">
                <td colspan="4">
                    현재 등록된 게시물이 없습니다!
                </td>
            </tr>
            <tr v-else v-for="board in boards" :key="board.board_no">
                <td align="center">
                    {{ board.board_no }}
                </td>
                <td align="left">
                    {{ board.title }}
                </td>
                <td align="right">
                    {{ board.writer }}
                </td>
                <td align="center">
                    {{ board.reg_date }}
                </td>
            </tr>
        </table>
    </div>
</template>

<script>

export default {
    name: 'BoardList',
    props: {
        boards: {
            type: Array //정보를 Array로 전달
        }
    },
    beforeUpdate () {
        console.log('check: ' + this.boards)
    }
}

</script>