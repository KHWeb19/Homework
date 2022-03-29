<template>
    <div align="center">
        <h2>상품 등록</h2>
        <product-register-form @submit="onSubmit"/>
    </div>
</template>

<script>

import ProductRegisterForm from '@/components/product/ProductRegisterForm.vue'
import axios from 'axios'

export default {
    name: 'ProductRegisterPage',
    components: {
        ProductRegisterForm
    },
    methods: {
        onSubmit (payload) {
            const { productName, registrant, viewDetails } = payload
            axios.post('http://localhost:7777/13th/product/register', { productName, registrant, viewDetails })
                    .then(() => {
                        alert('게시물 등록 성공!')

                        this.$router.push({
                            name: 'ProductListPage'
                        })
                    })
                    .catch(() => {
                        alert('문제 발생!')
                    })
        }
    }
}

</script>