<template>
  <div>
    <h3> 수정 </h3>
    <product-modify v-if="product" :product="product" @submit="onSubmit"></product-modify>
  </div>
</template>

<script>
import ProductModify from "@/components/product/ProductModify";
import {mapActions, mapState} from "vuex";
import axios from "axios";
export default {
  name: "ProductModifyPage",
  components: {
    ProductModify
  },
  props: {
    productNo: {
      type: String,
      required: true
    }
  },
  created() {
    this.fetchProduct(this.productNo)
      .catch(() => {
        alert('실패')
        this.$router.back()
      })
  },
  computed: {
    ...mapState(['product'])
  },
  methods: {
    ...mapActions(['fetchProduct']),
    onSubmit(payload){
      const { title, description, price} = payload

      axios.put(`http://localhost:7777/homework/${this.productNo}`, { title, description, price})
        .then((res) => {
          alert('수정 성공')
          this.$router.push({
            name: 'ProductReadPage',
            params: { productNo: res.data.productNo.toString()}
            //name: 'ProductListPage'
          })
        })
      .catch(() => {
        alert('수정 실패')
      })
    }
  }
}
</script>

<style scoped>

</style>