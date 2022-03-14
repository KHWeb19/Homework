<template>
  <div>
    <h2>상품 등록</h2>
    <product-register-form @submit="onSubmit"></product-register-form>
  </div>
</template>

<script>
import ProductRegisterForm from "@/components/product/ProductRegisterForm";
import axios from "axios";

export default {
  name: "ProductRegisterPage",
  components: {
    ProductRegisterForm
  },
  methods: {
    onSubmit(payload) {
      const {title, description, price, writer } = payload

      axios.post('http://localhost:7777/homework/register', {title, description, price, writer})
      .then(() => {
        alert('게시물 등록')

        this.$router.push({
          name: 'ProductListPage'
        })
        .catch(() =>{
          alert('에러 발생')
        })
      })
    }
  }
}
</script>

<style scoped>

</style>