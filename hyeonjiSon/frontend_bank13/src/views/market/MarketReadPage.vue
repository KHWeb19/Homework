<template>
    <div align="center">
        <h2>Market 게시판 읽기</h2>
        <market-read v-if="market" :market="market"/>
        <p v-else>로딩중 ....... </p>
        <router-link :to="{ name: 'MarketModifyPage', params: { productNo } }">
            상품 수정
        </router-link>
        <button @click="onDelete">삭제</button>
        <router-link :to="{ name: 'MarketListPage' }">
            게시판으로 돌아가기
        </router-link>
    </div>
</template>

<script>

import axios from 'axios'
import { mapActions, mapState } from 'vuex'
import MarketRead from '@/components/market/MarketRead.vue'

export default {
    name: 'MarketReadPage',
    props: {
        productNo: {
            type: String,
            required: true
        }
    },
    components: {
        MarketRead
    },
    computed: {
        ...mapState(['market'])
    },
    created () {
        this.fetchMarket(this.productNo)
                .catch(() => {
                    alert('게시물 요청 실패!')
                    this.$router.push()
                })
    },
    methods: {
        ...mapActions(['fetchMarket']),
        onDelete () {
            const { productNo } = this.market
            //alert('지우는 게시물 번호: ' + productNo)
            axios.delete(`http://localhost:7777/13th/market/${productNo}`)
                    .then(() => {
                        alert('삭제 성공!')
                        this.$router.push({ name: 'MarketListPage' })
                    })
                    .catch(() => {
                        alert('삭제 실패! 문제 발생!')
                    })
        }
    }
}
</script>