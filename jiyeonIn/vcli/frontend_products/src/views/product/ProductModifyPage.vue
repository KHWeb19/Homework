<template>
    <div align="center">
        <h2>게시물 수정</h2>
        <Product-modify v-if="product" :product="product" @submit="onSubmit"/>
    </div>
</template>

<script>
import axios from 'axios'
import { mapState, mapActions } from 'vuex'
import ProductModify from '@/components/product/ProductModify.vue'

    export default {
        name: 'ProductModifyPage',
        components: {
            ProductModify
        },
        props: {
            board_no: {
                type: String,
                required: true
            }
        },
        computed: {
            ...mapState(['product']) 
        },
        methods: {
            ...mapActions([ 'fetchProduct' ]),
            onSubmit (payload) {
                const {writer,product_name, price, content} = payload

                axios.put(`http://localhost:7777/vueproduct/${this.board_no}`, {writer,product_name, price, content})
                        .then((res) => {
                            alert('게시물 수정 성공')
                            this.$router.push(
                                { name: 'ProductReadPage',
                                   params: { board_no: res.data.board_no.toString() }
                                   }
                            )
                        } )
                        .catch(() => {
                            alert('게시물 수정 실패')
                        })
            }
        },
        created () {
            this.fetchProduct(this.board_no)
                    .catch(() => {
                        alert('게시물 조회 실패')
                        this.$router.back()
                    })
        }
    }
</script>