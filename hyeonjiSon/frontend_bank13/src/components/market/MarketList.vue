<template>
    <div>
<!-- table은 표 만들기, border는 두께 -->
        <table border="1">
            <!-- tr -> row로 가로 -->
            <tr>
                <!-- th 혹은 td는 세로 형태라고 보면됨 -->
                <th align="center" width="80">번호</th>
                <th align="center" width="320">제목</th>
                <th align="center" width="100">판매자</th>
            </tr>
            <!-- list가 비었는지 체크하는 부분임 -->
            <tr v-if="!markets || (Array.isArray(markets) && markets.length === 0)">
                <!-- colspan 은 위쪽의 세로 3개를 하나로 병합함 -->
                <td colspan="3">
                    현재 게시물이 없습니다!
                </td>
            </tr>
            <tr v-else v-for="market in markets" :key="market.productNo">
                <td align="center">
                    {{market.productNo}}
                </td>
                <td align="left">
                    <router-link :to="{ name: 'MarketReadPage',
                                        params: { productNo: market.productNo.toString() } }" >
                        {{market.title}}
                    </router-link>
                </td>
                <td align="center">
                    {{market.seller}}
                </td>
            </tr>
        </table>
    </div>
</template>

<script>
export default {
    name: 'MarketList',
    props: {
        markets: { //markets에 들어온 값은 marketlist
            type: Array
        }
    },
    beforeUpdate () { //업데이트 전에 실행
        console.log('check: ' + this.markets)
    }
}

</script>