<template>
  <div>
    <h3>읽기</h3>
    <product-read-form v-if="product" :product="product"></product-read-form>
    <router-link :to="{name: 'ProductModifyPage', params: {productNo}}">수정하기</router-link>
    <button @click="onDelete">삭제</button>
    <router-link :to="{ name: 'ProductListPage'}">게시물 보기</router-link>
  </div>
</template>

<script>
import ProductReadForm from "@/components/product/ProductReadForm";
import {mapActions, mapState} from "vuex";
import axios from "axios";
export default {
  name: "ProductReadPage",
  components: {
    ProductReadForm
  },
  props: { // 이건 ProductListPage에서 가져온거
      productNo: {
        type: String,
        require: true
      }
  },
  computed: {
    ...mapState(['product'])
  },
  methods: {
    ...mapActions(['fetchProduct']),
    onDelete() {
      const {productNo} = this.product
      axios.delete(`http://localhost:7777/homework/${productNo}`)
      .then(() => {
        alert('성공')
        this.$router.push({name: 'ProductListPage'})
      })
      .catch(() => {
        alert('실패')
      })
    }
  },
  created() {
    this.fetchProduct(this.productNo)
      .catch(() => {
        alert('게시물 요청 실패')
        this.$router.push()
      })
  }
}
</script>

<style scoped>

</style>