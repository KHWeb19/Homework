<template>
  <div>
    <form @submit.prevent="onSubmit">
    <table>
      <tr>
        <td>상품 번호</td>
        <td>
          <input type="text" name="productNo" :value="product.productNo" disabled />
        </td>
      </tr>
      <tr>
        <td>상품명</td>
        <td>
          <input type="text" name="title" v-model="title" />
        </td>
      </tr>
      <tr>
        <td>작성자</td>
        <td>
          <input type="text" name="writer" :value="product.writer" disabled/>
        </td>
      </tr>
      <tr>
        <td>가격</td>
        <td>
          <input type="text" name="price" v-model="price"/>
        </td>
      </tr>
      <tr>
        <td>제품 상세 설명</td>
        <td>
          <input type="text" name="description" v-model="description"/>
        </td>
      </tr>
      <tr>
        <td>등록일자</td>
        <td>
          <input type="text" :value="product.regDate" disabled/>
        </td>
      </tr>
    </table>

      <div>
        <button type="submit">수정완료</button>
        <router-link :to="{name: 'ProductReadPage', params: {productNo: product.productNo.toString()} }"></router-link>
      </div>

    </form>
  </div>
</template>

<script>
export default {
  name: "ProductModify",
  props: {
    product: {
      type: Object,
      required: true
    }
  },
  data() {
    return{
      title: '',
      price: '',
      description: ''
    }
  },
  methods: {
    onSubmit() {
      const { title, description, price} = this
      this.$emit('submit', { title, description, price})
    }
  },
  created() {
    this.title = this.product.title
    this.price = this.product.price
    this.description = this.product.description
  }
}
</script>

<style scoped>

</style>