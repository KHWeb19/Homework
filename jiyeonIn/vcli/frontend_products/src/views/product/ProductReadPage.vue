<template>
    <div align="center">
        <h2>상품 읽기</h2>
        <product-read v-if="product" :product="product"/>
        <p v-else>로딩중..</p>
        <router-link :to="{ name: 'ProductModifyPage', params: {board_no} }">
            게시물 수정
        </router-link>
        <button @click="onDelete">삭제</button>
        <router-link :to="{ name: 'ProductListPage' }">
            게시물 보기
        </router-link>
    </div>
</template>

<script>

    import axios from 'axios'
    import { mapState, mapActions } from 'vuex'
    import ProductRead from '@/components/product/ProductRead.vue'

    export default {
        name: 'ProductReadPage',
        props: {
            board_no: {
                type: String,
                requested: true
            }
        },
        components: {
            ProductRead
        },
        computed: {
            ...mapState(['product'])
        },
        created () {
            this.fetchProduct(this.board_no)
                    .catch(() => {
                        alert('게시물 보기 실패!')
                        this.$router.push()
                    })
        },
        methods: {
            ...mapActions([ 'fetchProduct' ]),
            onDelete () {
                const { board_no } = this.product
                axios.delete(`http://localhost:7777/vueproduct/${board_no}`)
                        .then(() => {
                            alert('삭제성공')
                            this.$router.push({ name: 'ProductListPage' })
                        })
                        .catch(() => {
                            alert('삭제 실패')
                        })
            }

        }

    }
</script>