<template>
    <div align="center">
        <h2>상품 수정</h2>
        <product-modify-form v-if="product" :product="product" @submit="onSubmit"/>
        <p v-else>로딩중 .......</p>
    </div>
</template>

<script>
import axios from 'axios'
import { mapActions, mapState } from 'vuex'
import ProductModifyForm from '@/components/product/ProductModifyForm.vue'

export default {
    name: 'ProductModifyPage',
    components: {
        ProductModifyForm
    },
    props: {
        boardNo: {
            type: String,
            required: true
        }
    },
    computed: {
        ...mapState(['product'])
    },
    methods: {
        ...mapActions(['fetchProduct']),
        onSubmit (payload) {
            const { productName, viewDetails } = payload

            axios.put(`http://localhost:7777/13th/product/${this.boardNo}`, { productName, viewDetails })
                    .then(res => {
                        alert('게시물 수정 성공!')
                        this.$router.push({
                            name: 'ProductReadPage',
                            params: { boardNo: res.data.boardNo.toString() }
                        })
                    })
                    .catch(() => {
                        alert('게시물 수정 실패!')
                    })
        }
    },
    created () {
        this.fetchBoard(this.boardNo)
                .catch(() => {
                    alert('게시물 DB 조회 실패!')
                    this.$router.back()
                })
    }
}

</script>