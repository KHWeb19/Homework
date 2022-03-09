<template>
    <div>
        <h3>상품 목록</h3>
        <table border="1">
            <tr>
                <th align="center" width="100">번호</th>
                <th align="center" width="300">상품명</th>
                <th align="center" width="100">가격</th>
                <th align="center" width="100">글쓴이</th>
                <th align="center" width="240">등록일자</th>
            </tr>
            <tr v-if="!products">
                <td colspan="5"> 
                    현재 등록된 게시물이 없습니다.
                </td>
            </tr>
            <tr v-else v-for="product in products" :key="product.board_no">
                <td align="center"> 
                    {{ product.board_no }}
                </td>
                <td align="left">
                    <router-link :to="{ name: 'ProductReadPage',
                                        params: { board_no: product.board_no.toString() } }" >
                    {{ product.product_name }}
                    </router-link>
                </td>
                <td align="center">
                    {{ product.price }}
                </td>
                <td align="center">
                    {{ product.writer }}
                </td>
                <td align="center">
                    {{ product.reg_date }}
                </td>
            </tr>
        </table>
    </div>
</template>

<script>
    export default {
        name: 'ProductList',
        props: {
            products: {
                type: Array
            }
        },
        beforeUpdate () {
        console.log('check: ' + this.boards)
        }
    }
</script>