<template>
    <div align="center">
        <h2>게시물 등록</h2>
        <product-register-form @submit="onsubmit"/>
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
            onsubmit (payload) {
                const { product_name, writer, price, content } = payload
                axios.post('http://localhost:7777/vueproduct/register',{ product_name, writer, price, content })
                        .then(() => {
                            alert('게시물 등록 성공!')

                            this.$router.push({ name: 'ProductListPage'})
                        })
                        .catch(() => {
                            alert('문제 발생!')
                        })
            }
        }
    }
</script>