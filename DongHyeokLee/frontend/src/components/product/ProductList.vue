<template>
    <div>
        <h3>상품 목록</h3>
        <table border="1">
            <tr>
                <th align="center" width="100">번호</th>
                <th align="center" width="640">제목</th>
                <th align="center" width="150">상품등록자</th>
                <th align="center" width="240">등록일자</th>
            </tr>
            <tr v-if="!products || (Array.isArray(products) && products.length === 0)">
                <td colspan="4">
                    현재 등록된 게시물이 없습니다!
                </td>
            </tr>
            <tr v-else v-for="product in products" :key="product.boardNo">
                <td align="center">
                    {{ product.boardNo }}
                </td>
                <td align="left">
                    <router-link :to="{ name: 'ProductReadPage', 
                                        params: { boardNo: product.boardNo.toString() } }">
                        {{ product.productName }}
                    </router-link>
                </td>
                <td align="right">
                    {{ product.registrant }}
                </td>
                <td align="center">
                    {{ product.regDate }}
                </td>
            </tr>
        </table>
    </div>
</template>

<script>

export default {
    name: 'ProdcutList',
    props: {
        products: {
            type: Array
        }
    }
   
}

</script>