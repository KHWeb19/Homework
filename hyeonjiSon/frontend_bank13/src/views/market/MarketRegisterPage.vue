<template>
    <div align="center">
        <h2>게시물 작성</h2>
        <market-register-form @submit="onSubmit"/>
    </div>
</template>

<script>
import MarketRegisterForm from '@/components/market/MarketRegisterForm.vue'
import axios from 'axios'
export default {
    name: 'MarketRegisterPage',
    components: {
        MarketRegisterForm
    },
    methods: {
        onSubmit (payload) {
            const { title, content, seller } = payload
            axios.post('http://localhost:7777/13th/market/register', { title, seller, content })
                    .then(() => {
                        alert('게시물 등록 성공!')
                        this.$router.push({
                            name: 'MarketListPage'
                        })
                    })
                    .catch(() => {
                        alert('문제 발생!')
                    })
        }
    }
}
</script>