<template>
    <div align="center">
        <h2>상품 상세 설명</h2>
        <product-read v-if="product" :product="product"/>
        <p v-else>로딩중 ....... </p>
        <router-link :to="{ name: 'ProductModifyPage', params: { boardNo } }">
            등록 상품 수정
        </router-link>
        <button @click="onDelete">삭제</button>
        <router-link :to="{ name: 'ProductListPage' }">
            게시물 보기
        </router-link>
    </div>
</template>

<script>

import axios from 'axios'
import { mapActions, mapState } from 'vuex'
import ProductRead from '@/components/product/ProductRead.vue'

export default {
    name: 'ProductReadPage',
    props: {
        boardNo: {
            type: String,
            required: true
        }
    },
    components: {
        ProductRead
    },
    computed: {
        ...mapState(['product'])
    },
    created () {
        this.fetchProduct(this.boardNo)
                .catch(() => {
                    alert('게시물 요청 실패!')
                    this.$router.push()
                })
    },
    methods: {
        ...mapActions(['fetchProduct']),
        onDelete () {
            const { boardNo } = this.product
            axios.delete(`http://localhost:7777/13th/product/${boardNo}`)
                    .then(() => {
                        alert('삭제 성공!')
                        this.$router.push({ name: 'ProductListPage' })
                    })
                    .catch(() => {
                        alert('삭제 실패! 문제 발생!')
                    })
        }
    }
}

</script>